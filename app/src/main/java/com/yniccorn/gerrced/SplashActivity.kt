package com.yniccorn.gerrced

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(300)
        startActivity(Intent(this, GeneralActivity::class.java))
        finish()


    }
}