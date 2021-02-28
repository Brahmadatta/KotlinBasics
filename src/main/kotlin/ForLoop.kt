fun main()
{
    for(i in 0 until 6)
    {
        println("Hello!!!")
    }


    var capitals = arrayOf("India","America","UK","Australia")
    var capit = mapOf("India " to "Delhi","London " to "UK")
    for (i in capitals)
    {
        println(i)
    }

    for ((capital,country) in capit)
    {
        println("$capital to $country")
    }
}
