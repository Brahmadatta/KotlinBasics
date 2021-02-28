fun main()
{

    val numbers = listOf(1,2,3)

    println("first number : ${numbers.first()}")

    println("number > 2 : ${numbers.first { it > 2 }}")

    println("number > 10 : ${numbers.firstOrNull { it > 10 }}")

    println("last number : ${numbers.last()}")

    println("last number < 3 : ${numbers.last { it < 3 }}")

    println("element At 1 : ${numbers.elementAt(1)}")

    println("element At 100 : ${numbers.elementAtOrNull(100)}")

    println("element At 100 : ${numbers.elementAtOrElse(100,{-it})}")
}