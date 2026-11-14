package com.example.a103asgnt1

data class BakeryItem(
    val name: String,
    val sold: Double,
    val price: Double
){
    // Challenge 2 sesh 1
    fun revenue(): Double {
        return sold * price
    }

}
