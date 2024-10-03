package com.example.prodiaspaceflight.core.data

import android.util.Log
import com.example.prodiaspaceflight.core.data.source.network.ApiService
import com.example.prodiaspaceflight.core.domain.model.FlightNews
import com.example.prodiaspaceflight.core.domain.repository.IFlightNewsRepository
import com.example.prodiaspaceflight.utils.orNull
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FlightNewsRepository @Inject constructor(private val apiService: ApiService) :
    IFlightNewsRepository {
    override fun getArticles(): Flow<Resource<List<FlightNews>>> {
        return flow {
            try {
                emit(Resource.Loading())
                val response = apiService.getArticles()
                val dataArray = response.results
                emit(Resource.Success(dataArray.map {
                    FlightNews(
                        id = it.id.orNull(),
                        title = it.title.orEmpty(),
                        imageUrl = it.imageUrl.orEmpty(),
                        summary = it.summary.orEmpty(),
                        publishedAt = it.publishedAt.orEmpty(),
                    )
                }))
            } catch (e: Exception) {
                emit(Resource.Error(e.message.toString()))
                Log.e("data_error", e.toString())
            }
        }
    }

    override fun getBlogs(): Flow<Resource<List<FlightNews>>> {
        return flow {
            try {
                emit(Resource.Loading())
                val response = apiService.getBlogs()
                val dataArray = response.results
                emit(Resource.Success(dataArray.map {
                    FlightNews(
                        id = it.id.orNull(),
                        title = it.title.orEmpty(),
                        imageUrl = it.imageUrl.orEmpty(),
                        summary = it.summary.orEmpty(),
                        publishedAt = it.publishedAt.orEmpty(),
                    )
                }))
            } catch (e: Exception) {
                emit(Resource.Error(e.message.toString()))
                Log.e("data_error", e.toString())
            }
        }    }

    override fun getReports(): Flow<Resource<List<FlightNews>>> {
        return flow {
            try {
                emit(Resource.Loading())
                val response = apiService.getReports()
                val dataArray = response.results
                emit(Resource.Success(dataArray.map {
                    FlightNews(
                        id = it.id.orNull(),
                        title = it.title.orEmpty(),
                        imageUrl = it.imageUrl.orEmpty(),
                        summary = it.summary.orEmpty(),
                        publishedAt = it.publishedAt.orEmpty(),
                    )
                }))
            } catch (e: Exception) {
                emit(Resource.Error(e.message.toString()))
                Log.e("data_error", e.toString())
            }
        }
    }
}