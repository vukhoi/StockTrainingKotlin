package com.example.stocktrainingkotlin.Network.News

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface YahooFinanceApi {
    @GET("rss/2.0/headline")
    fun getNews(
        @Query("regio") region: String,
        @Query("lang") lang: String,
        @Query("s") symbol: String
    ): Observable<NewsData>
}
