package com.ctyeung.koinex.data

import com.ctyeung.koinex.model.User
import retrofit2.Response

interface ApiHelper {
suspend fun getUsers():Response<List<User>>
}