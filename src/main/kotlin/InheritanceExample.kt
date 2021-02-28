open class Person(name : String, age : Int)
{
    init {
        println("My name is $name and my age is $age")
    }
}

class Developer(name :String,age : Int) : Person(name, age)
{
    fun doCoding()
    {
        println("I do coding")
    }
}

fun main()
{
    val dev = Developer("Brahma",27)
    dev.doCoding()
}