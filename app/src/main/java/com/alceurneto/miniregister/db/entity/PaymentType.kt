package com.alceurneto.miniregister.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = Event::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("eventId")),
])
data class PaymentType(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val eventId: Int,
    val name: String,
    val allowChange: Boolean,
    val order: Int,
)
