package org.example.kotlinbyexample.example._01_basic

/**
 * 코틀린의 클래스는 생성자나 본문이 없는 경우 block을 모두 생략할 수 있다.
 */
class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "a@a.com")

    println(contact.id)
    contact.email = "b@b.com"
}