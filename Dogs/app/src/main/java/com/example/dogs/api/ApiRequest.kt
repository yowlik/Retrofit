package com.example.dogs.api

import retrofit2.http.GET

const val BASE_URL="https://dog.ceo"

interface ApiRequest {
    @GET("/api/breeds/image/random")
    suspend fun getRandomDog():ApiData
}