fun main() {
    val firstNumber = Fraction(11, 11)
    val secondNumber = Fraction(3,6)

    println(firstNumber) //ok 11/11 = 1
    println(secondNumber) //ok 3/6 = 1/2

    val sum = firstNumber.add(secondNumber) //ok 1 + 1/2 = 1 1/2
    val sub = firstNumber.sub(secondNumber) //ok 1 - 1/2 = 1/2
    val mul = firstNumber.mul(secondNumber) //ok 1 * 1/2 = 1/2
    val inv = firstNumber.inv(secondNumber) //ok 1/2 = 2/1
    val div = firstNumber.div(secondNumber) //ok 1 * 1/2 = 1 * 2/1 = 2

    println(sum)
    println(sub)
    println(mul)
    println(inv)
    println(div)

}