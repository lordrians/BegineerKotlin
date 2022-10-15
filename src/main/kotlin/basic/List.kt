fun main(){
    val nameList: List<String> = listOf(
        "Deddy Corbuzier",
        "Raditya Dika",
        "Arief Muhammad",
        "Qorygore",
        "Dustin Tiffany",
        "Tretan Muslim",
        "Qorygore",
        "Coki Pardede"
    )

    val list = listOf(
        "Raditya Dika",
        "Arief Muhammad",
        "Tretan Muslim"
    )


    println()
    println(nameList[2])
    println(nameList.indexOf("Qorygore"))
    println(nameList.lastIndexOf("Qorygore"))
    println("Size list -> ${nameList.size}")
    println("NameList contain \"Qorygore\" -> ${nameList.contains("Qorygore")}")
    println("NameList contain List -> ${nameList.containsAll(list)}")
    println(nameList.subList(2,5))
    println(nameList.isEmpty())
    println(nameList.isNotEmpty())
    println(nameList.drop(2))
    println(nameList.dropLast(2))

}