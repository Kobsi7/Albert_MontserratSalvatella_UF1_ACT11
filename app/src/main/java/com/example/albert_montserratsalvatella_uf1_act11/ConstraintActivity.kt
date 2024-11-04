package com.example.albert_montserratsalvatella_uf1_act11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)

        val toRelativeLayoutButton: Button = findViewById(R.id.btnToRelativeLayout)
        val toLinearLayoutButton: Button = findViewById(R.id.btnToLinearLayout)
        val submitButton: Button = findViewById(R.id.btnSubmit)

        submitButton.setOnClickListener {
            Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
        }

        toRelativeLayoutButton.setOnClickListener {
            startActivity(Intent(this, RelativeActivity::class.java))
        }

        toLinearLayoutButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
