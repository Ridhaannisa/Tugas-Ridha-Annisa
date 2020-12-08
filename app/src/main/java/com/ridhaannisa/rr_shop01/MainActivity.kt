package com.ridhaannisa.rr_shop01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbl_nama = findViewById<TextView>(R.id.lbl_nama)
        val lbl_pengikut_count = findViewById<TextView>(R.id.lbl_pengikut_count)
        val btn_follow = findViewById<Button>(R.id.btn_follow)
        var pengikut_count = 5000

        lbl_pengikut_count.text = pengikut_count.toString()
        btn_follow.setOnClickListener {
            pengikut_count++
            lbl_pengikut_count.text = pengikut_count.toString()
        }
    }
}