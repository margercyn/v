package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Regist : AppCompatActivity() {

    private lateinit var nik : EditText
    private lateinit var email: EditText
    private lateinit var pass: EditText
    private lateinit var pass2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)

        nik = findViewById(R.id.nik)
        email= findViewById(R.id.email)
        pass = findViewById(R.id.pass)
        pass2 = findViewById(R.id.pass2)

        val registerButton: Button = findViewById(R.id.pere2)
        registerButton.setOnClickListener {
            register()
        }
    }

    private fun register() {
        val nickname = nik.text.toString()
        val email = email.text.toString()
        val password = pass.text.toString()
        val repeatPassword = pass2.text.toString()

        if (TextUtils.isEmpty(nickname)) {
            Toast.makeText(this, "Please enter your nickname", Toast.LENGTH_SHORT).show()
            return
        }

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            return
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show()
            return
        }

        if (TextUtils.isEmpty(repeatPassword)) {
            Toast.makeText(this, "Please repeat your password", Toast.LENGTH_SHORT).show()
            return
        }

        if (password!= repeatPassword) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            return
        }
        }
    }
