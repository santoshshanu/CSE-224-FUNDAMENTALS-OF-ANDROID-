fun main() {
    // Standard Library Functions

    // print() / println()
    print("Hello, ") // No newline
    println("Kotlin!") // With newline

    // arrayOf()
    val array = arrayOf(1, 2, 3)
    println("Array: ${array.joinToString()}")

    // listOf()
    val list = listOf(1, 2, 3)
    println("List: $list")

    // mapOf()
    val map = mapOf("a" to 1, "b" to 2)
    println("Map: $map")

    // setOf()
    val set = setOf(1, 2, 3)
    println("Set: $set")

    // apply(): Executes a block of code on an object and returns the object
    val myList = mutableListOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }
    println("List after apply: $myList")

    // let(): Executes a block of code on an object and returns the result of the block
    val letResult = myList.let {
        it.sum()
    }
    println("Result of let: $letResult")

    // run(): Combines let and with, allows executing code with a receiver and returns the result
    val runResult = myList.run {
        sum()
    }
    println("Result of run: $runResult")

    // also(): Executes a block of code on an object and returns the object
    val alsoResult = myList.also {
        println("Inside also: $it")
    }
    println("Result of also: $alsoResult")

    // takeIf(): Returns the object if it matches the given predicate, otherwise null
    val number = 10
    val takeIfResult = number.takeIf { it > 5 }
    println("Result of takeIf: $takeIfResult")

    // takeUnless(): Returns the object if it doesn't match the given predicate, otherwise null
    val takeUnlessResult = number.takeUnless { it < 5 }
    println("Result of takeUnless: $takeUnlessResult")

    // with(): A non-extension function that takes an object and applies a block of code to it
    val withResult = with(myList) {
        sum()
    }
    println("Result of with: $withResult")
}
