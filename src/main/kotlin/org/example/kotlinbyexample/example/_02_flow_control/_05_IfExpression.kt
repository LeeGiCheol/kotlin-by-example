package org.example.kotlinbyexample.example._02_flow_control

/**
 * 코틀린은 3항 연산자가 없다.
 * 대신 if문을 그대로 return 할 수 있다.
 *
 * fun max(a: Int, b: Int): Int {
 *     return if (a > b) {
 *         a
 *     } else {
 *         b
 *     }
 * }
 *
 * expression이 하나 밖에 없기 때문에 아래 main 메서드처럼 expression body function으로 간결하게 사용할 수 있다.
 */
fun main() {
    println(max(99, -42))
}

fun max(a: Int, b: Int) = if (a > b) a else b

