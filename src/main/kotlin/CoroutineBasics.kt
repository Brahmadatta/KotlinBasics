import kotlinx.coroutines.*
import javax.xml.bind.JAXBElement

fun main(){

    runBlocking {
        launch {
            delay(1000L)
            print("Task from runBlocking")
        }

        GlobalScope.launch {
            delay(500L)
            print("\nTask from GlobalScope")
        }

        CoroutineScope(
            launch {
                delay(1500L)
                print("\nTask from Coroutine Scope")
            }
        )
    }

}