package com.example.stocktrainingkotlin.Database.Portfolio

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PortfolioDao {
    @Query("SELECT * from owned_stock_table WHERE account_name = :accountName ORDER BY stock_name ASC")
    fun getAllStocksFromAccount(accountName: String): LiveData<List<OwnedStock>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertStock(stock: OwnedStock)

    @Update
    suspend fun updatePortfolio(stock: OwnedStock)

    @Query("DELETE FROM owned_stock_table")
    fun deletePortfolio()
}