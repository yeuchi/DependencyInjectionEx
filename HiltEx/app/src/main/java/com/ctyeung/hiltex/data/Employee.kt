package com.ctyeung.hiltex.data

/*
 * Example:
 * http://dummy.restapiexample.com/api/v1/employee/1
 */
data class Employee(val id:Int,
               val name:String,
               val salary:Int,
               val age:Int,
               val imageUrl:String)
