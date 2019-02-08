package com.moviles.proyecto

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

     fun irARegistrarUsuario(){
      val intent = Intent(this, RegistrarUsuarioActivity::class.java)
         startActivity(intent)
     }
}
