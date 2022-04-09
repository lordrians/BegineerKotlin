fun main(){

    val myProfile = mutableMapOf(
        "id" to 101001,
        "name" to "Qorygore",
        "married" to false,
        "gender" to 'M',
        "job" to "Youtuber"
    )

    val randomMap = mutableMapOf(
        "subscriber" to 7000000,
        "retired" to false
    )

    println("Original myProfile -> $myProfile")
    println()

    myProfile.put("age", 30)
    println("add new -> $myProfile")
    println()

    myProfile.put("job", "Musician")
    println("update job -> $myProfile")
    println()

    myProfile.remove("gender")
    println("remove key -> $myProfile")
    println()

    myProfile.putAll(randomMap)
    println("putAll with randomMap -> $myProfile")

}