package com.example.stocktrainingkotlin.Network.HistoricalPrice


import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface HistoricalPriceApi {
    @GET("1.0/stock/{symbol}/chart/{dateRange}")
    fun getHistoricalPrice(
        @Path("symbol") symbol: String,
        @Path("dateRange") dateRange: String
    ): Observable<List<Day>>
}
