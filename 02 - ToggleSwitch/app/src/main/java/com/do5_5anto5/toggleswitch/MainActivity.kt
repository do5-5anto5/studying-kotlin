package com.do5_5anto5.toggleswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun send(view: View){
        if (switchRemember.isChecked) textResult.text = getString(R.string.text_on)
        else textResult.text = getString(R.string.text_off)
    }
}
