

class RomanToInteger {
    fun romanToInt (roman : Int) : String {
        println (roman)
        var result =""
        val romanLehght= roman.toString().length
        for (i in 1 .. romanLehght) {
            println(roman.toString()[i-1])
        }
        if (roman>0) {
            for (i in 1 .. roman%5) {
                result= result + "I"
            }
        }
// Если больше 5
        if (roman%10 > 5){
            result = "V" + result
        }
        if (roman%50 > 10) {
            for (i in 1 ..roman/10%5) {
                result = "X" + result
            }
        }
// Если больше 50
        if (roman > 50) {
            result = "L" + result
        }
 // Если число более 100
        if (roman > 100) {
            for (i in 1 ..roman/100%5) {
                result = "C" + result
            }
        }
 // Если число более 500
        if (roman > 500) {
            result = "D" + result
        }
 // Если в числе есть тысячи - добавляем столько "М"
        if (roman%1000 > 100) {
            for (i in 1..roman / 1000 ) {
                result = "M" + result
            }
        }
            return result
    }
}

fun main () {
    val roman = RomanToInteger()
    println (roman.romanToInt(1972))
}

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
which is XX + V + II.
*/
