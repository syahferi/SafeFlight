package com.example.prodiaspaceflight.core.domain.repository

import com.example.prodiaspaceflight.core.data.Resource
import com.example.prodiaspaceflight.core.domain.model.FlightNews
import kotlinx.coroutines.flow.Flow

interface IFlightNewsRepository {
    fun getFlightNews(): Flow<Resource<List<FlightNews>>>
}