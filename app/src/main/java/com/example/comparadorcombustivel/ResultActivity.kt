package com.example.comparadorcombustivel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if(intent != null){
            var textRes: String = "Erro"
            var valGas: Float = intent.getStringExtra("gasolina").toFloat()
            var valAlc: Float = intent.getStringExtra("alcool").toFloat()
            if ( valGas > 0 && valAlc > 0 ) {
                textRes = if (valGas*0.7 > valAlc) "Use Alcool!" else "Use Gasolina!"
            }

            if(valGas == 666f) textRes = "Use Maconha"

            resultado2.setText(textRes)



            Log.i("VERIFICA", textRes)

        }





    }

}
