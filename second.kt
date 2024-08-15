fun main(args:Array<String>){
    var a = 40
    print(a)
    var try = 40
    print(try)  // This will not work because try is a keyword
}

fun main(args:Array<String>){
    var a = 40
    print(a)
    var `try` = 40
    print(`try`)  // This will work because try is not a keyword now
}

fun main(args:Array<String>){
    var a = 40
    a=40.5
    print(a) // This will give error as per type interferance
    var TRY = 40
    print(TRY)
}