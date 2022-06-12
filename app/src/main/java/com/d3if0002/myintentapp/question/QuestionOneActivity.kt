package com.d3if0002.myintentapp.question

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.d3if0002.myintentapp.R

class QuestionOneActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val ANSWER_ONE = "answer_one"
    }

    private lateinit var firstAnsBtn: Button
    private lateinit var secondAnsBtn: Button
    private lateinit var thirdAnsBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one)

        firstAnsBtn = findViewById(R.id.first_ans_btn1)
        secondAnsBtn = findViewById(R.id.second_ans_btn1)
        thirdAnsBtn = findViewById(R.id.third_ans_btn1)

        firstAnsBtn.setOnClickListener(this)
        secondAnsBtn.setOnClickListener(this)
        thirdAnsBtn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var value = ""

        when (p0?.id) {
            R.id.first_ans_btn1 -> {
                value = "Jawaban1 dari pertanyaan1"
            }
            R.id.second_ans_btn1 -> {
                value = "Jawaban2 dari pertanyaan1"
            }
            R.id.third_ans_btn1 -> {
                value = "Jawaban3 dari pertanyaan1"
            }
        }

        val intent = Intent(this@QuestionOneActivity, QuestionTwoActivity::class.java)
        /*
            get the answer from Q1
         */
        intent.putExtra(ANSWER_ONE, value)

        this.startActivity(intent)
    }
}