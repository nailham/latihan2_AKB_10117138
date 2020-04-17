package com.akb.latihan2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var register: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register = findViewById(R.id.textregister)
        register.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
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