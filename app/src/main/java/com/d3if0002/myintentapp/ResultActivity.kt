package com.d3if0002.myintentapp

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.d3if0002.myintentapp.question.QuestionOneActivity
import com.d3if0002.myintentapp.question.QuestionThreeActivity
import com.d3if0002.myintentapp.question.QuestionTwoActivity

class ResultActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var yourAns1: TextView
    private lateinit var yourAns2: TextView
    private lateinit var yourAns3: TextView

    private lateinit var rightAns1: TextView
    private lateinit var rightAns2: TextView
    private lateinit var rightAns3: TextView

    private lateinit var ans1: String
    private lateinit var ans2: String
    private lateinit var ans3: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        setUI()



        checkTheAnswer()

        findViewById<Button>(R.id.share_btn).setOnClickListener(this)
        findViewById<Button>(R.id.finish_btn).setOnClickListener(this)
    }

    private fun setUI() {
        supportActionBar?.title = ""

        ans1 = intent.getStringExtra(QuestionOneActivity.ANSWER_ONE) ?: "null"
        ans2 = intent.getStringExtra(QuestionTwoActivity.ANSWER_TWO) ?: "null"
        ans3 = intent.getStringExtra(QuestionThreeActivity.ANSWER_THREE) ?: "null"

        yourAns1 = findViewById(R.id.your_ans1)
        yourAns2 = findViewById(R.id.your_ans2)
        yourAns3 = findViewById(R.id.your_ans3)

        rightAns1 = findViewById(R.id.right_ans1)
        rightAns2 = findViewById(R.id.right_ans2)
        rightAns3 = findViewById(R.id.right_ans3)

        yourAns1.text = getString(R.string.jawaban_kamu1, ans1)
        yourAns2.text = getString(R.string.jawaban_kamu2, ans2)
        yourAns3.text = getString(R.string.jawaban_kamu3, ans3)
    }

    private fun checkTheAnswer() {
        var count = 0

        val trueColor = Color.parseColor("#00FF00")
        val falseColor = Color.parseColor("#B00020")
        val rightAnswer1 = "Big Black Cock"
        val rightAnswer2 = "Niel"
        val rightAnswer3 = "Sense of humors"

        if (ans1 == rightAnswer1) {
            count++
            yourAns1.setTextColor(trueColor)
        } else {
            yourAns1.setTextColor(falseColor)
            rightAns1.text = getString(R.string.jawaban_benar1, rightAnswer1)
            rightAns1.visibility = View.VISIBLE
        }

        if (ans2 == rightAnswer2) {
            count++
            yourAns2.setTextColor(trueColor)
        } else {
            yourAns2.setTextColor(falseColor)
            rightAns2.text = getString(R.string.jawaban_benar1, rightAnswer2)
            rightAns2.visibility = View.VISIBLE
        }

        if (ans3 == rightAnswer3) {
            count++
            yourAns3.setTextColor(trueColor)
        } else {
            yourAns3.setTextColor(falseColor)
            rightAns3.text = getString(R.string.jawaban_benar1, rightAnswer3)
            rightAns3.visibility = View.VISIBLE
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