package coroutines.practices

import kotlinx.coroutines.runBlocking

fun main(args: Array<String>){
    suspendExamplePart2()
}


fun suspendExamplePart2() = runBlocking {
    println("Task 1  ${Thread.currentThread().name}")
    delayCoroutineRunBlocking("Task 2 ") // taking from RunBlocking
    println("Task 3  ${Thread.currentThread().name}")
}

