package org.example.kotlinbyexample.example._02_flow_control

/**
 * 코틀린은 구조적으로 비교할 때 == 을 사용하고, 참조 값을 비교할 때 ===을 사용한다.
 * a == b 는 아래와 같이 컴파일 된다.
 *  a == null ? b == null : a.equals(b)
 *
 * a === b 는 아래와 같이 컴파일 된다.
 *  a == b
 * 자바와 비교했을 때 ==은 equals, ===은 ==의 역할을 한다고 봐도 무방할 것으로 보인다.
 */
fun main() {
    var authors = setOf("셰익스피어", "헤밍웨이", "트웨인")
    var writers = setOf("트웨인", "셰익스피어", "헤밍웨이")

    println(authors == writers)
    println(authors === writers)
}