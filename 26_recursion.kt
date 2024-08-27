var count = 0
fun rec(){
    count++0
    if(count <= 5){
        println("Hello " + count)
        rec()
    }
}

fun main(){
    rec()
}