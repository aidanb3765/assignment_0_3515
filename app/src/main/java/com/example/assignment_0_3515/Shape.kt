package com.example.assignment_0_3515

abstract class Shape (_name : String): Dimensionable {
    var name = _name
    open fun getArea(): Double {
        return 0.0;
    }

}
