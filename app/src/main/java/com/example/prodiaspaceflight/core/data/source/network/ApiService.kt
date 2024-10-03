package com.example.prodiaspaceflight.core.data.source.network

import com.example.prodiaspaceflight.core.data.source.response.ListFlightNewsResponse
import retrofit2.http.GET

interface ApiService {
    @GET("articles")
    suspend fun getArticles(): ListFlightNewsResponse

    @GET("blogs")
    suspend fun getBlogs(): ListFlightNewsResponse

    @GET("reports")
    suspend fun getReports(): ListFlightNewsResponse
}