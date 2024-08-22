class Person{
    var name: String = "John Doe"
    val age: Int = 30
    fun displayInfo(){
        println("Name: $name, Age: $age")
    }
}

fun main(){
    val person = Person()
    person.displayInfo()
}