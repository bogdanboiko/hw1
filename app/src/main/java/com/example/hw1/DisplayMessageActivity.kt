package com.example.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.TextView
import android.widget.Toast

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_activity)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        findViewById<TextView>(R.id.output_text).apply {
            text = message
        }
    }

    fun showToast(view: View) {
        val duration = Toast.LENGTH_SHORT
        val text = findViewById<TextView>(R.id.output_text).text
        val toast = Toast.makeText(applicationContext,text , duration)
        toast.show()
    }
}