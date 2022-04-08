
//fun main() {
//    val x = 5
//
//    findOddNumber(end = x)
//    println()
//
//    println("(Non Tail Rekursif) Faktorial dari $x adalah ${factorial(x)}")
//    println("(Tail Rekursif) Faktorial dari $x adalah ${factorialTailRecursive(x)}")
//    println()
//
//    println("(Non Tail Rekursif) Perjumlahan Angka 0 - $x adalah ${findSum(x)}")
//    println("(Tail Rekursif) RekurPerjumlahan Angka 0 - $x adalah ${findSumTailRecursive(x)}")
//}

//Simple Recursive
fun findOddNumber(start: Int = 0, end: Int) {
    if (start <= end){
        if (start % 2 == 0){
            findOddNumber(start + 1, end)
        } else {
            println("Terdapat Bilangan Ganjil -> $start")
            findOddNumber(start + 1, end)
        }
    }
}

//Non Tail Recursive
fun factorial(number: Int): Int{
    return if (number == 1){
        number
    } else {
        number * factorial(number - 1)
    }
}

//Tail Recursive
tailrec fun factorialTailRecursive(number: Int, run: Int = 1): Int{
    return if (number == 1){
        run
    } else {
        factorialTailRecursive(number - 1, run * number)
    }
}

//Non Tail Recursive
fun findSum(num: Int, stepTotal: Int = 0): Int {
    return if (num == 0) {
        stepTotal
    }
    else {
        num + findSum(num - 1)
    }
}

//Tail Recursive
tailrec fun findSumTailRecursive(num: Int, stepTotal: Int = 0): Int {
    return if (num == 0) {
        stepTotal
    }
    else {
        findSumTailRecursive(num - 1, stepTotal + num)
    }
}


