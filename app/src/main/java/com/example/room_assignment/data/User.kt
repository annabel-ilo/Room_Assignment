package com.example.room_assignment.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "user-table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
)
