package com.example.buscaminasv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciar()

    }

    fun iniciar():Unit
    {
        var contador:Int = 0
        var cantidades = IntArray(16)
        Mensaje.text = "0"
        for (i in 0 until 16)
        {
            var numero = Random.nextInt(1,4)
            cantidades[i]=numero
        }
        var botones = arrayOf(btnuno, btndos, btntres, btncuatro, btncinco, btnseis, btnsiete,btnocho, btnnueve, btndiez, btnonce, btndoce, btntrece, btncatorce, btnquince, btndieciseis)
        for (i in 0 until 16)
        {
            botones[i].text = ""
            botones[i].setOnClickListener()
            {
                if (cantidades[i] != 3)
                {
                    botones[i].text = cantidades[i].toString()
                    contador += cantidades[i]
                    Mensaje.text = contador.toString()
                    botones[i].setEnabled(false)
                } else
                {
                    botones[i].text = "X"
                    Toast.makeText(this,"Perdiste", Toast.LENGTH_LONG).show()
                    iniciar()
                }
                //Mensaje.setText("Hola soy el boton: "+i + " Con valor "+ cantidades[i])
            }
        }
    }

    fun juntarnombre(nombre:String, apellido:String): String
    {
        var junto:String
        junto = nombre+" "+apellido
        return junto
    }
}