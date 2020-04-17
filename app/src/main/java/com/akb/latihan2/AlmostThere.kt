package com.akb.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlmostThere : AppCompatActivity() {
    private lateinit var Verif: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almostthere)
        Verif = findViewById(R.id.ver_btn_ver)
        Verif.setOnClickListener {
            startActivity(Intent(this, Verify::class.java))
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
