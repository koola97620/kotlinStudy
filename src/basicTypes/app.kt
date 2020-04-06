package basicTypes

fun main() {
    fun printDouble(d: Double) {
        print(d)
    }

    printDouble(1.1)
    println()

    var a: Int? = 10
    a = 1
    println(a)






}

fun exam1() {
    val a: Int = 1000
    println(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)
    println(boxedA == anotherBoxedA)
}

fun exam2() {
    val a: Int? = 1
    val b: Long? = 1L
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalArgumentException("out of range")
    }
    return c.toInt() - '0'.toInt()
}