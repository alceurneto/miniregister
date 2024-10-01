package com.alceurneto.miniregister.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Entity(foreignKeys = [ForeignKey(entity = EventDay::class,
                                  parentColumns = arrayOf("id"),
                                  childColumns = arrayOf("eventDayId")),
])
data class Operation(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val eventDayId: Int,
    val timestampMillis: Long,
    @TypeConverters(OperationTypeConverter::class)
    val type: OperationType,
    @TypeConverters(OperationStateConverter::class)
    val state: OperationState,
    val notes: String?,
)

class OperationTypeConverter {
    @TypeConverter
    fun fromOperationType(type: OperationType): String {
        return type.name
    }

    @TypeConverter
    fun toOperationType(value: String): OperationType {
        return enumValueOf(value)
    }
}

enum class OperationType {
    SELL,
    TRANSFER,
}

class OperationStateConverter {
    @TypeConverter
    fun fromOperationState(state: OperationState): String {
        return state.name
    }

    @TypeConverter
    fun toOperationState(value: String): OperationState {
        return enumValueOf(value)
    }
}

enum class OperationState {
    DELETED,
    INACTIVE,
    IN_CREATION,
    ACTIVE,
}
