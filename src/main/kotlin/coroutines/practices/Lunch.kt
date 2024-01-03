package coroutines.practices

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    lunch()
}

fun lunch() {
    println("Task 1  ${Thread.currentThread().name}")
    GlobalScope.launch {
        delayCoroutineRunBlocking("Task 2 ") // taking from RunBlocking
    }
    println("Task 3  ${Thread.currentThread().name}")
}