package coroutines.practices

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>){
    suspendExample()
}

fun suspendExample(){
    println("Task 1 " + Thread.currentThread().name)
    runBlocking {
        delayCoroutineRunBlocking("Task 2 ")
    }
    println("Task 3 " + Thread.currentThread().name)
}

suspend fun delayCoroutineRunBlocking(message: String){
    delay(timeMillis = 4000)
    println(message + Thread.currentThread().name)
}