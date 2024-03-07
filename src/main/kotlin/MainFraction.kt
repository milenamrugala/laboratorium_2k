fun main() {
    val firstNumber = Fraction(1,2)
    val secondNumber = Fraction(3,5)

    println(firstNumber) // (1/2)
    println(secondNumber) // (3/5)

    val sum = firstNumber.add(secondNumber) // (11/10)
    val sub = firstNumber.sub(secondNumber) // (-1/10)
    val mul = firstNumber.mul(secondNumber) // (3/10)
    val inv = firstNumber.inv(secondNumber) // (5/3)
    val div = firstNumber.div(secondNumber) // (5/6)

    println(sum)
    println(sub)
    println(mul)
    println(inv)
    println(div)

}