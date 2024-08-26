import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    
    print("Enter first value: ")
    val a = read.nextInt()
    
    print("Enter second value: ")
    val b = read.nextInt()
    
    println("Choose an operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    
    val choice = read.nextInt()

    when (choice) {
        1 -> {
            val result = a + b
            println("The result of addition is: $result")
        }
        2 -> {
            val result = a - b
            println("The result of subtraction is: $result")
        }
        3 -> {
            val result = a * b
            println("The result of multiplication is: $result")
        }
        4 -> {
            if (b != 0) {
                val result = a / b
                println("The result of division is: $result")
            } else {
                println("Error: Division by zero is not allowed.")
            }
        }
        else -> {
            println("Invalid choice. Please select a valid operation.")
        }
    }
}
