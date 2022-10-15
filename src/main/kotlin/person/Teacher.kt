package person

class Teacher(name: String, noKtp: String) : Person(name,noKtp){

    override fun displayJob() {
        println("Saya adalah seorang guru SMA, pekerjaan saya mengajar.")
    }

    fun teaching(classroomName: String){
        println("Saya akan mengajar kelas $classroomName sekarang")
    }

    fun giveAssessment(classroomName: String, gradesList: MutableList<Double>){
        val averageGrade = getAverageGrade(gradesList)
        println("Penilaian saya terhadap kelas $classroomName memiliki rata - rata $averageGrade")
    }

    private fun getAverageGrade(gradesList: MutableList<Double>): Double {
        var totalGrade = 0.0
        val totalStudent = gradesList.size
        gradesList.forEach { grade ->
            totalGrade += grade
        }
        return totalGrade.div(totalStudent)
    }

}