package com.example.stocktrainingkotlin.Database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.stocktrainingkotlin.Database.Account.Account
import com.example.stocktrainingkotlin.Database.Account.AccountDao
import com.example.stocktrainingkotlin.Database.Portfolio.OwnedStock
import com.example.stocktrainingkotlin.Database.Portfolio.PortfolioDao

@androidx.room.Database(entities = [Account::class, OwnedStock::class], version = DatabaseConstants.version)
abstract class Database : RoomDatabase() {
    abstract fun accountDao(): AccountDao
    abstract fun portfolioDao(): PortfolioDao


    companion object {
        @Volatile
        private var INSTANCE: Database? = null

        fun getDatabase(context: Context): Database {
            return INSTANCE ?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    Database::class.java,
                    DatabaseConstants.Database
                ).build()
                return INSTANCE!!
            }
        }
    }
}