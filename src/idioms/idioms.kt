package idioms

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.ArithmeticException
import kotlin.IllegalArgumentException


class idioms {
    fun exam1() {
        val list = listOf<Int>(1,4,7,1,4,2,3,1,-3)
        val positives = list.filter { x -> x > 0 }
        val positives2 = list.filter { it > 0 }
        val emailList = listOf<String>("aaaa","bbbb","cccc")
        for (email in emailList) {
            if (email.startsWith("aa")) {
                println("email is $email ...")
            }
        }
        val map = mapOf("a" to 1 , "b" to 2, "c" to 3)
        for ( (k,v) in map) {
            println("$k -> $v")
        }

        val files = File("test").listFiles()
        println(files?.size ?: "empty")
    }

    fun exam2() {
        val emails = listOf("a","bc","d")
        val email = emails.firstOrNull() ?: ""

        emails.let {  }
    }

    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("invalid color param value")
        }
    }

    fun test() {
        val result = try {
            count()
        } catch (e : ArithmeticException) {
            throw IllegalArgumentException(e)
        }
    }

    fun count() {

    }

    data class Customer(val name: String, val email: String)
    fun foo(a: Int=0, b: String="" ) {}

    fun arrayOfMinusOnes(size: Int) : IntArray {
        return IntArray(size).apply { fill(-1) }
    }

    fun transform2(color: String): Int = when(color) {
        "red" -> 0
        "green" -> 1
        else -> throw IllegalArgumentException("illegal")
    }

    class Turtle {
        fun penDown() {}
        fun penUp() {}
        fun turn(degrees: Double) {}
        fun forward(pixels: Double) {}
    }

    fun turtleExam() {
        val turtle = Turtle()
        with(turtle) {
            penDown()
            for (i in 1..4) {
                forward(100.0)
                turn(90.0)
            }
            penUp()
        }
    }

    fun tryWithResources() {
        val stream = Files.newInputStream(Paths.get("/some/file.txt"))
        stream.buffered().reader().use { reader -> println(reader.readText()) }

    }
}

