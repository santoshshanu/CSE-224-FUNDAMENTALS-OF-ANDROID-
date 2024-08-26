fun main() {
    val a = true
    val b = false

    println("Logical AND (a && b): ${a && b}")
    println("Logical OR (a || b): ${a || b}")
    println("Logical NOT (!a): ${!a}")
    println("Logical XOR (a xor b): ${a xor b}")

    // Bitwise operations
    val x = 0b1100
    val y = 0b1010

    println("Bitwise AND (x & y): ${x and y}")
    println("Bitwise OR (x | y): ${x or y}")
    println("Bitwise XOR (x ^ y): ${x xor y}")
    println("Bitwise NOT (~x): ${x.inv()}")

    // Shifting operations
    val z = 0b0001
    println("Left Shift: ${z shl 2}")
    println("Right Shift: ${z shr 1}")
    println("Unsigned Right Shift: ${z ushr 1}")

    // Compound Assignment with Bitwise operations
    var result = x
    result = result and y
    println("Compound AND Assignment (result &= y): $result")
    result = x
    result = result or y
    println("Compound OR Assignment (result |= y): $result")
    result = x
    result = result xor y
    println("Compound XOR Assignment (result ^= y): $result")
}
