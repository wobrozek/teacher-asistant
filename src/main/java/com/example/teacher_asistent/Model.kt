package com.example.teacher_asistent

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import javax.xml.transform.OutputKeys

@Entity(tableName= "student")
data class Student(@PrimaryKey(autoGenerate = true)var id:Long,
var name:String, var surname:String) {
}

@Entity(tableName = "subject")
data class Subject(@PrimaryKey(autoGenerate = true)var id:Long,
var name: String)

@Entity(tableName = "mark")
data class Mark(@PrimaryKey(autoGenerate = true)var id:Long,
var score: Int, foreignKeys = [ForeignKey(
        entity = Student::class,
        childColumns = ["student_id"],
        parentColumns = ["id"]
    )])

)

@Entity data class StudentSubject(
    @PrimaryKey(autoGenerate = true) val id:Long,
    val studentId: Long,
    val subjectId: Long
)