package com.example.stocktrainingkotlin.Database.Account

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AccountDao {
    @Query("SELECT * from account_table ORDER BY account_name ASC")
    fun getAllAccounts(): LiveData<List<Account>>

    @Insert
    suspend fun insertAccount(account: Account)

    @Update
    suspend fun updateAccount(account: Account)

    @Query("DELETE FROM account_table")
    fun deleteAllAccounts()
}