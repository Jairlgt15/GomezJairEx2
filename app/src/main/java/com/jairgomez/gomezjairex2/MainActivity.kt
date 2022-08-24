package com.jairgomez.gomezjairex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageViewAnimal)
    }
    fun getPartyPics(): IntArray? {
        return intArrayOf(
            R.drawable.imagen1,
            R.drawable.imagen2,
            R.drawable.imagen3,
            R.drawable.imagen4,
            R.drawable.imagen5,
            R.drawable.imagen6,
            R.drawable.imagen7,
            R.drawable.imagen8
        )
    }
    fun getPartyPicsR(): IntArray? {
        return intArrayOf(
            R.drawable.imagen1_1,
            R.drawable.imagen2_1,
            R.drawable.imagen3_1,
            R.drawable.imagen4_1,
            R.drawable.imagen5_1,
            R.drawable.imagen6_1,
            R.drawable.imagen7_1,
            R.drawable.imagen8_1
        )
    }
    fun getPartyPicsPreguntas(): Int {
        return R.array.preguntas
    }

}