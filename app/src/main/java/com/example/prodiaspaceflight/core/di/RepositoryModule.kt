package com.example.prodiaspaceflight.core.di

import com.example.prodiaspaceflight.core.data.FlightNewsRepository
import com.example.prodiaspaceflight.core.domain.repository.IFlightNewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(flightNewsRepository: FlightNewsRepository): IFlightNewsRepository
}