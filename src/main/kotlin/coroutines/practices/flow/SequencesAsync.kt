package coroutines.practices.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        runAsync().forEach { i ->
            println(i)
        }
    }
}


suspend fun runAsync(): List<Int> {
    return runBlocking {
        delay(1000)
        return@runBlocking listOf(1, 2, 3)
    }
}