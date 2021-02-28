fun main()
{
//    var a = "abbcffg"
//    var b = a.

    val a = listOf("a", "b", "ab", "ba", "abc","cdfg")
    val b = a.distinctBy { it.length } // ["a", "ab", "abc"]

    println(b)
}