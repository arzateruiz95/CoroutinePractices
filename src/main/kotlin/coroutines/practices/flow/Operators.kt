package coroutines.practices.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() {
    // Map
    runBlocking {
        (1..4).asFlow().map { request -> performRequest(request) }.collect { response ->
            println(response)
        }
    }
    // Filter
    runBlocking {
        (1..4).asFlow().filter { request -> request > 1 }.map { request -> performRequest(request) }
            .collect { response ->
                println(response)
            }
    }
    //Transform
    runBlocking {
        (1..4).asFlow().transform { request ->
            emit("Making request $request")
            emit(performRequest(request))
        }.collect { response ->
            println(response)
        }
    }
    //Take
    runBlocking {
        (1..4).asFlow().take(2).collect { response ->
            println(response)
        }
    }
    //ToList
    runBlocking {
        var list: List<Int> = (1..4).asFlow().toList()
        println(list)
    }
    //First
    runBlocking {
        println((1..4).asFlow().first())
    }
    runBlocking {
        var result = (1..4).asFlow().reduce { a, b -> a + b }
        println(result)
    }
}

suspend fun performRequest(request: Int): String {
    delay(1000)
    return "Response $request"
}