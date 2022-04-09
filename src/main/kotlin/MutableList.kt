fun main(){
    val nameList = mutableListOf(
        "Deddy Corbuzier",
        "Raditya Dika",
        "Arief Muhammad",
        "Qorygore",
        "Dustin Tiffany",
        "Tretan Muslim",
        "Qorygore",
        "Coki Pardede"
    )

    val nameList2 = mutableListOf(
        "Ewing 4K",
        "Nessie Judge"
    )
    val nameList3 = mutableListOf(
        "Fiki Naki",
        "Turah Parthayana"
    )
    val nameList4 = mutableListOf(
        "Ridwan Hanif",
        "Motomobi TV",
        "Fitra Eri"
    )

    println(nameList)
    println()

    println(nameList[2])
    println()

    nameList.add(2,"Reza Arap")
    println("add -> $nameList")
    println()

    nameList.addAll(2,nameList3)
    println("addAll -> $nameList")
    println()

    nameList.removeAll(nameList3)
    println("removeAll -> $nameList")
    println()

    nameList.removeAt(2)
    println("removeAt -> $nameList")
    println()

    nameList.set(2,"Praz Teguh")
    println("set -> $nameList")
    println()

    nameList2.addAll(nameList3)
    println("addAll -> $nameList2")
    println()
    nameList2.retainAll(nameList3)
    println("retainAll -> $nameList2")
    println()

    println("subList -> ${nameList.subList(2,5)}")
    println()

    val copyList = nameList.toList()
    println("nameList -> $nameList")
    println("copyList -> $copyList")
    println()

    nameList.clear()
    println("nameList Clear -> $nameList")




}
