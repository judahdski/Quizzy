package com.d3if0002.myintentapp.question

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.d3if0002.myintentapp.R

class QuestionTwoActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val ANSWER_TWO = "answer_two"
    }

    private lateinit var answer: EditText
    private lateinit var answerOne: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two)

        answerOne = intent.getStringExtra(QuestionOneActivity.ANSWER_ONE) ?: "null"

        answer = findViewById(R.id.edt_two)
        val nextBtn: Button = findViewById(R.id.next_btn_two)

        nextBtn.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        if (p0?.id == R.id.next_btn_two) {
            var isEmpty = false

            if (answer.text.toString().trim().isEmpty()) {
                answer.error = "Please fill this field."
                isEmpty = true
            }

            val nextIntent = Intent(this, QuestionThreeActivity::class.java)
            nextIntent.putExtra(ANSWER_TWO, answer.text.toString())
            nextIntent.putExtra(QuestionOneActivity.ANSWER_ONE, answerOne)

            if (!isEmpty) startActivity(nextIntent)
        }
    }
}