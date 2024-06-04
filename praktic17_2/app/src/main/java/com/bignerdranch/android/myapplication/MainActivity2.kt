package com.bignerdranch.android.myapplication

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {

    val MY_SETTING = "my_setting"
    lateinit var pref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pref =getSharedPreferences(MY_SETTING, MODE_PRIVATE)
        val ed = pref.edit()
        var count = pref.getInt("Count", 1)

        if(count % 2 == 0)
        {
            findViewById<TextView>(R.id.textview).text = count.toString()
        }
        else findViewById<TextView>(R.id.textview).text = "0"
        count++

        ed.putInt("Count", count)
        ed.commit()
    }
}