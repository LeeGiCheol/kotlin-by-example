package org.example.kotlinbyexample.example._01_basic

/**
 * Generic은 자바와 큰 차이 없이 사용 할 수 있다.
 */
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek() = elements.last()

    fun pop() = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String {
        return "MutableStack(${elements.joinToString()})"
    }

}

fun main() {
    val mutableStack = MutableStack("test1", "test2", "test3")
    println(mutableStack)
    mutableStack.push("test4")
    println(mutableStack)

    println("peek(): ${mutableStack.peek()}")
    println("size(): ${mutableStack.size()}")
    println(mutableStack)
    println("pop(): ${mutableStack.pop()}")
    println(mutableStack)
    for (i in 1..mutableStack.size()) {
        println("$i pop(): ${mutableStack.pop()}")
        println(mutableStack)
    }
    println("isEmpty(): ${mutableStack.isEmpty()}")


    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

    val mutableStackOf = mutableStackOf(0.62, 3.14, 2.7)
    println(mutableStackOf)
}