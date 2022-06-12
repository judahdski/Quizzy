package com.d3if0002.myintentapp.question

import android.content.Intent
import android.os.Bundle
import android.util.Log
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

    private lateinit var firstAnsBtn: Button
    private lateinit var secondAnsBtn: Button
    private lateinit var thirdAnsBtn: Button

    private lateinit var ans1: String
    private lateinit var ans2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three)

        ans1 = intent.getStringExtra(QuestionOneActivity.ANSWER_ONE)?: "datanya tidak ada1"
        ans2 = intent.getStringExtra(QuestionTwoActivity.ANSWER_TWO)?: "datanya tidak ada2"

        firstAnsBtn = findViewById(R.id.first_ans_btn3)
        secondAnsBtn = findViewById(R.id.second_ans_btn3)
        thirdAnsBtn = findViewById(R.id.third_ans_btn3)

        firstAnsBtn.setOnClickListener(this)
        secondAnsBtn.setOnClickListener(this)
        thirdAnsBtn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var value = ""

        when (p0?.id) {
            R.id.first_ans_btn3 -> value = "jawaban1 dari pertanyaan3"
            R.id.second_ans_btn3 -> value = "jawaban2 dari pertanyaan3"
            R.id.third_ans_btn3 -> value = "jawaban3 dari pertanyaan3"
        }

        val intent = Intent(this@QuestionThreeActivity, ResultActivity::class.java)
        /*
            get the answer from Q1
         */
        intent.putExtra(QuestionOneActivity.ANSWER_ONE, ans1)
        /*
            get the answer from Q2
         */
        intent.putExtra(QuestionTwoActivity.ANSWER_TWO, ans2)
        /*
            get the answer from Q3
         */
        intent.putExtra(ANSWER_THREE, value)

        this.startActivity(intent)
    }
}