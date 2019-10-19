package com.androidsachi.loginuiapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    lateinit var mLoginBtn1: Button
    lateinit var mLoginEmail1: EditText
    lateinit var mLoginPass1: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mLoginBtn1 = findViewById(R.id.button2)
        mLoginEmail1 = findViewById(R.id.editText3)
        mLoginPass1 =  findViewById(R.id.editText4)
    }
}
