data class Student(
    val id: String,
    val name: String,
    val className: String,
    val gpa: Double
)

fun isValidGpa(gpa: Double): Boolean {
    return gpa >= 0.0 && gpa <= 4.0
}

fun Double.toScale10(): Double {
    return this * 10 / 4
}

fun getAcademicRank(gpa: Double): String {
    return when {
        gpa >= 3.6 -> "Xuat sac"
        gpa >= 3.2 -> "Gioi"
        gpa >= 2.5 -> "Kha"
        gpa >= 2.0 -> "Trung binh"
        else -> "Yeu"
    }
}

fun main() {
    val student = Student(
        "SV001",
        "Nguyen Van A",
        "24T1",
        3.75
    )


    println(student)
    println(isValidGpa(student.gpa))
    println(student.gpa.toScale10())
    println(getAcademicRank(student.gpa))
}