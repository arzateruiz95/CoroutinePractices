package coroutines.practices.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


//Merge the flows
fun main() {
    val nums = (1..3).asFlow()
    val strs = flowOf("1","2","3")
    runBlocking {
        nums.zip(strs){
            a,b -> "Zip: $a -> $b"
         }.collect{
             println(it)
        }
    }
}


