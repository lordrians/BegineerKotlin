package person

abstract class Person(
    private val name: String,
    private val noKtp: String
    ) {

    abstract fun displayJob()

    fun displayName(){
        println("Nama saya adalah $name")
    }
    fun displayNoKtp(){
        println("Nomor No KTP saya = $noKtp")
    }
}