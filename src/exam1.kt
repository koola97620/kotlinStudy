import java.awt.Rectangle

/**
 *
 * @project kotlinexam
 * @author choijaeyong on 2020/04/05.
 * @description
 */
class exam1 {

    fun sum(a: Int, b: Int): Int {
        return a+b;
    }

    fun sum2(a: Int, b: Int) = a+b

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a+b}")
    }

    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a+b}")
    }

    fun printString() {
        var a = 1
        val s1 = "a is $a"

        a = 2
        val s2 = "${s1.replace("is","was")}, but now is $a"
    }

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxOfKt(a: Int, b: Int) = if(a>b) a else b

    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }
        return null
    }

    fun getStringLength2(obj: Any): Int? {
        if (obj !is String) return null
        return obj.length
    }

    fun getStringLength3(obj: Any): Int? {
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }

    fun loopExam() {
        val items = listOf("apple","banana","kiwifruit")
        for (item in items) {
            println(item)
        }

        val items2 = listOf("apple","banana","kiwifruit")
        for (index in items2.indices) {
            println("item at $index is ${items2[index]}")
        }

        val items3 = listOf("apple","banana","kiwifruit")
        var index = 0
        while (index < items3.size) {
            println("item at $index is ${items3[index]}")
            index++
        }

        val x = 10
        val y = 9
        if (x in 1 .. y+1) {
            println("fits in range")
        }

        val list = listOf("a","b","c")
        if(-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if(list.size !in list.indices) {
            println("list size is out of valid list indice range, too")
        }
        for ( x in 1..5) {
            print(x)
        }
        for ( x in 1..10 step 2) {
            print(x)
        }
        println()
        for(x in 9 downTo 0 step 3) {
            print(x)
        }
    }

    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "hello" -> "greeting"
            is Long -> "Long"
            !is String -> "not a string"
            else -> "unknown"
        }


    fun init() {
        val a: Int = 1
        val b = 2
        val c: Int
        c = 3

        var x = 5
        x += 1
    }

    val PI = 3.14
    var t = 0
    fun increment() {
        t += 1
    }

    fun collectionExam() {
        val list = listOf("a","b","c")
        for (item in list) {
            println(item)
        }

        when {
            "orange" in list -> println("juicy")
            "apple" in list -> println("apple is fine too")
        }

        val fruits = listOf("apple","banana","kiwifruit")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

        val rectangle = Rectangle(5,2)


    }

}