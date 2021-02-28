fun main()
{

    val objects = arrayOf("car","bike","plane")

    val colors = arrayOf("red","blue","green","yellow")

    val pairs = objects.flatMap { o -> colors.map { c -> "$c $o" } }

    println(pairs)

    val numbers = generateSequence(1,{it + 1}).take(10).toList()
    println(numbers)

    println(numbers.joinToString("--"))

    println("Sum (reduce) = ${numbers.reduce{x,y -> x + y}}")

    println("mul = ${numbers.reduce{x,y -> x * y}}")

    println("sum of all numbers is ${numbers.sum()} and average is : ${numbers.average()}")

    println("sum of squares = ${numbers.sumBy { it * it }}")

    println("sum of roots = ${numbers.sumByDouble { Math.sqrt(it.toDouble()) }}")

    //reduce x[0] + x[1]
    //reduceRight x[last] + x[last -1]
    //fold : seed + x[0]

    println("sum (fold) = : ${numbers.fold(0,{x,y -> x + y})}")

    println("mul (fold) = : ${numbers.fold(1,{x,y -> x * y})}")

}