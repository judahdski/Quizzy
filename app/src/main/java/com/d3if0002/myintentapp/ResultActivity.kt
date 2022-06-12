package com.d3if0002.myintentapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.d3if0002.myintentapp.question.QuestionOneActivity
import com.d3if0002.myintentapp.question.QuestionThreeActivity
import com.d3if0002.myintentapp.question.QuestionTwoActivity

class ResultActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var ans1: String
    private lateinit var ans2: String
    private lateinit var ans3: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.title = ""

        ans1 = intent.getStringExtra(QuestionOneActivity.ANSWER_ONE) ?: "null"
        ans2 = intent.getStringExtra(QuestionTwoActivity.ANSWER_TWO) ?: "null"
        ans3 = intent.getStringExtra(QuestionThreeActivity.ANSWER_THREE) ?: "null"

        findViewById<TextView>(R.id.your_ans1).text = getString(R.string.jawaban_kamu1, ans1)
        findViewById<TextView>(R.id.your_ans2).text = getString(R.string.jawaban_kamu2, ans2)
        findViewById<TextView>(R.id.your_ans3).text = getString(R.string.jawaban_kamu3, ans3)

        checkTheAnswer()

        findViewById<Button>(R.id.share_btn).setOnClickListener(this)
        findViewById<Button>(R.id.finish_btn).setOnClickListener(this)
    }

    private fun checkTheAnswer() {
        var count = 0

        val rightAns1 = "Big Black Cock"
        val rightAns2 = "Niel"
        val rightAns3 = "Sense of humors"

        if (ans1 == rightAns1) {
            count++
        } else {
            val rightAns = findViewById<TextView>(R.id.right_ans1)
            rightAns.text = getString(R.string.jawaban_benar1, rightAns1)
            rightAns.visibility = View.VISIBLE
        }

        if (ans2 == rightAns2) {
            count++
        } else {
            val rightAns = findViewById<TextView>(R.id.right_ans2)
            rightAns.text = getString(R.string.jawaban_benar1, rightAns2)
            rightAns.visibility = View.VISIBLE
        }

        if (ans3 == rightAns3) {
            count++
        } else {
            val rightAns = findViewById<TextView>(R.id.right_ans3)
            rightAns.text = getString(R.string.jawaban_benar1, rightAns3)
            rightAns.visibility = View.VISIBLE
        }

        findViewById<TextView>(R.id.score_indicator).text = getString(R.string.score, count.toString())
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.share_btn -> {
                // implicit intent
            }

            R.id.finish_btn -> {
                // explicit intent
            }
        }
    }
}