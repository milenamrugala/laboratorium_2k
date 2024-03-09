fun main() {
    val firstNumber = Fraction(11, 11)
    val secondNumber = Fraction(3,8)

    println(firstNumber) //ok
    println(secondNumber) //dla ułamka typu 3/6 nie skraca do 1/2, dopiero w kolejnych metodach przy dodawaniu, odejmowaniu

    val sum = firstNumber.add(secondNumber) //ok
    val sub = firstNumber.sub(secondNumber) //ok
    val mul = firstNumber.mul(secondNumber) //ok
    val inv = firstNumber.inv(secondNumber) //ok, skraca i odwraca
    val div = firstNumber.div(secondNumber) //ok, skraca i odwraca

    println(sum)
    println(sub)
    println(mul)
    println(inv)
    println(div)

}