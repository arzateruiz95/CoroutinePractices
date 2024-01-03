package coroutines.practices.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.system.measureTimeMillis


//Finished flow without cancel
fun main() {
    runBlocking {
        val time = measureTimeMillis {
            bufferFlow().collect { value ->
                delay(300)
                println(value)
            }
        }
        println("$time ms")
    }
}

fun bufferFlow(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100)
        emit(i)// emit the flow stream data
    }
}
