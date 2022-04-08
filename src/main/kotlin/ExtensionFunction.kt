import java.text.NumberFormat
import java.util.*

//fun main() {
//    val x = 5
//    val y = 4
//    val number = 15000
//    println("Apakah angka $x bilangan Ganjil? ${x.isOdd()}")
//    println("Apakah angka $y bilangan Ganjil? ${x.isOdd()}")
//    println()
//
//    println("Apakah angka $x bilangan Genap? ${x.isEven()}")
//    println("Apakah angka $y bilangan Genap? ${x.isEven()}")
//    println()
//
//    println("Idr Format $number -> ${number.toIdrFormat()}")
//    println()
//
//    val myRectangle = Rectangle(2,4)
//    println("Keliling lingkaran -> ${myRectangle.perimeter()}")
//    println("Luas lingkaran -> ${myRectangle.area()}")
//}

fun Int.isOdd() = this % 2 != 0
fun Int.isEven() = this % 2 == 0

fun Int.toIdrFormat(): String {
    val localId = Locale("in", "ID")
    val formatter = NumberFormat.getCurrencyInstance(localId)
    return formatter.format(this)
}

class Rectangle(val length: Int, val width: Int) {

    fun perimeter() = (2 * length) + (2 * width)
    fun area() = length * width

}