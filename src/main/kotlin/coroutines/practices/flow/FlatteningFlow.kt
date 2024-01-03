package coroutines.practices.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//Flatting flows
fun main() {
    runBlocking {
        val startTime = System.currentTimeMillis();
        (1..3).asFlow().onEach { delay(100) }
            .flatMapConcat {
                requestFlow(it)
            }.collect { value ->
                println("$value at ${System.currentTimeMillis() - startTime} ms")
            }
    }
    println("--------------------->")
    runBlocking {
        val startTime = System.currentTimeMillis();
        (1..3).asFlow().onEach { delay(100) }
            .flatMapMerge {
                requestFlow(it)
            }.collect { value ->
                println("$value at ${System.currentTimeMillis() - startTime} ms")
            }
    }

}

fun requestFlow(i: Int): Flow<String> = flow {
    emit("$i: First")
    delay(500)
    emit("$i second")
}