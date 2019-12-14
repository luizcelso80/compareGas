package com.example.comparadorcombustivel

import java.io.Serializable

data class GasStation (
    var name: String,
    var gasoline: Double,
    var alcohol: Double
) : Serializable {

    override fun toString(): String {
        return this.name
    }

    fun bestBuy(): String {
        var textRes = ""
        if ( gasoline > 0 && alcohol > 0 ) {
            textRes = if (gasoline*0.7 > alcohol) "Use Alcool!" else "Use Gasolina!"
        }
        return textRes
    }

}