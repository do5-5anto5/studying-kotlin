package com.do5_5anto5.toast

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openToast(view: View){

        //creating an ImageView object right there, in MainActivity to show it on Toast
        val image = ImageView(applicationContext)
        image.setImageResource(android.R.drawable.star_big_off)

        //creating an ImageView object right there, in MainActivity to show it on Toast
        val text: TextView = TextView(applicationContext)
        text.text = "Custom Toast"

        val toast = Toast(applicationContext)
        toast.duration = Toast.LENGTH_LONG
        toast.view = image
//        toast.view = text
        toast.show()

        /*
        //this is a default Toast implementation
        Toast.makeText(
            applicationContext,
            "Ação realizada com sucesso",
            Toast.LENGTH_SHORT
        ).show()
         */
    }
}
