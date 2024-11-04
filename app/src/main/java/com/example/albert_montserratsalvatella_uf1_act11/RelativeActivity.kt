package com.example.albert_montserratsalvatella_uf1_act11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        val toLinearLayoutButton: Button = findViewById(R.id.btnToLinearLayout)
        val toConstraintLayoutButton: Button = findViewById(R.id.btnToConstraintLayout)
        val submitButton: Button = findViewById(R.id.btnSubmit)

        submitButton.setOnClickListener {
            Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
        }


        toLinearLayoutButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java)) // Cambia a LinearLayout
        }

        toConstraintLayoutButton.setOnClickListener {
            startActivity(Intent(this, ConstraintActivity::class.java)) // Cambia a ConstraintLayout
        }
    }
}
