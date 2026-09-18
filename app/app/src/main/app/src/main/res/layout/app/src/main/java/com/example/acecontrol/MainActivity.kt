package com.example.acecontrol

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val listas = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val lista = findViewById<ListView>(R.id.list)

        // Ejemplo inicial
        listas.add("Lista M3U de prueba")

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            listas
        )

        lista.adapter = adapter

        lista.setOnItemClickListener { _, _, position, _ ->

            Toast.makeText(
                this,
                "Seleccionada: ${listas[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
