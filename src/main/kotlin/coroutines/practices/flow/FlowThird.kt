package coroutines.practices.flow

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        thirdFlow().collect { v ->
            println(v)
        }
    }
}


fun thirdFlow(): Flow<Int> {
    return (1..3).asFlow()
}