package coroutines.practices.flow

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull


//Finished flow without cancel
fun main() {
    runBlocking {
        withTimeoutOrNull(2500) {
            firstFlow().collect { v ->
                println(v)
            }
        }
        println("Done ...")
    }
}
