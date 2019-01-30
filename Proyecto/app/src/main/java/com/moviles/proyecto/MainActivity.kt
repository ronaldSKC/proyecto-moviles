package com.moviles.proyecto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_http.setOnClickListener {
            this.irActivityHttp()
        }
    }
    fun irActivityHttp (){
        val intentHttp = Intent(this, HttpActivity::class.java)
        startActivity(intentHttp)
    }
}
