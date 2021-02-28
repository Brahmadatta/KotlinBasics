import kotlinx.coroutines.*
import java.lang.ArithmeticException
import java.lang.IndexOutOfBoundsException

fun main()
{
    runBlocking {

        val myHandler = CoroutineExceptionHandler{
            coroutineContext, throwable ->
            println("Exception Handled ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception on JOB")
            throw IndexOutOfBoundsException("My Exception")
        }

        job.join()

        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("Arithmetic exception")
        }

        try {
            deferred.await()
        }catch (e : ArithmeticException)
        {
            println(e.localizedMessage)
        }

    }
}