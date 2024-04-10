package com.do5_5anto5.progressbar

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var progression = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //it is visible on layout css to easily see it when open archyve
        // so so, as I want it invisible on create, do it now
        progressBarCircular.visibility = View.GONE
    }

    fun chargeProgressBar(view: View) {

        val circular = progressBarCircular

        //Horizontal Progress Bar
        this.progression++
        progressBarHorizontal.progress = progression

        //Circular Progress Bar
        progressBarCircular.visibility = View.VISIBLE

        if (progression == 10) progressBarCircular.visibility = View.GONE
    }
}
