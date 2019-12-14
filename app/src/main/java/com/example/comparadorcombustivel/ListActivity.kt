package com.example.comparadorcombustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)



        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, gases)
        var lista = findViewById(R.id.lstcontatos) as ListView
        lista.adapter = adapter

        lista.setOnItemClickListener {parent, view, position, id ->
            var gasStation: GasStation = gases.get(position)
            var result = gasStation.bestBuy()
            var name = gasStation.name

            Toast.makeText(this, "$result no $name", Toast.LENGTH_SHORT).show()
        }





    }







    companion object {
        var gas1: GasStation = GasStation(name = "Posto Peixinho", gasoline = 4.09, alcohol = 2.79)
        var gas2: GasStation = GasStation(name = "Posto LK", gasoline = 3.87, alcohol = 2.98)
        var gas3: GasStation = GasStation(name = "Posto Paizão", gasoline = 4.10, alcohol = 2.99)
        var gas4: GasStation = GasStation(name = "Posto Ipiranga", gasoline = 4.09, alcohol = 2.79)
        internal val contatos = arrayOf("Alline", "Lucas", "Rafael", "Gabriela", "Silvana")
        internal  val gases = arrayOf(gas1,gas2,gas3,gas4)

    }

}

