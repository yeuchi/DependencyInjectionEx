package com.ctyeung.hiltex.network

import com.ctyeung.hiltex.data.Employee
import com.ctyeung.hiltex.data.EmployeeResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val EMPLOYEE_BASE_URL = "https://dummy.restapiexample.com/"

//interface EmployeeAPI {
//
//    @GET("api/v1/employee/{index}")
//    suspend fun searchEmployeeResponse(@Path("index")index:Int):List<EmployeeResponse>
//}