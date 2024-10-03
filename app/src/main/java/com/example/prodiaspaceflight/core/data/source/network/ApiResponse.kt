package com.example.prodiaspaceflight.core.data.source.network

import com.google.gson.annotations.SerializedName

sealed class ApiResponse<out R> {
    data class Success<out T>(val data: T): ApiResponse<T>()
    data class Error(val errorMessage: String): ApiResponse<Nothing>()
    data object Empty: ApiResponse<Nothing>()
}