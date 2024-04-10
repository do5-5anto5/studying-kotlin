package com.do5_5anto5.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //instatiating an OBJECT that implementes OnSeekBarChangeListener
        val customSBListener = object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                count++
                textResult.text = "Funny grade: $count"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                count++
                textResult.text = "Funny grade: $count"
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}

        }

        seekBar.setOnSeekBarChangeListener(customSBListener)

    }

    fun reset(view: View){
        textResult.text = ""
        seekBar.progress = 0
    }
}


