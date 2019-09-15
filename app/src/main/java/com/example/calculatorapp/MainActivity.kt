package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
import android.view.View
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(view: View) {

            when (view.id) {
            R.id.btn1 -> {


            }
            R.id.plusBtn -> {
                var value1 = number1.text.toString().toFloat()
                    var value2 = number1.text.toString().toFloat()
                    number1.setText("${value1 + value2}")
            }
            R.id.subtractBtn -> {
                var value1 = Integer.parseInt(number1.text.toString())
                var value2 = number1.text.toString().toFloat()
                number1.setText("${value1 - value2}")
            }
            R.id.divideBtn -> {
                var value1 = Integer.parseInt(number1.text.toString())
                var value2 = number1.text.toString().toFloat()
                number1.setText("${value1 / value2}")

            }
            R.id.multiplyBtn -> {
                var value1 = Integer.parseInt(number1.text.toString())
                var value2 = number1.text.toString().toFloat()
                number1.setText("${value1 * value2}")
            }
            R.id.buttonroot ->{
                var value1 = number1.text.toString().toFloat()
                number1.setText("${sqrt(value1.toDouble())}")
            }
            R.id.btnPercent -> {
                var value1 = Integer.parseInt(number1.text.toString())
                number1.setText("${value1 % 100}")
            }

            R.id.btnPT->{
                number1.append(".")
            }
            R.id.btnC ->{
                number1.setText("")
            }
            R.id.btnReciprocal ->{
                var value1 = Integer.parseInt(number1.text.toString())
                number1.setText("${1/value1}")
            }
            R.id.btnSQ->{
                var value1 = Integer.parseInt(number1.text.toString())
                number1.setText("${value1*value1}")
            }
            R.id.btn0->{
                number1.append(btn0.text)
            }
            R.id.btn1D->{
                number1.append(btn1D.text)
            }
            R.id.btn2->{
                number1.append(btn2.text)
            }
            R.id.btn3->{
                number1.append(btn3.text)
            }
            R.id.btn4->{
                number1.append(btn4.text)
            }
            R.id.btn5->{
                number1.append(btn5.text)
            }
            R.id.btn6->{
                number1.append( btn6.text)
            }
            R.id.btn7->{
                number1.append(btn7.text)
            }
            R.id.btn8->{
                number1.append(btn8.text)
            }
            R.id.btn9->{
                number1.append(btn9.text)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        btn1.setOnClickListener {
//            Log.i("TEXT", "Display Text ${et1.text}")
//
//        }
        btn1.setOnClickListener(this)
        plusBtn.setOnClickListener(this)
        subtractBtn.setOnClickListener(this)
        divideBtn.setOnClickListener(this)
        multiplyBtn.setOnClickListener(this)
        buttonroot.setOnClickListener(this)
        btn1.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn1D.setOnClickListener(this)
        btn0.setOnClickListener(this)
        btnPT.setOnClickListener(this)
        btnC.setOnClickListener(this)
        btnPercent.setOnClickListener(this)
        btnSQ.setOnClickListener(this)
        btnReciprocal.setOnClickListener(this)
    }
}




