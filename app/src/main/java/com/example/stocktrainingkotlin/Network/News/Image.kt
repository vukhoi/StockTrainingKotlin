package com.example.stocktrainingkotlin.Network.News

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "image")
data class Image(
    @Element(name = "height")
    val height: String,
    @Element(name = "link")
    val link: String,
    @Element(name = "title")
    val title: String,
    @Element(name = "url")
    val url: String,
    @Element(name = "width")
    val width: String)
