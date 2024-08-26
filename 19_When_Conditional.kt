import java.util.*

fun main(){
    val read = Scanner(System.`in`)
    println("Enter your choice: ")
    val choice = read.nextInt()

    when(choice){
        1 -> {
            println("Start the program")
        }
        2 -> {
            println("Ending of the program")
        }
        else -> {
            println("Wrong input")
        }
    }
}