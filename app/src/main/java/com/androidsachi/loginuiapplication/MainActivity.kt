package com.androidsachi.loginuiapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mLoginBtn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLoginBtn2 = findViewById(R.id.button3)

        mLoginBtn2.setOnClickListener{
            val intent = Intent(applicationContext , LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}

