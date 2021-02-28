fun main()
{
    var name = "This is a parttt of my life"
    val wordLengths = name.split(' ').map { it.length }.asSequence()

    println(wordLengths.toList())

    val wordsWithLength =  name.split(' ').map {
        object {
            val length = it.length
            val word = it
        }
    }

    val wordsLengthPairs = name.split(' ').associate { it to(it.length) }

    for (wL in wordsLengthPairs)
    {
        println(wL)
    }

    for (i in wordsWithLength.indices)
    {
        println("'${wordsWithLength[i].word}' has a length of '${wordsWithLength[i].length}")
    }

    var splitwords = name.split(' ')

    var longestword = ""

    for (i in splitwords.indices)
    {
        if (splitwords[i].length > longestword.length)
        {
            longestword = splitwords[i]
        }
    }

    println(longestword)

    val sequences = listOf("red,blue,green","orange","yellow,black")
    val allwords = sequences.flatMap { it.split(',') }.filter { it.length == 3  }
    println(allwords)
}