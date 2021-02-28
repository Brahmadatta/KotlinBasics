package kotlinsamples.hello_functions

fun main()
{
    infixFunctions()
}

fun sayHello()
{
    println("hello there !!!")
}

fun triple(x : Int) : Int{
    return x * 3
}

fun sum_up(vararg values : Int) : Int{
//    var result = 0
//    for (i in values)
//    {
//        result += i
//    }
//    return result
    return values.sum()
}

fun quadratic_equation(a : Double,b : Double,c : Double) : Pair<Double,Double> {
    fun calc_discriminant() : Double {
        return b*b-4*a*c
    }
    val rootdisc = Math.sqrt(calc_discriminant())
    return Pair((-b+rootdisc/2*a),(-b-rootdisc/2*a))
}

infix fun Double.averageWith(other: Double) : Double{
    return this + other/2
}

fun infixFunctions()
{
    val a  = 10.0
    val b = 29.0

    println("The average of the $a and $b is ${a averageWith b}")
}