package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var editNome:EditText? = null
var editIdade:EditText? = null
var textResultado:TextView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNome = findViewById<EditText>(R.id.edtNome)
        editIdade = findViewById<EditText>(R.id.edtIdade)
        textResultado = findViewById<EditText>(R.id.txtResultado)
    }

    fun calcular(view: View) {
        val pes = Pessoa(null, editNome?.text.toString(),
            editIdade?.text.toString().toInt())
            textResultado?.text = pes.getDadosPessoa()


    }

    fun botaoClicar(v: View?){
        val clicado: String = ( v as Button).text.toString()
        when(clicado){
            "Processar" -> println("Pressionou Processar")
            "Limpar" -> println("Pressionou Limpar")
        }

    }
}

