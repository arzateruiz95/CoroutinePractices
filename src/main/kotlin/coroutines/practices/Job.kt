package coroutines.practices

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    job()
    Thread.sleep(5000)
}


fun job(){
    println("Task 1  ${Thread.currentThread().name}")
    val job =  GlobalScope.launch {/// Different Scopes
        delayCoroutineRunBlocking("Task 2 ") // taking from RunBlocking
    }
    println("Task 3  ${Thread.currentThread().name}")
    job.cancel() // Cancel de  job
}