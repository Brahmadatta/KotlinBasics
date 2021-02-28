fun main()
{
    println("The longest word in the string is ${longest("This is Brahma Datta")}")
}

fun longest(str : String) : String{
    var words = str.split(' ');
    var longest = ""; // changed

    for (i in words.indices) {
        if (words[i].length > longest.length) { // changed
            longest = words[i]; // changed
        }
    }
    return longest;
}
