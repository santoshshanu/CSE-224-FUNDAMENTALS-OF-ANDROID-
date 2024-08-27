class Person(val name: String, val age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob", 30)

    person1.introduce()
    person2.introduce()
}
