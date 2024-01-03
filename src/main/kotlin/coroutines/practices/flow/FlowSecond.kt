package coroutines.practices.flow

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        secondFlow().collect { v ->
            println(v)
        }
    }
}


fun secondFlow(): Flow<Int> {
    return flowOf(1, 2, 3)
}