package com.example.loginapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*


class Main3Activity : AppCompatActivity() {

    var username: String? = null
    var password: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        getData()

    }

    private fun getData() {
        val bundle: Bundle? = intent.extras

        username = bundle?.getString("Username")
        password = bundle?.getString("Password")

        txtusername.text = username

    }

}

