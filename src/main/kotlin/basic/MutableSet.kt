fun main(){
    val nameList = mutableListOf(
        "Deddy Corbuzier",
        "Raditya Dika",
        "Arief Muhammad",
        "Tretan Muslim"
    )

    val nameList2 = setOf(
        "Fiki Naki",
        "Turah Parthayana"
    )

    println("Origin -> $nameList")
    println()

    nameList.add("Coki Pardiedie")
    nameList.add("Reza Arap")
    println("Add -> $nameList")
    println()

    nameList.addAll(nameList2)
    println("addAll -> $nameList")
    println()

    nameList.removeAll(nameList2)
    println("removeAll -> $nameList")
    println()

    nameList.addAll(nameList2)
    println("addAll -> $nameList")
    println()
    nameList.retainAll(nameList2)
    println("retainAll -> $nameList")
    println()

    nameList.clear()
    println("clear -> $nameList")
}