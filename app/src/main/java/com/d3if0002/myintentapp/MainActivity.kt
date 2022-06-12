package com.d3if0002.myintentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.d3if0002.myintentapp.question.QuestionOneActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.start_btn).setOnClickListener {
            val intent = Intent(this, QuestionOneActivity::class.java)
            startActivity(intent)
        }
    }
}