package com.example.suparbiz

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_employee_module.*
import java.text.SimpleDateFormat
import java.util.*

class EmployeeModule : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_module)
        val toolbar: Toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_arrow_back)
        field5.setOnClickListener(this)
    }

    private fun openDatePicker(){
        val  calendar:Calendar = Calendar.getInstance()
        val setDateSetListener: DatePickerDialog.OnDateSetListener=
                DatePickerDialog.OnDateSetListener { _, year, month, day ->
                    calendar.set(Calendar.YEAR,year)
                    calendar.set(Calendar.MONTH,month)
                    calendar.set(Calendar.DAY_OF_MONTH,day)
                    //date set onn view
                    field5.setText(getReadableDate(calendar))

                }
        DatePickerDialog(this,setDateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show()

    }

    private fun getReadableDate(calendar: Calendar):String{
        val df = SimpleDateFormat("dd/MM/yyyy")
        return df.format(calendar.time)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.field5 -> openDatePicker()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
