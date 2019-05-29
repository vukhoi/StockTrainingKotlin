package com.example.stocktrainingkotlin.Network.News

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "rss")
data class NewsData(
    @Attribute(name = "version")
    val version: String,
    @Element(name = "channel")
    val channel: Channel)
