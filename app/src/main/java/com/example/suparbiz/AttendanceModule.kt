package com.example.suparbiz

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.DatePicker
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_attendance_module.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class AttendanceModule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance_module)
        val calender: Calendar = Calendar.getInstance()
        val currentDate: String = DateFormat.getDateInstance().format(calender.time)
        date_text_view.setText(currentDate)
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


