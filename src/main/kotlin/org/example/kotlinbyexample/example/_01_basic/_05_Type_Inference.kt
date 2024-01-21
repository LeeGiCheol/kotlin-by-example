package org.example.kotlinbyexample.example._01_basic

import kotlin.reflect.typeOf

/**
 * 기본적으로 변수 선언 시 타입을 명시해줘야 함
 * 그러나 코틀린은 타입 추론 기능이 있기 때문에 어떤 타입인지 추론이 된다면 타입 작성을 하지 않아도 된다.
 * ex) val c = 3
 * c는 Int 타입으로 추론
 * ex) val e = 300000000000000
 * e는 Long 타입으로 추론
 */
fun main() {
    var a: String = "처음 값"
    println(a)

    val b: Int = 1

    val c = 3
    println(c.javaClass.name)

    val d = 300000000000000
    println(d.javaClass.name)

    val e: Int
    if (1==1) e=1
    else e= 2
    println(e)
}
