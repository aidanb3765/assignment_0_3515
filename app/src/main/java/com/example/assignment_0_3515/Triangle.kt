package com.example.assignment_0_3515

class Triangle (_name: String) : Shape(_name) {
    var sideA: Double = 0.0
    var sideB: Double = 0.0
    var sideC: Double = 0.0

    fun setDimensions(sideA: Double, sideB: Double, sideC: Double) {
        this.sideA = sideA
        this.sideB = sideB
        this.sideC = sideC
    }

    override fun printDimensions() {
        TODO("Not yet implemented")
    }

    override fun getArea(): Double {
        val x = (sideA + sideB + sideC) / 2
        return Math.sqrt(x * (x - sideA) * (x - sideB) * (x - sideC))
    }
}