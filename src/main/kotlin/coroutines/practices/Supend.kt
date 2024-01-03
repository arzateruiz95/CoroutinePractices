package coroutines.practices

import kotlinx.coroutines.delay

suspend fun main(args: Array<String>){
    blockingSuspend()

}

suspend fun blockingSuspend(){
    println("Task 1 " + Thread.currentThread().name)
    delayCoroutine("Task 2 ")
    println("Task 3 " + Thread.currentThread().name)
}

suspend fun delayCoroutine(message: String){
    delay(timeMillis = 4000)
    println(message + Thread.currentThread().name)
}