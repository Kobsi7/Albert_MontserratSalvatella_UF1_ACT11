package com.example.albert_montserratsalvatella_uf1_act11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton: Button = findViewById(R.id.btnSubmit)
        val toRelativeLayoutButton: Button = findViewById(R.id.btnToRelativeLayout)
        val toConstraintLayoutButton: Button = findViewById(R.id.btnToConstraintLayout)

        submitButton.setOnClickListener {
            Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
        }

        toRelativeLayoutButton.setOnClickListener {
            startActivity(Intent(this, RelativeActivity::class.java))
        }

        toConstraintLayoutButton.setOnClickListener {
            startActivity(Intent(this, ConstraintActivity::class.java))
        }
    }
}
