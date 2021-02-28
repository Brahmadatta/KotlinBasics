import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main()
{

    runBlocking {
        val firstDeferred = async { getFirstValue() }

        val secondDeferred = async { getSecondValue() }

        println("Doing some process here")
        delay(500L)
        println("Waiting for values")

        val firstvalue = firstDeferred.await()
        val secondvalue = secondDeferred.await()
        println("The result is ${firstvalue + secondvalue}")
    }
}

suspend fun getFirstValue() : Int {
    delay(1000L)
    val value = Random.nextInt(100)
    println("Returning first value $value")
    return value
}

suspend fun getSecondValue() : Int{
    delay(2000L)
    val value = Random.nextInt(1000)
    println("Returning second value $value")
    return value
}