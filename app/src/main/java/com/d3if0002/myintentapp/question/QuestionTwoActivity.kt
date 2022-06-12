package com.d3if0002.myintentapp.question

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.d3if0002.myintentapp.R

class QuestionTwoActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val ANSWER_TWO = "answer_two"
    }

    private lateinit var firstAnsBtn: Button
    private lateinit var secondAnsBtn: Button
    private lateinit var thirdAnsBtn: Button

    private lateinit var ans1: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two)

        ans1 = intent.getStringExtra(QuestionOneActivity.ANSWER_ONE) ?: "null"

        firstAnsBtn = findViewById(R.id.first_ans_btn2)
        secondAnsBtn = findViewById(R.id.second_ans_btn2)
        thirdAnsBtn = findViewById(R.id.third_ans_btn2)

        firstAnsBtn.setOnClickListener(this)
        secondAnsBtn.setOnClickListener(this)
        thirdAnsBtn.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        var value = ""

        when(p0?.id) {
            R.id.first_ans_btn2 -> value = "jawaban1 dari pertanyaan2"
            R.id.second_ans_btn2 -> value = "jawaban2 dari pertanyaan2"
            R.id.third_ans_btn2 -> value = "jawaban3 dari pertanyaan2"
        }

        val intent = Intent(this@QuestionTwoActivity, QuestionThreeActivity::class.java)
        /*
            get the answer from Q1
         */
        intent.putExtra(QuestionOneActivity.ANSWER_ONE, ans1)
        /*
            get the answer from Q2
         */
        intent.putExtra(ANSWER_TWO, value)

        this.startActivity(intent)
    }
}