package com.example.assignment_0_3515

class Circle (_name: String) : Shape(_name) {
    var radius: Double = 0.0

    fun setDimensions(radius: Double) {
        this.radius = radius
    }

    override fun printDimensions() {
        println("Circle: radius = $radius ")
    }

    override fun getArea(): Double {
        return radius * radius * Math.PI
    }
}