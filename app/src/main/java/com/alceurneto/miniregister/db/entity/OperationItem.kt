package com.alceurneto.miniregister.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity(foreignKeys = [ForeignKey(entity = Operation::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("operationId")),
                       ForeignKey(entity = Goods::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("goodsId")),
])
data class OperationItem(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val operationId: Int,
    val goodsId: Int?,
    val quantity: Int,
    val value: BigDecimal,
)
