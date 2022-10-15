import basic.toIdrFormat
import product.ProductUseCase
import product.ProductUseCaseImpl

fun main() {

//    val className = "XI IPA 2"
//    val listGrade = mutableListOf(
//        80.55,
//        55.25,
//        78.75,
//        45.50,
//        95.25,
//        85.05,
//        88.00,
//        90.50,
//        98.00,
//        88.00,
//    )
//    val feature = "Register"
//    val bug = "Null Pointer Exception (null data)"
//
//    val herman = Teacher(
//        name = "Herman",
//        noKtp = "321343993939"
//    )

//    herman.displayName()
//    herman.displayNoKtp()
//    herman.displayJob()
//    herman.teaching(className)
//    herman.giveAssessment(className, listGrade)
//    println()
//    println()
//    val rudi = SoftwareDeveloper("Rudi", "1100201")
//    with(rudi){
//        displayName()
//        displayNoKtp()
//        displayJob()
//        coding(feature)
//        analyzeBug(feature, bug)
//        mySalaryRate(50000)
//    }

    val productUseCase: ProductUseCase = ProductUseCaseImpl()

    val product = productUseCase.getProduct("A1")
    println("produk -> $product")


//    myIntro()
//    myIntro("Budi")
//    myIntro("Budi", "Depok")


//    print(cekKota("C"))
//    hitungBiaya(10)


}

fun cekKota(kota: String) : String {
    if (kota == "A"){
        return "Bekasi"
    }
    if (kota == "B"){
        return "Depok"
    }
    return "Bogor"
}

fun hitungBiaya(jmlOrang: Int){
    val totalBiaya = 500000
    val biayarPerorang = totalBiaya/jmlOrang
    println("Biaya per orang = ${biayarPerorang.toIdrFormat()}")
}

//fun myIntro(){
//    println("Halo ges!")
//}
//
//fun myIntro(name: String){
//    println("Halo ges, kenalin gw $name")
//}
//
//fun myIntro(name: String, asalKota: String){
//    println("Halo ges, kenalin gw $name tinggal di kota $asalKota")
//}


