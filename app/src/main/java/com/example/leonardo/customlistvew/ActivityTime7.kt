package com.example.leonardo.customlistvew

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityTime7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time7)

        val button1 = findViewById (R.id.button) as Button
        button1.setOnClickListener {
            val mp = MediaPlayer.create (this, R.raw.hinoman)
            mp.start ()
        }
    }
}
