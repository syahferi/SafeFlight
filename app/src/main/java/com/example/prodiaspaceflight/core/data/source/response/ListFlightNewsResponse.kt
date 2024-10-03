package com.example.prodiaspaceflight.core.data.source.response

import com.google.gson.annotations.SerializedName

data class ListFlightNewsResponse(
    @SerializedName("results")
    val results: List<FlightNewsResponse>
)