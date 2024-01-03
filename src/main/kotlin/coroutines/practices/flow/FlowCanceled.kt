package coroutines.practices.flow
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Calling flow ...")
        var flow = firstFlow()
        println("Collect ..")
        flow.collect { v ->
            println(v)
        }
        println("Collect again ..")
        flow.collect { v ->
            println(v)
        }
    }
}
