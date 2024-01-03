package coroutines.practices

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    withContextIO()
}

fun withContextIO()= runBlocking {
    val num1 = withContext(Dispatchers.IO){
        calculateHard(100)
    }
    val num2 = withContext(Dispatchers.IO){
        calculateHard(200)
    }
    val result = num1 + num2
    println(result)
}