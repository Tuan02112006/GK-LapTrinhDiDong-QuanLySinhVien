data class Student(
    val id: String,
    val name: String,
    val className: String,
    val gpa: Double
)

fun isValidGpa(gpa: Double): Boolean {
    return gpa >= 0.0 && gpa <= 4.0
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
}