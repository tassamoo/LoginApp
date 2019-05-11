package com.example.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    var usernameInput: String = ""
    var passwordInput: String = ""
    var username: String? = null
    var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        login.setOnClickListener() {
            validasiLogin()
        }

    }


    private fun validasiLogin() {

        usernameInput = usr.text.toString()
        passwordInput = pass.text.toString()

        getData()

        when{
            usernameInput.isEmpty() -> usr.error = "can't be empty"
            passwordInput.isEmpty() -> pass.error = "can't be empty"

            else -> {
                if (usernameInput.equals(username) && passwordInput.equals(password)){
                    navigasikeMain3Activity()
                }
            }
        }

    }

    private fun getData(){

        val bundle : Bundle? = intent.extras

        username = bundle?.getString("Username")
        password = bundle?.getString("Password")
    }


    private fun navigasikeMain3Activity() {

        val intent = Intent(this, Main3Activity::class.java)

        val bundle = Bundle()
        bundle.putString("Username", usernameInput)
        bundle.putString("Password", passwordInput)

        intent.putExtras(bundle)
        startActivity(intent)
    }

}