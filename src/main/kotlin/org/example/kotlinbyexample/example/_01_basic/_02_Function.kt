package org.example.kotlinbyexample.example._01_basic

/**
 * 1. fun printMessage(message: String)
 *     -> 가장 일반적인 방식의 Void 반환 메서드
 * 2. fun printMessageWithPrefix(message: String, prefix: String = "Info")
 *     -> 매개변수 부분에 default parameter를 작성할 수 있다.
 *        쌍따옴표 내부에 $ 기호를 사용하면 쌍따옴표 내부에서도 변수를 사용할 수 있다
 *        자바스크립트의 백틱과 비슷한 역할을 하는 것으로 추정
 *     -> 이름 지정 파라미터를 사용하기 때문에 메서드 호출 시 파라미터의 이름을 작성해준다면, 순서가 뒤바껴도 정상적으로 동작한다.
 * 3. fun sum(x: Int, y: Int): Int
 *     -> 가장 일반적인 방식의 Int 반환 메서드
 * 4. fun multiply(x: Int, y: Int) = x * y
 *     -> 메서드의 반환이 단일 표현식인 경우 Block을 생성하지 않고, 한줄로 작성할 수 있다
 *        또한 매개변수로써 해당 value가 어떠한 타입인지 알고 있기 때문에, 리턴 타입은 타입 추론을 할 수 있다.
 */
fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(5, 7))
    println(multiply(3, 6))


}