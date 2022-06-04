package com.furthergrow.practica1
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.furthergrow.practica1.databinding.ActivityMainBinding

// Nos ayudan a enlazar elementos de la vista con el codigo

class MainActivity : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Asignar un valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Metodo anterior para declarar una variable y que sera de tipo texto
        /*var  leyenda=findViewById<TextView>(R.id.text)

        //Se coloca la cadena que se va a mostrar en la variable leyenda
        leyenda.text="saludos desde aca*/

        //Es lo mismo de arriba pero usando la variable binding ya no se usa var
        /*binding.text.text="UT SELVA"*/




    }
}
