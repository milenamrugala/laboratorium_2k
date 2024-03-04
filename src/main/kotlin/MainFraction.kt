fun main() {
    val firstNumber = Fraction(1,2)
    val secondNumber = Fraction(3,5)

    println(firstNumber)
    println(secondNumber)

    val sum = firstNumber.add(secondNumber) // (11/10)
    val sub = firstNumber.sub(secondNumber) // (-1/10)
    val mul = firstNumber.mul(secondNumber) // (3/10)

    println(sum)
    println(sub)
    println(mul)


}