package person

import basic.toIdrFormat

class SoftwareDeveloper(name: String, noKtp: String) : Person (name,noKtp){

    override fun displayJob() {
        println("Saya seorang Software Developer, pekerjaan saya membuat aplikasi / website.")
    }

    fun coding(feature: String){
        println("Sekarang saya akan membuat kode untuk fitur $feature")
    }

    fun analyzeBug(feature: String, bug: String){
        println("Saya mendapatkan bug $bug di fitur $feature, akan saya selidiki lebih lanjut")
    }

    fun mySalaryRate(rateHourSalary: Int){
        val mySalaryDesc = calculateSalary(rateHourSalary)
        println("Berikut adalah perhitungan rate gaji saya :$mySalaryDesc")
    }

    private fun calculateSalary(rateHourSalary: Int) : String {
        val daysMonth = 20 // work time
        val daysWeek = 5 // work time
        val hoursDay = 12 // work time

        val salaryDay = (rateHourSalary * hoursDay)
        val salaryWeek = (salaryDay * daysWeek)
        val salaryMonth = (salaryDay * daysMonth)

        return "\nGaji per Hari = ${salaryDay.toIdrFormat()}" +
                "\nGaji per Minggu = ${salaryWeek.toIdrFormat()}" +
                "\nGaji per Bulan = ${salaryMonth.toIdrFormat()}"
    }

}