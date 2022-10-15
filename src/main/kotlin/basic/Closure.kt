
fun main(){
    var res = 0
    val myList = listOf(1,2,3,4,5,6,7,8,9,10)
    myList.forEach {
        res+=it
    }
    println(res) //prints 55

    var counter = 0

    val standarMessage = {
        println("Halo Gaes!")
        counter++
    }

//    println("counter Awal -> $counter")
//    standarMessage.invoke()
//    standarMessage.invoke()
//    standarMessage.invoke()
//    standarMessage.invoke()
//    println("counter Akhir -> $counter")
}