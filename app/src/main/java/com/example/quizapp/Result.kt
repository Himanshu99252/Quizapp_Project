package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {

    private lateinit var congo: TextView
    private lateinit var score: TextView
    protected lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        congo = findViewById(R.id.congo)
        score = findViewById(R.id.Score)
        button = findViewById(R.id.Button)

        val userName = intent.getStringExtra(setData.name)
        val scoreValue = intent.getStringExtra(setData.score)
        val totalQuestion = intent.getIntExtra("total_size",5)

        congo.text = "Congratulations ${userName} !!"
        score.text = "$scoreValue / $totalQuestion"
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
