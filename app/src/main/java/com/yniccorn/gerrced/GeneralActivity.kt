package com.yniccorn.gerrced

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import com.trident.library.BackObject
import com.trident.library.callbacks.BackObjectCallback

import com.yniccorn.gerrced.playable.MainActivity

class GeneralActivity : AppCompatActivity(), BackObjectCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.statusBarColor = ContextCompat.getColor(this, R.color.main)

        BackObject.setup(appsflyerId = "acoPSruFKjkBHDJSSnhnuF", oneSignalId = "48c804f0-7759-4b9c-87a6-aa9236c86cad", activity = this)

    }



    override fun startGame() {
        Log.d("library", " started from callback")
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}