fun main(){

    val students = mapOf<Int,String>(
        101001 to "Turah",
        101002 to "Eno",
        101003 to "Ewing",
        101004 to "Qorygore",
        101005 to "Fiki"
    )

    val brandNotebooks = mapOf(
        1 to "Asus",
        2 to "Lenovo",
        3 to "Apple",
        4 to "HP"
    )

    val myProfile = mapOf(
        "id" to 101001,
        "name" to "Qorygore",
        "married" to false,
        "gender" to 'M',
        "job" to "Youtuber"
    )

    println("Students map size -> ${students.size}")
    println()

    println("isEmpty -> ${students.isEmpty()}")
    println()

    println("Contain key \"name\" myProfile Map -> ${myProfile.containsKey("name")}")
    println("Contain value \"married\" myProfile Map -> ${myProfile.containsValue(false)}")
    println()

    println("Get value of Name -> ${myProfile.get("name")}")
    println("Get value of ID -> ${students.get(101002)}")
    println()

    println("Get or default -> ${brandNotebooks.getOrDefault(4,"Uknown")}")
    println("Get or default False -> ${brandNotebooks.getOrDefault(5,"Uknown")}")

    var counter = 0
    for ((key, value ) in myProfile){
        counter++
        println("Data ke-$counter key -> $key & value -> $value")
    }
    println()

    counter = 0
    myProfile.forEach { key, value ->
        counter++
        println("(Foreach) Data ke-$counter key -> $key & value -> $value")
    }

}