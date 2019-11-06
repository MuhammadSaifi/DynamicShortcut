package com.example.dynamicshortcut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // if our app have extra data then it display as no data

        display.text = "No Data"
        // means it will hold our shortcut data
        // if our intent have extra data then it will get
        if(intent.hasExtra("data")){
            display.text = intent.getStringExtra("data")
        }
    }
}
