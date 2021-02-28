fun main()
{

    var number = 8392793

    var reversed = 0

    while(number != 0)
    {
        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }

    println(reversed)

    println(reverseString("brahma"))

}

fun reverseString(name : String) : String{

    var reversed = ""

    for (i in name.length-1 downTo 0)
    {
        reversed += name[i]
    }
    return reversed
}
