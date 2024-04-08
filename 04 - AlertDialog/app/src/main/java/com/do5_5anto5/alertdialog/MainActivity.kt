package com.do5_5anto5.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openAlertDialog(view: View){

        //instantiating
        val alert = AlertDialog.Builder(this)

        //setting title and message
        alert.setTitle("Alert Dialog ativado")
        alert.setMessage("Mensagem")

        //setting false or true to cancel dialog
        alert.setCancelable(true)

        //setting icon
        alert.setIcon(android.R.drawable.ic_btn_speak_now)

        //set representative behaviors for user's choice on positive button
        alert.setPositiveButton("Yes") { dialog, which ->
            Toast.makeText(
                applicationContext,
                "Executando método ao clicar em 'Yes'",
                Toast.LENGTH_LONG
            ).show()
        }

        //set representative behaviors for user's choice on negative button
        alert.setNegativeButton("No") {dialog, wich ->
            Toast.makeText(
                applicationContext,
                "Executando método ao clicar em 'No'",
                Toast.LENGTH_LONG
            ).show()
        }

        //creating and showing on screen
        alert.create().show()
    }
}
