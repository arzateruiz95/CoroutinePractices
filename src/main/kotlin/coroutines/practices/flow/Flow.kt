package coroutines.practices.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            for (j in 1..3) {
                println("I'm not blocking $j")
                delay(1000)
            }
        }
        firstFlow().collect { v ->
            println(v)
        }
    }
}

//Already has suspended
fun firstFlow(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(1000)
        emit(i)// emit the flow stream data
    }
}