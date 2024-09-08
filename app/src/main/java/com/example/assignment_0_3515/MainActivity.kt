package com.example.assignment_0_3515

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main(){
        val shape = arrayOf( Square("Square"), Circle("Circle"), Triangle("Triangle"), EquilateralTri("Equilateral Triangle"))

        for (s in shape) {
            if (s is Square) {
                println("Height and length for SQUARE:")
                val height = readLine()!!.toDouble()
                val length = readLine()!!.toDouble()
                s.setDimensions(height, length)
            }
            else if (s is Circle) {
                println("Radius for CIRCLE:")
                val radius = readLine()!!.toDouble()
                s.setDimensions(radius)
            }
            else if (s is Triangle) {
                println("Each side of the TRIANGLE:")
                val sideA = readLine()!!.toDouble()
                val sideB = readLine()!!.toDouble()
                val sideC = readLine()!!.toDouble()
                s.setDimensions(sideA, sideB, sideC)
            }
            else if (s is EquilateralTri) {
                println("Side of EQUILATERAL TRIANGLE:")
                val side = readLine()!!.toDouble()
                s.setDimensions(side)
            }
        }

        for (s in shape) {
            println("Shape name: ${s.name}")
            s.printDimensions()
            println("Area of shape: ${s.getArea()}")
            println()
        }
    }
}