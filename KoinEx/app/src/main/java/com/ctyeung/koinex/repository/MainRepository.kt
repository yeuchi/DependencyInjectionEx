package com.ctyeung.koinex.repository

import com.ctyeung.koinex.data.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}