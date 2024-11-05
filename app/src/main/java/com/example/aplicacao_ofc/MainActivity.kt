package com.example.aplicacao_ofc

import PersonagemDao
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import up.ddm.data.AppDatabase

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = AppDatabase.getDatabase(this)


        val playButton = findViewById<Button>(R.id.button_play)
        val config = findViewById<Button>(R.id.button_config)

        playButton.setOnClickListener{
            val intent = Intent(this, CharacterCreation::class.java)
            startActivity(intent)
        }

    }
}


