package coroutines.practices

fun main(args: Array<String>){
    blocking()

}

fun longTaskWithMessage(message :String){
    Thread.sleep(4000)
    println(message + Thread.currentThread().name)
}

fun blocking(){
    println("Task 1 " + Thread.currentThread().name)
    longTaskWithMessage("Task 2")
    println("Task 3 " + Thread.currentThread().name)
}