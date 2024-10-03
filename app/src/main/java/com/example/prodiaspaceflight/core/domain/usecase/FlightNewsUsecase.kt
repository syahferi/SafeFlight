package com.example.prodiaspaceflight.core.domain.usecase

import com.example.prodiaspaceflight.core.data.Resource
import com.example.prodiaspaceflight.core.domain.model.FlightNews
import kotlinx.coroutines.flow.Flow

interface FlightNewsUseCase {
    fun getArticles(): Flow<Resource<List<FlightNews>>>
    fun getBlogs(): Flow<Resource<List<FlightNews>>>
    fun getReports(): Flow<Resource<List<FlightNews>>>
}