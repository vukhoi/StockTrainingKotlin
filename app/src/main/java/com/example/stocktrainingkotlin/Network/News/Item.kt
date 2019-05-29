package com.example.stocktrainingkotlin.Network.News

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "item")
data class Item(
    @Element(name = "description")
    val description: String,
    @Element(name = "guid")
    val guid: String,
    @Element(name = "link")
    val link: String,
    @Element(name = "pubDate")
    val pubDate: String,
    @Element(name = "title")
    val title: String)
