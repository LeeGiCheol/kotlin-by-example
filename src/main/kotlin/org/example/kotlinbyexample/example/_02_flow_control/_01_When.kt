package org.example.kotlinbyexample.example._02_flow_control

/**
 * switch 대신해 when 조건문을 사용한다.
 * break를 사용하지 않아 간결한 문법으로 쓸 수 있다.
 *
 * when 조건문은 값을 반환하기 때문에 expression으로 사용할 수도 있다.
 */
fun main() {
    cases("")
    cases("Hello")
    cases(1)
    cases(0L)
    cases(TestClass())
    cases("hello")

    println(whenAssign("안녕"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(TestClass()))
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("하나")
        "Hello" -> println("인사")
        is Long -> println("Long")
        !is String -> println("문자열 아님")
        else -> println("그 외")
    }
}

fun whenAssign(obj: Any): Any = when (obj) {
    1 -> "하나"
    "안녕" -> 1
    is Long -> false
    else -> 42
}

class TestClass