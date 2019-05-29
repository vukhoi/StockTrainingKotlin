package com.example.stocktrainingkotlin.Network.HistoricalPrice


import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class HistoricalPriceGetter private constructor() {
    private var api: HistoricalPriceApi? = null

    init {
        initializeRetrofit()
    }

    private fun initializeRetrofit() {
        api = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.iextrading.com/")
            .build()
            .create(HistoricalPriceApi::class.java)
    }


    fun getHistoricalPrice(symbol: String, dateRange: String): Observable<List<Day>> {
        return api!!.getHistoricalPrice(symbol, dateRange)
    }

    companion object {
        @Volatile
        private var INSTANCE: HistoricalPriceGetter? = null

        fun getQuoteGetter(): HistoricalPriceGetter{
            return INSTANCE ?: synchronized(this){
                INSTANCE = HistoricalPriceGetter()
                return INSTANCE!!
            }
        }
    }
}
