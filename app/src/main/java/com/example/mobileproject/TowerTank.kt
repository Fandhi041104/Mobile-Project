package com.example.mobileproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val panjangAkuarium = 5.0
        val tinggiAkuarium = 2.0

        val luasLebar = hitungLuasLebarAkuarium(panjangAkuarium, tinggiAkuarium)
        println("Luas lebar akuarium adalah: $luasLebar satuan persegi")
    }

    // Fungsi untuk menghitung luas dan lebar akuarium
    fun hitungLuasLebarAkuarium(panjang: Double, tinggi: Double): Double {
        return panjang * tinggi
    }
}