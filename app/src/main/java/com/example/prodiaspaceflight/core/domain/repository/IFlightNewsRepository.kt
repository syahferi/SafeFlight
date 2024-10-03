package com.example.prodiaspaceflight.core.domain.repository

import com.example.prodiaspaceflight.core.data.Resource
import com.example.prodiaspaceflight.core.domain.model.FlightNews
import kotlinx.coroutines.flow.Flow

interface IFlightNewsRepository {
    fun getArticles(): Flow<Resource<List<FlightNews>>>
    fun getBlogs(): Flow<Resource<List<FlightNews>>>
    fun getReports(): Flow<Resource<List<FlightNews>>>
}