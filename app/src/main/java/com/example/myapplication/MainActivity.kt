package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun Butonfonk(view: View )
    {
        val kullaniciverisi=editText.text.toString()
        val intent = Intent(applicationContext,IkinciActivity::class.java)
        intent.putExtra("yollananveri",kullaniciverisi)
        startActivity(intent)



    }
}