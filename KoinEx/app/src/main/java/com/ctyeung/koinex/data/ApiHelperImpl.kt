package com.ctyeung.koinex.data

import com.ctyeung.koinex.model.User
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService):ApiHelper {
    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()
}