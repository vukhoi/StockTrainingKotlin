package com.example.stocktrainingkotlin.Database.Portfolio

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.stocktrainingkotlin.Database.DatabaseConstants

@Entity(tableName = DatabaseConstants.ownedStockTable)
data class OwnedStock(
    @PrimaryKey
    @NonNull @ColumnInfo(name = DatabaseConstants.stockName) val stockName: String,
    @NonNull @ColumnInfo(name = DatabaseConstants.accountName) val ownerName: String,

    @NonNull @ColumnInfo(name = DatabaseConstants.avgCost) var avgCost: Double,
    @NonNull @ColumnInfo(name = DatabaseConstants.equityAmt) var equity: Double,
    @NonNull @ColumnInfo(name = DatabaseConstants.amt) var amt: Int,
    @NonNull @ColumnInfo(name = DatabaseConstants.currentReturn) var currentReturn: Double,
    @NonNull @ColumnInfo(name = DatabaseConstants.totalReturn) var totalReturn: Double
)