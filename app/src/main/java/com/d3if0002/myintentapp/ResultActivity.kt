package com.d3if0002.myintentapp

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.d3if0002.myintentapp.qone.QuestionOneActivity
import com.d3if0002.myintentapp.qthree.QuestionThreeActivity
import com.d3if0002.myintentapp.qtwo.QuestionTwoActivity

class ResultActivity : AppCompatActivity() {

    private lateinit var ans1: String
    private lateinit var ans2: String
    private lateinit var ans3: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        ans1 = intent.getStringExtra(QuestionOneActivity.ANSWER_ONE) ?: "null"
        ans2 = intent.getStringExtra(QuestionTwoActivity.ANSWER_TWO) ?: "null"
        ans3 = intent.getStringExtra(QuestionThreeActivity.ANSWER_THREE) ?: "null"

        findViewById<TextView>(R.id.your_ans2).text = ans1
        findViewById<TextView>(R.id.your_ans3).text = ans2
        findViewById<TextView>(R.id.your_ans1).text = ans3

        checkTheAnswer()
    }

    private fun checkTheAnswer() {
        var count = 0

        if (ans1 == "Big Black Cock") {
            count++
        } else {
            val text = findViewById<TextView>(R.id.right_ans1)
            text.text = "blabla"
            text.visibility = View.VISIBLE
        }

        if (ans2 == "Niel") {
            count++
        } else {
            val text = findViewById<TextView>(R.id.right_ans2)
            text.text = "blablabla"
            text.visibility = View.VISIBLE
        }

        if (ans3 == "Niel") {
            count++
        } else {
            val text = findViewById<TextView>(R.id.right_ans3)
            text.text = "blablabla"
            text.visibility = View.VISIBLE
        }

        findViewById<TextView>(R.id.score_indicator).text = count.toString()
    }
}