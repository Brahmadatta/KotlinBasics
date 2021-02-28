fun main()
{
    val hashmap : HashMap<String,String> = HashMap<String,String>()

    hashmap["one"] = "Brahma"
    hashmap["two"] = "Datta"
    hashmap["three"] = "Rahul"
    hashmap["four"] = "Mahesh"
    hashmap["five"] = "Pranay"

    println(hashmap)

    hashmap["six"] = "test"

    hashmap.clear()

    println(hashmap)
    
    for (key in hashmap.keys)
    {
        println("Element at key $key is : ${hashmap[key]}")
    }

}