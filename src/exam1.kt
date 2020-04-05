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

}