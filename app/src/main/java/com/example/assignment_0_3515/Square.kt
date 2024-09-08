package com.example.assignment_0_3515

class Square (_name: String) : Shape(_name){
    var height: Double = 0.0
    var length: Double = 0.0

    fun setDimensions (height: Double, length: Double) {
        this.height = height
        this.length = length
    }

    override fun printDimensions() {
        TODO("Not yet implemented")
    }

    override fun getArea(): Double {
        return height * length
    }
}