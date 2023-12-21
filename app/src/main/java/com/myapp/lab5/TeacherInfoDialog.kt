package com.myapp.lab5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TeacherInfoDialog(
    state: TeacherState,
    onEvent: (TeacherEvent) -> Unit,
    modifier: Modifier = Modifier,
) {
    AlertDialog(
        modifier = modifier,
        onDismissRequest = { onEvent(TeacherEvent.CloseDialog) },
        text = {
            LazyColumn(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                item {
                    Text(
                        text = "Teacher Info:",
                        color = MaterialTheme.colorScheme.onBackground,
                        style = MaterialTheme.typography.titleLarge,
                    )

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Full name:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = "${state.surname} ${state.firstName} ${state.patronymic}",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Position in University:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = state.position.text,
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Degree:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = state.degree.text,
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Scientific title:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = state.scientificTitle.text,
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                        ) {
                            Text(
                                text = "Contact Info:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.Bold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Address: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.address,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                color = MaterialTheme.colorScheme.surface
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Phone: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.phone,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Family status:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = if(state.married) "Married" else "Not married",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Number of children:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = state.numberOfChildren,
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Roll number:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = state.rollNumber,
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Salary:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = state.salary,
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Date of employment:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Text(
                                text = state.dateOfEmployment,
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.primary,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal,
                                style = MaterialTheme.typography.bodyMedium,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                        ) {
                            Text(
                                text = "Department Info:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.Bold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Name of the department: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.department.nameOfTheDepartment,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                color = MaterialTheme.colorScheme.surface
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Number of teachers: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.department.numberOfTeachers,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.padding(4.dp))

                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            contentColor = MaterialTheme.colorScheme.onBackground,
                        ),
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                        ) {
                            Text(
                                text = "Manager Info:",
                                modifier = Modifier,
                                color = MaterialTheme.colorScheme.onBackground,
                                fontWeight = FontWeight.Bold,
                                style = MaterialTheme.typography.titleMedium,
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Manager surname: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.department.manager.surname,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                color = MaterialTheme.colorScheme.surface
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Manager first name: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.department.manager.firstName,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                color = MaterialTheme.colorScheme.surface
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Manager patronymic: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.department.manager.patronymic,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                color = MaterialTheme.colorScheme.surface
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Manager address: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.department.manager.address,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                color = MaterialTheme.colorScheme.surface
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Manager phone: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.department.manager.phone,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                color = MaterialTheme.colorScheme.surface
                            )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                            ) {
                                Text(
                                    text = "Manager home phone: ",
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.onBackground,
                                    fontStyle = FontStyle.Italic,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.titleMedium,
                                )

                                Text(
                                    text = state.department.manager.homePhone,
                                    modifier = Modifier,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Normal,
                                    style = MaterialTheme.typography.bodyMedium,
                                )
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.BottomEnd,
            ) {
                Button(
                    onClick = { onEvent(TeacherEvent.CloseDialog) },
                ) {
                    Text(
                        text = "Close",
                        style = MaterialTheme.typography.bodyLarge,
                    )
                }
            }
        },
    )
}