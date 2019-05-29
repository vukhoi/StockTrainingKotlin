package com.example.stocktrainingkotlin.Database.Account

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.stocktrainingkotlin.Database.DatabaseConstants

@Entity(tableName = DatabaseConstants.accountTable)
data class Account(
    @PrimaryKey
    @NonNull @ColumnInfo(name = DatabaseConstants.accountName) val name: String,

    @NonNull @ColumnInfo(name = DatabaseConstants.cashAmt) var cashAmt: Double,
    @NonNull @ColumnInfo(name = DatabaseConstants.equityAmt) var equityAmt: Double,
    @NonNull @ColumnInfo(name = DatabaseConstants.transactionFee) var transactionFee: Double,
    @NonNull @ColumnInfo(name = DatabaseConstants.dayTradeRestriction) var dayTradeRestriction: Boolean
)