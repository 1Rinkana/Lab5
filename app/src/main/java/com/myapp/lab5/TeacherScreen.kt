package com.myapp.lab5

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeacherScreen(
    state: TeacherState,
    onEvent: (TeacherEvent) -> Unit,
) {
    var surname by remember { mutableStateOf(state.surname) }
    var firstName by remember { mutableStateOf(state.firstName) }
    var patronymic by remember { mutableStateOf(state.patronymic) }
    var position by remember { mutableStateOf(state.position) }
    var degree by remember { mutableStateOf(state.degree) }
    var scientificTitle by remember { mutableStateOf(state.scientificTitle) }
    var address by remember { mutableStateOf(state.address) }
    var phone by remember { mutableStateOf(state.phone) }
    var married by remember { mutableStateOf(state.married) }
    var numberOfChildren by remember { mutableStateOf(state.numberOfChildren) }
    var rollNumber by remember { mutableStateOf(state.rollNumber) }
    var salary by remember { mutableStateOf(state.salary) }
    var dateOfEmployment by remember { mutableStateOf(state.dateOfEmployment) }
    var nameOfTheDepartment by remember { mutableStateOf(state.department.nameOfTheDepartment) }
    var numberOfTeachers by remember { mutableStateOf(state.department.numberOfTeachers) }
    var managerSurname by remember { mutableStateOf(state.department.manager.surname) }
    var managerFirstName by remember { mutableStateOf(state.department.manager.firstName) }
    var managerPatronymic by remember { mutableStateOf(state.department.manager.patronymic) }
    var managerAddress by remember { mutableStateOf(state.department.manager.address) }
    var managerPhone by remember { mutableStateOf(state.department.manager.phone) }
    var managerHomePhone by remember { mutableStateOf(state.department.manager.homePhone) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Paste Teacher Info",
                        color = MaterialTheme.colorScheme.background
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(elevation = 4.dp)
            )
        },
    ) { padding->
        if (state.isShowingInfo) {
            TeacherInfoDialog(state = state, onEvent = onEvent)
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
        ) {
            item {
                Text(
                    text = "Teacher Info:",
                    style = MaterialTheme.typography.titleLarge,
                )

                OutlinedTextField(
                    value = surname,
                    onValueChange = {
                        surname = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Surname")
                    },
                )

                OutlinedTextField(
                    value = firstName,
                    onValueChange = {
                        firstName = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "First name")
                    },
                )

                OutlinedTextField(
                    value = patronymic,
                    onValueChange = {
                        patronymic = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Patronymic name")
                    },
                )

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = "Select position:",
                    style = MaterialTheme.typography.titleLarge
                )

                Position.entries.forEach { newPosition ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(20.dp))
                            .clickable { position = newPosition },
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        RadioButton(
                            selected = position == newPosition,
                            onClick = { position = newPosition },
                        )

                        Text(
                            text = newPosition.text,
                            style = MaterialTheme.typography.bodyLarge,
                        )
                    }
                }

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = "Select degree:",
                    style = MaterialTheme.typography.titleLarge
                )

                Degree.entries.forEach { newDegree ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(20.dp))
                            .clickable { degree = newDegree },
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        RadioButton(
                            selected = degree == newDegree,
                            onClick = { degree = newDegree },
                        )

                        Text(
                            text = newDegree.text,
                            style = MaterialTheme.typography.bodyLarge,
                        )
                    }
                }

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = "Select scientific title:",
                    style = MaterialTheme.typography.titleLarge
                )

                ScientificTitle.entries.forEach { newTitle ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(20.dp))
                            .clickable { scientificTitle = newTitle },
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        RadioButton(
                            selected = scientificTitle == newTitle,
                            onClick = { scientificTitle = newTitle },
                        )

                        Text(
                            text = newTitle.text,
                            style = MaterialTheme.typography.bodyLarge,
                        )
                    }
                }

                Spacer(modifier = Modifier.padding(8.dp))

                OutlinedTextField(
                    value = address,
                    onValueChange = {
                        address = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Address")
                    },
                )

                OutlinedTextField(
                    value = phone,
                    onValueChange = {
                        phone = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Phone number")
                    },
                )

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = "Is teacher married?",
                    style = MaterialTheme.typography.titleLarge
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                        selected = married,
                        onClick = { married = true },
                    )

                    Text(
                        text = "Yes",
                        style = MaterialTheme.typography.bodyLarge,
                    )

                    Spacer(modifier = Modifier.padding(horizontal = 16.dp))

                    RadioButton(
                        selected = !married,
                        onClick = { married = false },
                    )

                    Text(
                        text = "No",
                        style = MaterialTheme.typography.bodyLarge,
                    )
                }

                Spacer(modifier = Modifier.padding(8.dp))

                OutlinedTextField(
                    value = numberOfChildren,
                    onValueChange = {
                        numberOfChildren = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Number of children")
                    },
                )

                OutlinedTextField(
                    value = rollNumber,
                    onValueChange = {
                        rollNumber = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Roll number")
                    },
                )

                OutlinedTextField(
                    value = salary,
                    onValueChange = {
                        salary = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Salary")
                    },
                )

                OutlinedTextField(
                    value = dateOfEmployment,
                    onValueChange = {
                        dateOfEmployment = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Date of employment")
                    },
                )

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = "Department Info:",
                    style = MaterialTheme.typography.titleLarge,
                )

                Spacer(modifier = Modifier.padding(8.dp))

                OutlinedTextField(
                    value = nameOfTheDepartment,
                    onValueChange = {
                        nameOfTheDepartment = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Name of the department")
                    },
                )

                OutlinedTextField(
                    value = numberOfTeachers,
                    onValueChange = {
                        numberOfTeachers = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Number of teachers")
                    },
                )

                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = "Manager Info:",
                    style = MaterialTheme.typography.titleLarge,
                )

                Spacer(modifier = Modifier.padding(8.dp))

                OutlinedTextField(
                    value = managerSurname,
                    onValueChange = {
                        managerSurname = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Manager surname")
                    },
                )

                OutlinedTextField(
                    value = managerFirstName,
                    onValueChange = {
                        managerFirstName = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Manager first name")
                    },
                )

                OutlinedTextField(
                    value = managerPatronymic,
                    onValueChange = {
                        managerPatronymic = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Manager patronymic")
                    },
                )

                OutlinedTextField(
                    value = managerAddress,
                    onValueChange = {
                        managerAddress = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Manager address")
                    },
                )

                OutlinedTextField(
                    value = managerPhone,
                    onValueChange = {
                        managerPhone = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Manager phone")
                    },
                )

                OutlinedTextField(
                    value = managerHomePhone,
                    onValueChange = {
                        managerHomePhone = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Manager home phone")
                    },
                )
                
                Button(
                    onClick = {
                        state.surname = surname
                        state.firstName = firstName
                        state.patronymic = patronymic
                        state.position = position
                        state.degree = degree
                        state.scientificTitle = scientificTitle
                        state.address = address
                        state.phone = phone
                        state.married = married
                        state.numberOfChildren = numberOfChildren
                        state.rollNumber = rollNumber
                        state.salary = salary
                        state.dateOfEmployment = dateOfEmployment
                        state.department.nameOfTheDepartment = nameOfTheDepartment
                        state.department.numberOfTeachers = numberOfTeachers
                        state.department.manager.surname = managerSurname
                        state.department.manager.firstName = managerFirstName
                        state.department.manager.patronymic = managerPatronymic
                        state.department.manager.address = managerAddress
                        state.department.manager.phone = managerPhone
                        state.department.manager.homePhone = managerHomePhone
                        onEvent(TeacherEvent.ShowTeacherInfo)
                    },
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Show info",
                        modifier = Modifier.padding(4.dp)
                    )
                }
            }
        }
    }
}

