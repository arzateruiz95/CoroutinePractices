package coroutines.practices

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    dispatcher()
}


fun dispatcher() {
    runBlocking {
        println("Thread in where is executed 1 ${Thread.currentThread().name}")
    }
    runBlocking(Dispatchers.Unconfined) {
        println("Thread in where is executed 2 ${Thread.currentThread().name}")
    }
    runBlocking(Dispatchers.Default) {
        println("Thread in where is executed 3 ${Thread.currentThread().name}")
    }
    runBlocking(Dispatchers.IO) {
        println("Thread in where is executed 4 ${Thread.currentThread().name}")
    }
    runBlocking(newSingleThreadContext("MyThread")) {
        println("Thread in where is executed 5 ${Thread.currentThread().name}")
    }
    /*runBlocking(Dispatchers.Main) {
        println("Thread in where is executed 6 ${Thread.currentThread().name}")
    }*///Android
}