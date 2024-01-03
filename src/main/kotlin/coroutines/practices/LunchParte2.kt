package coroutines.practices

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    lunchPart2()
    Thread.sleep(5000)
}

fun lunchPart2() {
    println("Task 1  ${Thread.currentThread().name}")
    GlobalScope.launch {/// Different Scopes
        delayCoroutineRunBlocking("Task 2 ") // taking from RunBlocking
    }
    println("Task 3  ${Thread.currentThread().name}")
}