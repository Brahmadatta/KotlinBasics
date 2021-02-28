fun main()
{
    val data = "This is a test given by interviewer"

//    var result = arrayOf(longestWord(data))
//
//    for (i in result.indices)
//    {
//        println("length of each item ${result[i]} is ${result[i]?.length}")
//    }

    println("The longest word in given string is : ${longestWord(data)}")

    println("The shortest word in given String is : ${shortestWord(data)}")

}

fun longestWord(str : String) : String {

    var word = str.split(' ')
    println("words : $word")
    var longestWord : String = " "

    for (i in word.indices)
    {
        if (word[i].length > longestWord.length)
        {
            longestWord = word[i]
        }
    }
    return longestWord
}


fun shortestWord(str : String) : String {
    var words = str.split(' ')
    var shortestWord : String = " "

    for (i in words.indices)
    {
        if (words[i].trim().length < shortestWord.length)
        {
            shortestWord = words[i]
        }
    }
    return shortestWord
}