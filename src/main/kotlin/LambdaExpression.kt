
val standartMessage = { println("Hello Gaes!") }

val sumNumber: (Int, Int) -> Int = {a: Int, b: Int ->
    a + b
}

val divideNumber = { a: Double, b: Double ->
    val result = a.div(b)
    result.toString()
}

val calculateGrade = { grade: Int ->
    when (grade) {
        in 0..40 -> "NILAI KAMU BURUK"
        in 41..70 -> "NILAI KAMU STANDAR"
        in 71..100 -> "NILAI KAMU LUAR BIASA"
        else -> "Input Nilai Salah, Harap Ulang 0 - 100"
    }
}

//fun main(){
//    val x = 5
//    val y = 8
//    val lowGrade = 30
//    val midGrade = 50
//    val highGrade = 80
//    val listNumber = listOf(3,2,5,4,4,6,6,8,1,7,9,4,5,6,7,0,9,10)
//
//    standartMessage()
//    standartMessage.invoke()
//
//    println("$x + $y = ${sumNumber(x,y)}")
//    println()
//
//    println("$y : $x = ${divideNumber(y.toDouble(), x.toDouble())}")
//    println()
//
//
//    println("Bagaimana Nilai Saya Hasil ($lowGrade) ? ${calculateGrade(lowGrade)} ")
//    println("Bagaimana Nilai Saya Hasil ($midGrade) ? ${calculateGrade(midGrade)} ")
//    println("Bagaimana Nilai Saya Hasil ($highGrade) ? ${calculateGrade(highGrade)} ")
//    println()
//
//    val filteredNumber = listNumber.filter { it < 5 }.sorted()
//    println("Awal List Number -> $listNumber")
//    println("Setelah di filter List Number -> $filteredNumber")
//
//    println()
//
//    val oddNumber = listNumber.filter { number ->
//        number % 2 != 0
//    }.sorted()
//    println("Awal List Number -> $listNumber")
//    println("Setelah di filter List Number -> $oddNumber")
//
//}
