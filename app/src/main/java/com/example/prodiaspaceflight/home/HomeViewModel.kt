package com.example.prodiaspaceflight.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prodiaspaceflight.core.data.Resource
import com.example.prodiaspaceflight.core.domain.model.FlightNews
import com.example.prodiaspaceflight.core.domain.usecase.FlightNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCase: FlightNewsUseCase
): ViewModel() {
    private val _articlesFlow = MutableSharedFlow<Resource<List<FlightNews>>>()
    val articlesFlow = _articlesFlow.asSharedFlow()

    fun getArticleList() {
        viewModelScope.launch {
            _articlesFlow.emitAll(useCase.getArticles())
        }
    }
}