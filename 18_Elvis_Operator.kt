fun main(){
    var string1: String? = null
    var string2: String = "May be declase nullable string"
    var len1: Int = string1 ?. length ?: -1
    var len2: Int = string2 ?. length ?: -1

    println("Length of the string1: ${len1}")
    println("Length of the string2: ${len2}")

}