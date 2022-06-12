package com.d3if0002.myintentapp.question

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.d3if0002.myintentapp.R
import com.d3if0002.myintentapp.ResultActivity

class QuestionThreeActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val ANSWER_THREE = "answer_three"
    }

    private lateinit var answer: EditText
    private lateinit var answerOne: String
    private lateinit var answerTwo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three)

        answerOne = intent.getStringExtra(QuestionOneActivity.ANSWER_ONE) ?: "null"
        answerTwo = intent.getStringExtra(QuestionTwoActivity.ANSWER_TWO) ?: "null"

        answer = findViewById(R.id.edt_qthree)
        val nextBtn: Button = findViewById(R.id.btn_three)

        nextBtn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.btn_three) {
            var isEmpty = false

            if (answer.text.isEmpty()) {
                answer.error = "Please fill this field."
                isEmpty = true
            }

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ANSWER_THREE, answer.text.toString())
            intent.putExtra(QuestionOneActivity.ANSWER_ONE, answerOne)
            intent.putExtra(QuestionTwoActivity.ANSWER_TWO, answerTwo)

            if (!isEmpty) startActivity(intent)
        }
    }
}