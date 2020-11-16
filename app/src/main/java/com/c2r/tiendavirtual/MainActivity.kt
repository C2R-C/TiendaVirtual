package com.c2r.tiendavirtual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /**  tvMundo.setOnClickListener {
            startActivity<DetailActivity>("text" to "Este es un hola con la libreria anko")
        }*/
    }
}