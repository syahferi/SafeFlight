package com.example.prodiaspaceflight.core.domain.model

data class FlightNews(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val summary: String,
    val publishedAt: String,
)
