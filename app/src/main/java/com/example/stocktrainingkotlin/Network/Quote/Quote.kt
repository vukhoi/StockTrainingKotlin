package com.example.stocktrainingkotlin.Network.Quote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Quote (
    @SerializedName("symbol")
    @Expose
    val symbol: String,
    @SerializedName("companyName")
    @Expose
    val companyName: String,
    @SerializedName("calculationPrice")
    @Expose
    val calculationPrice: String,
    @SerializedName("open")
    @Expose
    val open: String,
    @SerializedName("openTime")
    @Expose
    val openTime: String,
    @SerializedName("close")
    @Expose
    val close: String,
    @SerializedName("closeTime")
    @Expose
    val closeTime: String,
    @SerializedName("high")
    @Expose
    val high: String,
    @SerializedName("low")
    @Expose
    val low: String,
    @SerializedName("latestPrice")
    @Expose
    val latestPrice: String,
    @SerializedName("latestSource")
    @Expose
    val latestSource: String,
    @SerializedName("latestTime")
    @Expose
    val latestTime: String,
    @SerializedName("latestUpdate")
    @Expose
    val latestUpdate: String,
    @SerializedName("latestVolume")
    @Expose
    val latestVolume: String,
    @SerializedName("iexRealtimePrice")
    @Expose
    val iexRealtimePrice: String,
    @SerializedName("iexRealtimeSize")
    @Expose
    val iexRealtimeSize: String,
    @SerializedName("iexLastUpdated")
    @Expose
    val iexLastUpdated: String,
    @SerializedName("delayedPrice")
    @Expose
    val delayedPrice: String,
    @SerializedName("delayedPriceTime")
    @Expose
    val delayedPriceTime: String,
    @SerializedName("extendedPrice")
    @Expose
    val extendedPrice: String,
    @SerializedName("extendedChange")
    @Expose
    val extendedChange: String,
    @SerializedName("extendedChangePercent")
    @Expose
    val extendedChangePercent: String,
    @SerializedName("extendedPriceTime")
    @Expose
    val extendedPriceTime: String,
    @SerializedName("previousClose")
    @Expose
    val previousClose: String,
    @SerializedName("change")
    @Expose
    val change: String,
    @SerializedName("changePercent")
    @Expose
    val changePercent: String,
    @SerializedName("iexMarketPercent")
    @Expose
    val iexMarketPercent: String,
    @SerializedName("iexVolume")
    @Expose
    val iexVolume: String,
    @SerializedName("avgTotalVolume")
    @Expose
    val avgTotalVolume: String,
    @SerializedName("iexBidPrice")
    @Expose
    val iexBidPrice: String,
    @SerializedName("iexBidSize")
    @Expose
    val iexBidSize: String,
    @SerializedName("iexAskPrice")
    @Expose
    val iexAskPrice: String,
    @SerializedName("iexAskSize")
    @Expose
    val iexAskSize: String,
    @SerializedName("marketCap")
    @Expose
    val marketCap: String,
    @SerializedName("peRatio")
    @Expose
    val peRatio: String,
    @SerializedName("week52High")
    @Expose
    val week52High: String,
    @SerializedName("week52Low")
    @Expose
    val week52Low: String,
    @SerializedName("ytdChange")
    @Expose
    val ytdChange: String)