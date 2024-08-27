import java.util.*

fun Sum(n: Int): Int {
    return if (n == 0) 0 else n + Sum(n - 1)
}

fun main() {
    val read = Scanner(System.`in`)
    print("Enter the range: ")
    val range = read.nextInt()

    println("Sum of n numbers: ${Sum(range)}")
}
