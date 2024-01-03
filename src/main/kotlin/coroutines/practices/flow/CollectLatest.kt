package coroutines.practices.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


//Only get the latest flow
fun main() {
    runBlocking {
        val time = measureTimeMillis {
            bufferFlow()
                .collectLatest { value ->
                    println("Collecting $value")
                delay(300)
                println("Finished $value")
            }
        }
        println("$time ms")
    }
}


