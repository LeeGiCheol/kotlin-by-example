package org.example.kotlinbyexample.example._01_basic

/**
 * infix: 파라미터 두개 사이에 함수를 사용하는 문법 (확장 함수)
 *        -> infix fun Int.times(str: String) = str.repeat(this)
 *           예시의 경우 Int 타입 하위의 함수를 선언한다.
 *           파라미터로 String을 받는 times 이며, (함수명은 자유)
 *           times는 Int 타입을 파라미터로 받는 String.repeat(this) <- 파라미터 사이즈 만큼 String을 반복 하여 리턴
 *
 *           사용 시 2 times "Bye " 와 같이 특이한 방식으로 호출한다.
 *           상위타입 infixFunction Parameter 구조로 되어있다.
 *
 *           infix 함수를 일반적인 호출 방법인 아래 방법으로도 이상없이 동작한다.
 *           "코틀린".onto("젯브레인스")
 *
 *           infix 함수는 선언한 곳에서만 사용 가능함 (Local Scope)
 */
fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")
    println(2.times("Bye "))

    val pair = "자바" to "오라클"
    println("pair = $pair")

    infix fun String.onto(other: String) = Pair(this, other)
    var myPair = "코틀린" onto "젯브레인스"
    println("myPair = $myPair")

    val lee = Person("Lee")
    val kim = Person("Kim")
    lee likes kim
    println(lee.likedPeople.map { it.name })
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) = likedPeople.add(other)
}