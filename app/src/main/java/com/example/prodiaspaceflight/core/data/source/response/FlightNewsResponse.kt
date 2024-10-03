package com.example.prodiaspaceflight.core.data.source.response

import com.google.gson.annotations.SerializedName

data class FlightNewsResponse(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("image_url")
    val imageUrl: String?,
    @SerializedName("summary")
    val summary: String?,
    @SerializedName("published_at")
    val publishedAt: String?,
)
