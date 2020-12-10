package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private  lateinit var etFirst: EditText
    private  lateinit var  etSecond: EditText
    private  lateinit var btnCalculate:Button
    private  lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirst=findViewById(R.id.etFirst)
        etSecond=findViewById(R.id.etSecond)
        btnCalculate=findViewById(R.id.btnCalculate)
        tvResult=findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
        if (validationText()) {
            retrieveValues()
        }
        }
    }
    private fun retrieveValues(){
        //retrive values from edit text
        val first:Int = etFirst.text.toString().toInt()
        val second:Int = etSecond.text.toString().toInt()
        addAnother(first, second)
    }

    //function with no return types
    private fun addAnother(first: Int, second: Int){
        val result = first + second
        tvResult.text = result.toString()
    }

    private fun validationText(): Boolean{
        var flag = true
        if(TextUtils.isEmpty(etFirst.text)){
            etFirst.error="Please enter first Number"
            etFirst.requestFocus()
            flag = false
        }
        else if(TextUtils.isEmpty(etSecond.text)){
            etSecond.error="Please enter first Number"
            etSecond.requestFocus()
            flag = false
        }
        return flag
    }
}