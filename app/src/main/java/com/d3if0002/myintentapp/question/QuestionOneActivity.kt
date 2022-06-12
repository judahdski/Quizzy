package com.d3if0002.myintentapp.question

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.d3if0002.myintentapp.R

class QuestionOneActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val ANSWER_ONE = "answer_one"
    }

    private lateinit var answer: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one)

        answer = findViewById(R.id.edt_qone)
        val nextBtn: Button = findViewById(R.id.next_btn)

        nextBtn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.next_btn) {
            var isEmpty = false

            if (answer.text.toString().trim().isEmpty()) {
                answer.error = "Please fill this field."
                isEmpty = true
            }

            val nextIntent = Intent(this, QuestionTwoActivity::class.java)
            nextIntent.putExtra(ANSWER_ONE, answer.text.toString())

            if (!isEmpty) startActivity(nextIntent)
        }
    }
}