fun main()
{
    val gen = generateSequence(1,{it + 3})
    val numbers = gen.take(15)
    println(numbers.toList())


    println(iterateNumbers(100))

    val nums : Sequence<Int> = arrayOf(1,2,-3,4,5).asSequence()

    println("Are all numbers are > 0? ${nums.all { it > 0 }}")

    val newnum : Sequence<String> = arrayOf("hi","hello","thereee","brahma").asSequence()

    println("The longest word is : ${newnum.any{it.length > 7}}")

}

fun iterateNumbers(number : Int) {
    for(i in 0..number)
    {
        if (i % 2 == 0)
        {
            println("Fizz")
        }

        if (i % 3 == 0)
        {
            println("Buzz")
        }
    }
}