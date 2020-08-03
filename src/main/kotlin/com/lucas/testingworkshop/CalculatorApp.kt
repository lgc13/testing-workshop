package com.lucas.testingworkshop

class CalculatorApp(
        private val utils: Utils
) {

    fun add(x: String, y: String): String {
        return if (utils.checkNumbersAreValid(x, y)) {
            (x.toInt() + y.toInt()).toString()
        } else {
            "Error"
        }
    }

    fun subtract(x: Int, y: Int): Int {
        return x - y
    }
}
