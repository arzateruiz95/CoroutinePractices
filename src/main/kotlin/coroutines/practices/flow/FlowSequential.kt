package coroutines.practices.flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {
        (1..5).asFlow().filter { i ->
            println("Filtrado $i")
            0 == i % 2
        }.map { i ->
            println("Map $i")
            "String $i"
        }.collect { i ->
            println("Collect $i")
        }
    }
}
