package com.lucas.testingworkshop

import org.springframework.stereotype.Component

@Component
class Utils {

    fun checkNumbersAreValid(x: String, y: String): Boolean {
        println("Checking if numbers are valid....")
        return if (x == "null" || y == "null") false
        else if (x == "!" || y == "!") false
        else !(x == "undefined" || y == "undefined")
    }
}