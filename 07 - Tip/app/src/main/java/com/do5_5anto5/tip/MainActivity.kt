package com.do5_5anto5.tip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var listener = object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val inputValue = editTextValue.text.toString()

                count = progress
                textPercentage.text = "$count%"

                textTipResult.text = tipValue(inputValue, count)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                val inputValue = editTextValue.text.toString()
                textTotalResult.text = totalResult(inputValue, count)
            }

        }

        seekBar.setOnSeekBarChangeListener(listener)
    }

    fun tipValue (inputValue: String, count: Int): String{
        val value = if (inputValue == "") 0.0   else inputValue.toDouble()
        return "R$  ${value * count / 100}"
    }

    fun totalResult(inputValue: String, count: Int): String{
        val value = if (inputValue == "") 0.0   else inputValue.toDouble()
        return "R$  ${(value * count / 100) + inputValue.toDouble()}"
    }

}
