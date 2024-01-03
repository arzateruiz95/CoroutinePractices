package coroutines.practices

import kotlinx.coroutines.*

fun main(args: Array<String>) {
    awaitAsync()
}


fun awaitAsync() = runBlocking {
    println(System.currentTimeMillis().toString())
    val num1: Int = async { calculateHard(100) }.await()
    println("num $num1 ${System.currentTimeMillis()}")
    val num2: Int = async { calculateHard(200) }.await()
    println("num $num2 ${System.currentTimeMillis()}")
    val result: Int = num1 + num2
    println(result)
}

suspend fun calculateHard(value: Int): Int {
    delay(2000)
    return value
}