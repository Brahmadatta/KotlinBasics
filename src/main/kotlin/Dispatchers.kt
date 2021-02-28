import kotlinx.coroutines.*

fun main()
{

    runBlocking {

//        launch(Dispatchers.Main) {
//            println("Main Dispatcher : Thread ${Thread.currentThread().name}" )
//        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined1 Thread: ${Thread.currentThread().name}")
            delay(500L)
            println("Unconfined2 Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO. Thread : ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Dispatcher Thread: ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("MyThread")) {
            println("newSignleThreadContext : Thread ${Thread.currentThread().name}")
        }
    }

}