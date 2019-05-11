package com.example.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Savepoint

class MainActivity : AppCompatActivity() {

    var usernameInput: String = ""
    var passwordInput: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        daftar.setOnClickListener() {
            validasiInput()
        }
    }

    private fun validasiInput () {

        usernameInput = edtusr.text.toString()
        passwordInput = edtpass.text.toString()

        when{

            usernameInput.isEmpty()-> edtusr.error = "can't be empty"
            passwordInput.isEmpty()-> edtpass.error = "can't be empty"

            else -> {

                tampilToast("tidak bisa mendaftar")

                navigasikeactivity2()

            }

        }
    }

    private fun navigasikeactivity2() {

        val intent = Intent(this, Main2Activity::class.java)

        val bundle = Bundle()
        bundle.putString("Username", usernameInput)
        bundle.putString("Password", passwordInput)

        intent.putExtras(bundle)
        startActivity(intent)


    }

    private fun tampilToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT)
    }



}
