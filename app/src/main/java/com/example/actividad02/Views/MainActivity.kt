package com.example.actividad02.Views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.actividad02.R
import android.widget.Button
import android.widget.TextView
import com.example.actividad02.Logic.Controller

class MainActivity : AppCompatActivity() {
    lateinit var btnInsert: Button
        private set
    lateinit var btnUpdate: Button
        private set
    lateinit var btnDelete: Button
        private set
    lateinit var textViewData: TextView
        private set

    private lateinit var controller: Controller

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //No funcionan los botones y no tengo ni idea de por que.
        //Se supone que esta todo bien.
        btnInsert = findViewById(R.id.btnInsert)
        btnUpdate = findViewById(R.id.btnUpdate)
        btnDelete = findViewById(R.id.btnDelete)
        textViewData = findViewById(R.id.textViewData)

        val dialog = Dialog(this)
        controller = Controller(this, dialog)
        controller.start()
    }
}