package com.example.mobileproject

fun main(args: Array<String>) {
    biodata("Fandhi Syahru Rishaleh", 19)
    hobby("Membaca", "Membaca buku yang dapat menambah ilmu")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("=====================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("=====================")
}

fun hobby(nama:String, desc:String){
    println("Saya punya hobby $nama")
    println("Hobby tersebut adalah $desc")
}
