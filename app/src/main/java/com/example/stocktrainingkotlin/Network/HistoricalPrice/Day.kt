package com.example.stocktrainingkotlin.Network.HistoricalPrice

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Day(
    @SerializedName("date")
    @Expose
    val date: String,
    @SerializedName("open")
    @Expose
    val open: Double,
    @SerializedName("high")
    @Expose
    val high: Double,
    @SerializedName("low")
    @Expose
    val low: Double,
    @SerializedName("close")
    @Expose
    val close: Double,
    @SerializedName("volume")
    @Expose
    val volume: Int,
    @SerializedName("unadjustedVolume")
    @Expose
    val unadjustedVolume: Int,
    @SerializedName("change")
    @Expose
    val change: Double,
    @SerializedName("changePercent")
    @Expose
    val changePercent: Double,
    @SerializedName("vwap")
    @Expose
    val vwap: Double,
    @SerializedName("label")
    @Expose
    val label: String,
    @SerializedName("changeOverTime")
    @Expose
    val changeOverTime: Double)