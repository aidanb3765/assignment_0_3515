package com.example.assignment_0_3515

class EquilateralTri (_name: String) : Shape(_name){
    var side: Double = 0.0

    fun setDimensions(side: Double) {
        this.side = side
    }

    override fun printDimensions() {
        TODO("Not yet implemented")
    }

    override fun getArea(): Double {
        return (Math.sqrt(3.0) / 4) * side * side
    }
}