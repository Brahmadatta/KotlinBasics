class TestTwo(name : String,age : Int){
    val myAge = 27
    var isOlderThanMe = false

    init {
        isOlderThanMe = myAge >= age
    }
}

fun main()
{
    val testtwo = TestTwo("Brahma",27)
    println(testtwo.isOlderThanMe)
}