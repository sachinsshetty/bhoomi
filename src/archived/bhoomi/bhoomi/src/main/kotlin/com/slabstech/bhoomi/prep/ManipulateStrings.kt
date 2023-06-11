package com.slabstech.bhoomi.prep

class ManipulateStrings {
    /*
    Given an integer input. Print string output based on below conditions
    "zero" - if last digit is 0
    "five" - if last digit is 5
    "even" - if number is divisible by 2 and not equal to 0
    "odd" -  if number is not divisible by 2
     */
    fun checkDigits(number: Int): String {
        if (number % 10 == 0) {
            return "zero"
        }else if (number % 10 == 5) {
            return "five"
        } else if (number % 2 == 0) {
            return "even"
        } else if (number % 2 == 1) {
            return "odd"
        }
        return "invalid"
    }
}