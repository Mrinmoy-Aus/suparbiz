package com.example.suparbiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager


class SplashActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)//hiding title bar of this activity
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)//making this activity full screen
        setContentView(R.layout.activity_splash2)
        Handler().postDelayed({
            val i = Intent(this,ActivityLogin::class.java)
            this.finish()
            startActivity(i)
        },5000)
    }
}
