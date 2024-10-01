package com.alceurneto.miniregister.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity(foreignKeys = [ForeignKey(entity = Event::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("eventId")),
                       ForeignKey(entity = GoodsGroup::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("groupId")),
])
data class Goods(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val eventId: Int,
    val groupId: Int?,
    val name: String,
    val value: BigDecimal?,
    val description: String?,
    val isOutOfStack: Boolean,
    val order: Int,
)
