class Car {
    var make: String = ""
    var model: String = ""
    var year: Int = 0
    
    fun getInfo(): String {
        return "$make $model, year $year"
    }
}

fun main() {
    val car1 = Car()
    car1.make = "Toyota"
    car1.model = "Corolla"
    car1.year = 2020
    
    val car2 = Car()
    car2.make = "Ford"
    car2.model = "Mustang"
    car2.year = 1969
    
    println(car1.getInfo())
    println(car2.getInfo())
}
