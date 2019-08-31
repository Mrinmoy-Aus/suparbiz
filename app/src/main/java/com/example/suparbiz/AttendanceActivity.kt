package com.example.suparbiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_attendance.*

class AttendanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance)
        attendance.setOnClickListener {
            val i = Intent(this,AttendanceModule::class.java)
            startActivity(i)
        }
        sheet.setOnClickListener {
            val i = Intent(this,SheetModule::class.java)
            startActivity(i)
        }

        val toolbar: Toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_arrow_back)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
