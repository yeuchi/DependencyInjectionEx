package com.ctyeung.koinex.data

import com.ctyeung.koinex.model.User
import retrofit2.Response
import retrofit2.http.GET

const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}