package com.myapp.lab5

enum class Position(var text: String) {
    TEACHER("Teacher"),
    HEAD("Head teacher"),
    DEAN("Dean")
}

enum class Degree(var text: String) {
    BACHELOR("Bachelor's degree"),
    MASTER("Master's degree"),
    DOCTOR("Doctor of Philosophy")
}

enum class ScientificTitle(var text: String) {
    ASSISTANT("Research Assistant"),
    CANDIDATE("Candidate of Sciences"),
    DOCTOR("Doctor of Philosophy")
}

data class TeacherState(
    var isShowingInfo: Boolean = false,
    var surname: String = "",
    var firstName: String = "",
    var patronymic: String = "",
    var position: Position = Position.TEACHER,
    var degree: Degree = Degree.BACHELOR,
    var scientificTitle: ScientificTitle = ScientificTitle.ASSISTANT,
    var address: String = "",
    var phone: String = "0-000-000-00",
    var married: Boolean = false,
    var numberOfChildren: String = "0",
    var rollNumber: String = "",
    var salary: String = "",
    var dateOfEmployment: String = "00/00/00",
    var department: Department = Department(
        nameOfTheDepartment = "",
        numberOfTeachers = "",
        manager = Manager(
            surname = "",
            firstName = "",
            patronymic = "",
            address = "",
            phone = "0-000-000-00",
            homePhone = "0-000-000-00",
        ),
    ),
)

class Department(
    var nameOfTheDepartment: String,
    var numberOfTeachers: String,
    var manager: Manager,
)

class Manager(
    var surname: String,
    var firstName: String,
    var patronymic: String,
    var address: String,
    var phone: String,
    var homePhone: String,
)
