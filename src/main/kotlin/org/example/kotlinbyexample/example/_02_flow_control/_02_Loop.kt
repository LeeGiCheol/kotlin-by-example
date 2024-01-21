package org.example.kotlinbyexample.example._02_flow_control

fun main() {
    forLoop()
    `while do while`()

    val zoo = Zoo(listOf(Animal("얼룩말"), Animal("사자")))
    for (animal in zoo) {
        println("animal name ${animal.name}")
    }
}

fun forLoop() {
    val cakes = listOf("당근", "치즈", "초콜릿")

    for (cake in cakes) {
        println("$cake 케이크")
    }
}

fun `while do while`() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

private fun eatACake() {
    println("케이크 먹기")
}
private fun bakeACake() {
    println("케이크 만들기")
}

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}