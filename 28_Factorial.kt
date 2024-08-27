import java.util.*

fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) 1 else n * factorial(n - 1)
}

fun main() {
    val read = Scanner(System.`in`)
    print("Enter the number: ")
    val number = read.nextInt()
    println("Factorial of $number = ${factorial(number)}")
}
