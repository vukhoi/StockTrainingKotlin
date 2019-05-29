package com.example.stocktrainingkotlin.Network.News

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "channel")
data class Channel(
    @Element(name = "copyright")
    val copyright: String,
    @Element(name = "description")
    val description: String,
    @Element(name = "image")
    val image: Image,
    @ElementList(name = "item", inline = true)
    val itemList: List<Item>,
    @Element(name = "language")
    val language: String,
    @Element(name = "lastBuildDate")
    val lastBuildDate: String,
    @Element(name = "link")
    val link: String,
    @Element(name = "title")
    val title: String)
