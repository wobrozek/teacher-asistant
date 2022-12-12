package com.example.teacher_asistent

import androidx.room.*

@Dao
interface StudentDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addStudent(student: Student)

    @Query("Select * from student")
    fun gelAllUsers(): List<Student>

    @Update
     fun updateNote(note: Note)

    @Delete
     fun deleteNote(note: Note)
}