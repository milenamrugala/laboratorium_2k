class Fraction(
    private var numerator: Int,
    private var denominator: Int
) {

    fun add(other: Fraction): Fraction {
        val commonDenominator = denominator * other.denominator
        val sumNumerator = numerator * other.denominator + other.numerator * denominator
        return Fraction(sumNumerator, commonDenominator).simplify()
    }

    fun sub(other: Fraction): Fraction {
        val commonDominator = denominator * other.denominator
        val subNominator = numerator * other.denominator - other.numerator * denominator
        return Fraction(subNominator, commonDominator).simplify()
    }

    fun mul(other: Fraction): Fraction {
        val numerators = numerator * other.numerator
        val denominators = denominator * other.denominator
        return Fraction(numerators, denominators).simplify()
    }

    fun inv(other: Fraction): Fraction {
        val numerator = other.numerator
        val denominator = other.denominator
        return Fraction(denominator, numerator).simplify()
    }

    fun div(other: Fraction): Fraction {
        return mul(other.inv(other)).simplify()
    }

    private fun gcd(a: Int, b: Int): Int {
        var firstNumber = a
        var secondNumber = b

        while (secondNumber != 0) {
            val temp = secondNumber
            secondNumber = firstNumber % secondNumber
            firstNumber = temp
        }
        return firstNumber
    }

    private fun simplifyFraction() {
        val gcd = gcd(numerator, denominator)
        numerator /= gcd
        denominator /= gcd
    }

    private fun simplify(): Fraction {
        simplifyFraction()
        return this
    }

    override fun toString(): String {
        return if (denominator == 1) {
            "$numerator"
        } else {
            val whole = numerator / denominator
            val remainder = numerator % denominator
            if (whole != 0) {
                if (remainder != 0) {
                    "$whole $remainder/$denominator"
                } else {
                    "$whole"
                }
            } else {
                "$numerator/$denominator"
            }
        }
    }
}

