fun main(){
    // For Loop
    println("Code for For Loop: ")
    for(i in 1..5){
        println(i)
    }
    for(i in 6 until 10){
        println(i)
    }
    for(i in 1..5 step 2){
        println(i)
    }
    for(i in 5 downTo 1 step 2){
        println(i)
    }

    // While Loop
    println("Code for While Loop: ")
    var i = 3
    while(i<8){
        println(i)
        i++
    }

    // Do-While Loop
    println("Code for Do-While Loop: ")
    var j = 8
    do{
        println(j)
        j++
    }while(j>10)
}