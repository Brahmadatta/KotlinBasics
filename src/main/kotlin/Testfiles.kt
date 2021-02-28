fun main()
{

    var arrayList : ArrayList<String> = arrayListOf("Brahma","Datta","Rahul","pranay","srinivas")

    var data = arrayList.filter { it.contains("B") }

    // var data = arraylist.filter{it.length > 5}

    println(data)

    getEvenNumbers()

}


fun getEvenNumbers(){

    var numbers : Sequence<Int> = generateSequence(2,{it+1})

    var allnums = numbers.take(10).toList()

    println(allnums)

    var evenNums = allnums.filter { it % 2 == 0 }

    println(evenNums)

    val notdibythree = allnums.filterNot { it % 3 == 0 }

    println(notdibythree)

    val primeNum = allnums.filterNot { it % 2 == 0 }

    println(primeNum)

    val oodsquares = allnums.map { it * it }.filterNot { it % 2 ==0 }
    println(oodsquares)

    val evensquares = allnums.map { it * it }.filter { it % 2 == 0 }
    println(evensquares)

    val values = arrayOf<Any>(2,2.66,3,4.6,5.5)
    val wholeNumbers = values.filter { it is Int }
    println(wholeNumbers)

    val morevalues = arrayOf<Int?>(1,2,4,5,null,8,0)
    val notnullvalues = morevalues.filterNotNull()
    println(notnullvalues)
}