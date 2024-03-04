class Fraction(
    private var nominator: Int,
    private var dominator: Int
) {

    override fun toString(): String {
        return "Fraction(nominator=$nominator, dominator=$dominator)"
    }

    fun getNominator(): Int {
        return nominator
    }

    fun getDominator(): Int {
        return dominator
    }

    fun setNominator(nominator: Int) {
        this.nominator = nominator
    }

    fun setDominator(dominator: Int) {
        this.dominator = dominator
    }

    fun add(secondFraction: Fraction): Fraction {
        val commonDominator = dominator * secondFraction.dominator
        val sumNominator = nominator * secondFraction.dominator + secondFraction.nominator * dominator
        return Fraction(sumNominator, commonDominator)
    }

    fun sub(thirdFraction: Fraction): Fraction {
        val commonDominator = dominator * thirdFraction.dominator
        val subNominator = nominator * thirdFraction.dominator - thirdFraction.nominator * dominator
        return Fraction(subNominator, commonDominator)
    }

    fun mul(fourthFraction: Fraction): Fraction {
        val nominators = nominator * fourthFraction.nominator
        val dominators = dominator * fourthFraction.dominator
        return Fraction(nominators, dominators)
    }

//    fun div(fifthFraction: Fraction): Fraction {
//
//    }
//
//    fun inv(sixthFraction: Fraction): Fraction {
//
//    }
}

