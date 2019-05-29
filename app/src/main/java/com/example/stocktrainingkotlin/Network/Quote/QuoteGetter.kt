package com.example.stocktrainingkotlin.Network.Quote

import com.example.stocktrainingkotlin.GlobalVariables
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class QuoteGetter private constructor() {
    private var api: QuoteApi? = null

    init {
        initializeRetrofit()
    }


    private fun initializeRetrofit() {
        api = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://cloud.iexapis.com/")
            .build()
            .create(QuoteApi::class.java)
    }


    fun getStockQuote(symbol: String): Observable<Quote> {
        return api!!.getStockQuote(symbol, GlobalVariables.IEX_API_KEY)
    }


    companion object {
        @Volatile
        private var INSTANCE: QuoteGetter? = null

        fun getQuoteGetter(): QuoteGetter{
            return INSTANCE ?: synchronized(this){
                INSTANCE = QuoteGetter()
                return INSTANCE!!
            }
        }
    }
}
