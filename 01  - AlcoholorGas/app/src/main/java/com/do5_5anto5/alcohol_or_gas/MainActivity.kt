package com.do5_5anto5.alcohol_or_gas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calc(view: View) {
        try {
            val alcoholPrice = editTextAlcohol.text.toString().toDouble()
            val gasPrice = editTextGas.text.toString().toDouble()

            val result = alcoholPrice / gasPrice

            if (result >= 0.7) textResult.text = "é melhor usar gasolina"
            else textResult.text = "é melhor usar álcool"

        } catch (e: Exception) {
            e.printStackTrace()
            textResult.text = getString(R.string.exception_message)
        }
    }

}
