package com.example.prodiaspaceflight.home

import androidx.lifecycle.ViewModel
import com.example.prodiaspaceflight.core.domain.usecase.FlightNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(flightNewsUseCase: FlightNewsUseCase): ViewModel() {
    val articles = flightNewsUseCase.getArticles()
    val blogs = flightNewsUseCase.getBlogs()
    val reports = flightNewsUseCase.getReports()
}