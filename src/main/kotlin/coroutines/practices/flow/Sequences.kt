package coroutines.practices.flow

fun main() {
    show()
}

fun show() {
    // listed().forEach { i -> println(i) }
    sequences().forEach { i ->
        println(i)
    }
}

fun listed(): List<Int> = listOf(3, 9, 30)

fun sequences(): Sequence<Int> = sequence {
    for (i in 1..3) {
        Thread.sleep(1000)
        yield(i)
    }
}