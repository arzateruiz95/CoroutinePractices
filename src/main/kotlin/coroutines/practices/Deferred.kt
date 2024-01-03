package coroutines.practices

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    awaitAsyncDeferred()
}

fun awaitAsyncDeferred() = runBlocking {
    println(System.currentTimeMillis().toString())
    val num1: Deferred<Int> = async { calculateHard(100) }
    println(System.currentTimeMillis().toString())
    val num2: Deferred<Int> = async { calculateHard(200) }
    println(System.currentTimeMillis().toString())
    val result = num1.await() + num2.await()
    println(result)
}


