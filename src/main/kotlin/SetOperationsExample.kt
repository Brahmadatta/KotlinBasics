
fun main() {

    data class Person(var name: String, var age: Int)

    val word1 = "helllooo".toCharArray().toList()
    var word2 = "help!".toCharArray().toList()

    println(word1.distinct())

    println("common letters are : ${word1.intersect(word2)}")

    println("All unique letters are : ${word1.union(word2)}")

    println(word1.subtract(word2))


    val people = listOf(
        Person("Brahma", 25),
        Person("Datta", 25),
        Person("Brahma", 22)
    )

    println("Person distinct by name :" + people.distinctBy { it.name })
    println("Person distinct by age : " + people.distinctBy { it.age })

}

