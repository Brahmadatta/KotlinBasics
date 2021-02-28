fun main()
{
    val seq : Sequence<Int> = generateSequence(1,{it +6})

    val numbers : Sequence<Int> = seq.take(3)

    val squares : Sequence<Int> = numbers.map { it * it }

    println(squares.toList())
}