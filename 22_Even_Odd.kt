fun main() {
    val numbers = arrayOf(12, 7, 5, 26, 19, 18, 35, 24)

    val even = mutableListOf<Int>()
    val odd = mutableListOf<Int>()

    for (number in numbers) {
        if (number % 2 == 0) {
            even.add(number)
        } else {
            odd.add(number)
        }
    }
    println("Even numbers: $even")
    println("Odd numbers: $odd")
}
