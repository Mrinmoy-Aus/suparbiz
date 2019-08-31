package com.example.suparbiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_login.*

class ActivityLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login_btn.setOnClickListener {
            if(username111.text.toString().equals("superbiz@gmail.com") && password111.text.toString().equals("password"))
            {
                Toast.makeText(this,"Login Successfull",Toast.LENGTH_SHORT).show()
                val i = Intent(this,Main2Activity::class.java)
                this.finish()
                startActivity(i)
            }
            else
            {
                    Toast.makeText(this,"Invalid login credintals",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
