package org.example.kotlinbyexample.example._01_basic

/**
 * 코틀린은 산술 연산자를 plus (+), minus (-), times (a * b), rem (a % b) 등 함수로 제공한다.
 * 이러한 산술 연산자를 Overloading이 가능한데, operator 키워드를 붙여주면 된다.
 *
 * String.get은 파라미터 N의 Index 자리의 문자를 반환함
 *
 *
 * vararg는 가변인자로 자바에서의 ... 문법과 동일하다.
 * 다만 ... 대신 vararg 키워드를 사용해야하며,
 * 메서드에서 사용 시 vararg는 Array로 변환된다.
 * 따라서 vararg를 파라미터로 받아서, vararg를 사용하는 메서드에 넣어 사용하려고 해도, 타입 missmatch로 사용 불가이다.
 * 이때 변수 앞에 * 키워드를 사용해주면 vararg로 인식하여 파라미터가 전달된다.
 *
 * 메서드 선언 시 파라미터에 vararg 변수 뒤에 또 다른 변수를 선언할 수 있다
 * (자바는 선언 자체가 불가능함)
 * 사용 시 이름 지정 파라미터를 사용한다.
 */
fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "하이 ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Hello, World!"
    println(str[0..4])

    fun printAll(vararg messages: String) {
        for (message in messages) {
            println(message)
        }
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "안녕")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (message in messages) {
            println(prefix + message)
        }
    }
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "안녕", prefix = "Greeting: ")

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "안녕")
}