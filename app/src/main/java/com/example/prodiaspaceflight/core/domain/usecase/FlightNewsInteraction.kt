package com.example.prodiaspaceflight.core.domain.usecase

import com.example.prodiaspaceflight.core.data.Resource
import com.example.prodiaspaceflight.core.domain.model.FlightNews
import com.example.prodiaspaceflight.core.domain.repository.IFlightNewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FlightNewsInteraction @Inject constructor(private val flightNewsRepository: IFlightNewsRepository) : FlightNewsUseCase {
    override fun getFlightNews(): Flow<Resource<List<FlightNews>>> {
        return flightNewsRepository.getFlightNews()
    }
}