package org.example.kotlinbyexample.example._01_basic

/**
 * 코틀린은 기본적으로 모든 키워드가 final이며, Class도 마찬가지이다.
 * Class가 final이면 상속이 불가능한데 이것을 가능하게 해주는 키워드는 open이다.
 * 상속을 받을때는 자바와 다르게 extends가 아닌 : 을 사용한다.
 */
open class Dog {
    open fun sayHello() {
        println("멍멍!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("왈왈!")
    }
}

fun main() {
    val dog1 = Dog()
    val dog2: Dog = Yorkshire()
    val dog3 = Yorkshire()

    dog1.sayHello()
    dog2.sayHello()
    dog3.sayHello()
}