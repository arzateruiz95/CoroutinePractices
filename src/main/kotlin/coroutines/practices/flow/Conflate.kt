package coroutines.practices.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.system.measureTimeMillis


//Conflate get the last one
fun main() {
    runBlocking {
        val time = measureTimeMillis {
            bufferFlow()
                .conflate()
                .collect { value ->
                delay(300)
                println(value)
            }
        }
        println("$time ms")
    }
}


