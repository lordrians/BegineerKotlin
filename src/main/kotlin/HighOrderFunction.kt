
private val standartMessage = { println("Hello Gaes!") }

private fun higherFunc(message: () -> Unit) {
    message.invoke()
}

private val customMessage = { name: String ->
    "Halo nama saya $name"
}

private fun printCustomMessage(name: String, message: (String) -> String){
    println(message(name))
}

private val areaRectangle: (Double, Double) -> Double = {length: Double, width: Double ->
    length * width
}
private val perimeterRectangle = {length: Double, width: Double ->
    (length + width).times(2)
}

fun calculateRectangle (
    length: Double,
    width: Double,
    area: (Double, Double) -> Double,
    perimeter: (Double, Double) -> Double
){
    val resultArea = area(length,width)
    val resultPerimeter = perimeter(length,width)
    println("Persegi panjang, panjang = $length & lebar = $width. \nMemiliki Luas = $resultArea & Keliling $resultPerimeter")
}

private fun countMultipleNumberOfThree(
    start: Int,
    end: Int,
    callback: (result: Int) -> Unit
){
    var count = 0
    for (i in start..end){
        if (i % 3 == 0)
            count++
    }
    callback(count)
}

fun main(){
    higherFunc(standartMessage)
    higherFunc{ println("Hello Gaes!") }
    println()

    printCustomMessage("Budi",customMessage)
    println()

    calculateRectangle(4.0, 6.0, areaRectangle, perimeterRectangle)
    println()

    countMultipleNumberOfThree(1,20) { result ->
        println("Terdapat $result angka yang kelipatan 3")
    }
}