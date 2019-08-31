package com.example.suparbiz

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_crm.*
import kotlinx.android.synthetic.main.activity_employee.*

class CrmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crm)
        b2.setOnClickListener {
            val i = Intent(this,AddLeads::class.java)
            startActivity(i)
        }
        b1.setOnClickListener {
            val i = Intent(this,AddCustomer::class.java)
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
