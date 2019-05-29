package com.example.stocktrainingkotlin.Network.Quote

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface QuoteApi {
    @GET("v1/stock/{symbol}/quote")
    fun getStockQuote(
        @Path("symbol") symbol: String,
        @Query("token") token: String
    ): Observable<Quote>
}
