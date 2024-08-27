import java.util.*

fun Sum(n: Int): Int {
    if (n < 1) return 0
    return if (n % 2 == 0) n + Sum(n - 2) else Sum(n - 1)
}

fun main() {
    val read = Scanner(System.`in`)
    print("Enter the range: ")
    val range = read.nextInt()

    println("Sum of even numbers from 1 to $range: ${Sum(range)}")
}
