package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun enviar(view: View) {
        val i = Intent(this, MenuActivity::class.java)
        i.putExtra("nome", findViewById<EditText>(R.id.nome).text.toString())
        startActivity(i)
    }
}
