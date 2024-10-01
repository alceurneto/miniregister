package com.alceurneto.miniregister.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Event(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val description: String?,
    val isClosed: Boolean,
    val picturePath: String?,
)
