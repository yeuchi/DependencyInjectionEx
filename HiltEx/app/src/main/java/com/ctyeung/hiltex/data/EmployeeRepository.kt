package com.ctyeung.hiltex.data

import javax.inject.Inject

class EmployeeRepository @Inject constructor() {

    suspend fun searchEmployee(index:Int):Employee? {
        //val employeeResponses = employeeApi.searchEmployeeResponse(index)
//        return if(employeeResponses.isNotEmpty()) {
//            val employeeResponse =  employeeResponses[0]
//            return employeeResponse.data
//        }
//        else null

        return Employee(1, "James Bond", 700, 35, "some url")
    }
}