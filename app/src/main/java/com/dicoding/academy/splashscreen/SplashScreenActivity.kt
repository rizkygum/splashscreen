package com.dicoding.academy.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler = Handler()

        handler.postDelayed({
            var mainIntent = Intent(this@SplashScreenActivity, MainActivity::class.java )
            startActivity(mainIntent)
            finish()
        }, 5000)

    }
}