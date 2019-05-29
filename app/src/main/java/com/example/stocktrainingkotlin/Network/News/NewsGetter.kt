package com.example.stocktrainingkotlin.Network.News

import com.example.stocktrainingkotlin.GlobalVariables
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory.*

class NewsGetter private constructor() {
    private var retrofit: Retrofit? = null
    private var api: YahooFinanceApi? = null

    init {
        initializeRetrofit()
    }

    private fun initializeRetrofit() {
        retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(create())
            .baseUrl("https://feeds.finance.yahoo.com/")
            .build()
        api = retrofit!!.create(YahooFinanceApi::class.java)
    }


    fun getHistoricalPrice(symbol: String): Observable<NewsData> {
        return api!!.getNews(GlobalVariables.REGION, GlobalVariables.LANG, symbol)
    }

    companion object {
        @Volatile
        private var INSTANCE: NewsGetter? = null

        fun getQuoteGetter(): NewsGetter{
            return INSTANCE ?: synchronized(this){
                INSTANCE = NewsGetter()
                return INSTANCE!!
            }
        }
    }
}
