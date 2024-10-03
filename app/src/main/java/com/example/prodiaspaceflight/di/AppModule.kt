package com.example.prodiaspaceflight.di

import com.example.prodiaspaceflight.core.domain.usecase.FlightNewsInteraction
import com.example.prodiaspaceflight.core.domain.usecase.FlightNewsUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class AppModule {

    @Binds
    @ViewModelScoped
    abstract fun provideFlightNewsUseCase(flightNewsInteraction: FlightNewsInteraction): FlightNewsUseCase
}