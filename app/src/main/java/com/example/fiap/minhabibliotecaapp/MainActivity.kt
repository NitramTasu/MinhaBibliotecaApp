package com.example.fiap.minhabibliotecaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fiap.minhabiblioteca.Calculadora

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calculadora: Calculadora = Calculadora()

        Toast.makeText(this, "Resultado: " + calculadora.somar(2, 2), Toast.LENGTH_LONG).show()
    }
}
