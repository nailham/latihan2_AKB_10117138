package com.akb.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verify : AppCompatActivity() {

    private lateinit var GoHome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        GoHome = findViewById(R.id.btn_send_ver)
        GoHome.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
/*
Pengerjaan Tanggal : 16-04-2020
Deskripsi pengerjaan : mengerjakan layout activity_main,register,almost,,verify dan home
mengerjakan class yang terdiri dari activity_main,register,almost,,verify dan home
menambahkan values  dan drawable  beserta coding
Nim :10117138
Nama :IlhamNurjaman
Kelas :IF4/AKB
*/
