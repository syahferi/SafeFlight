package com.example.prodiaspaceflight.utils

fun Int?.orNull(): Int {
    return this ?: 0
}