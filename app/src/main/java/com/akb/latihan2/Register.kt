package com.akb.latihan2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    private lateinit var Send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        Send = findViewById(R.id.reg_btn_reg)
        Send.setOnClickListener {
            startActivity(Intent(this, AlmostThere::class.java))
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