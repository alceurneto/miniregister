package com.alceurneto.miniregister.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = Event::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("eventId")),
                       ForeignKey(entity = GoodsGroup::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("parentId")),
])
data class GoodsGroup(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val parentId: Int?,
    val eventId: Int,
    val name: String,
    val description: String?,
    val order: Int,
)
