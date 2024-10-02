package com.alceurneto.miniregister.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity(foreignKeys = [ForeignKey(entity = PaymentType::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("typeId")),
                       ForeignKey(entity = Tab::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("tabId")),
                       ForeignKey(entity = Operation::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("operationId")),
])
data class Payment(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val typeId: Int,
    val tabId: Int?,
    val operationId: Int?,
    val value: BigDecimal,
)
