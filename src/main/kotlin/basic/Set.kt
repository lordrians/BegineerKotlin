fun main(){
    val nameList = setOf(
        "Deddy Corbuzier",
        "Raditya Dika",
        "Arief Muhammad",
        "Qorygore",
        "Arief Muhammad",
        "Raditya Dika",
        "Dustin Tiffany",
        "Tretan Muslim",
        "Deddy Corbuzier",
    )

    val nameList2 = setOf(
        "Deddy Corbuzier",
        "Arief Muhammad"
    )

    println(nameList)
    println("Size -> ${nameList.size}")
    println()
    var counter = 0

    nameList.forEach {
        counter++
        println("Foreach ke-$counter -> $it")
    }
    println()
    println("Element 3 -> ${nameList.elementAt(2)}")
    println()
    println("Element 3 -> ${nameList.minusElement("Arief Muhammad")}")
    println()
    println("Element 3 -> ${nameList.plus("Ewing 4K")}")
    println()

    println("isEmpty -> ${nameList.isEmpty()}")
    println("Contain -> ${nameList.contains(nameList2.elementAt(1))}")
    println("ContainsAll -> ${nameList.containsAll(nameList2)}")

}