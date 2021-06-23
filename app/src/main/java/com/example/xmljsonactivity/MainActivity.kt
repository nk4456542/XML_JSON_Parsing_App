package com.example.xmljsonactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun parseXML(v: View?){
        var i = Intent(application,ParsingActivity::class.java)
        i.putExtra("type","xml")
        startActivity(i)
    }

    fun parseJSON(v:View?){
        var i = Intent(application,ParsingActivity::class.java)
        i.putExtra("type","json")
        startActivity(i)
    }
}