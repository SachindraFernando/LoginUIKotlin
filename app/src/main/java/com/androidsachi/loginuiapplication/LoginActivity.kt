package com.androidsachi.loginuiapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent

class LoginActivity : AppCompatActivity() {
    lateinit var mLoginBtn: Button
    lateinit var mCreateUser: TextView
    lateinit var mLoginEmail: EditText
    lateinit var mLoginPass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mLoginBtn = findViewById(R.id.button)
        mCreateUser = findViewById(R.id.textView)
        mLoginEmail = findViewById(R.id.editText)
        mLoginPass =  findViewById(R.id.editText2)

        mLoginBtn.setOnClickListener {
            val intent = Intent(applicationContext , RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
