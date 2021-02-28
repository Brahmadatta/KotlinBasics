fun main()
{

    val a : Double = 20.0

    val product = {x : Int,y: Int -> x * y}

    println("Value is ${product(2,3)}")

    val productt : (Int,Int) -> Int = {x,y -> x*y}
    println("value is ${productt(9,8)}")
}