package com.ctyeung.hiltex.di

import com.ctyeung.hiltex.MainViewModel
import com.ctyeung.hiltex.data.EmployeeRepository
import com.ctyeung.hiltex.network.EMPLOYEE_BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ActivityComponent::class)
object EmployeeModule {
//    @Provides
//    fun provideEmployeeApi():EmployeeAPI {
//
//        val builder=Retrofit.Builder()
//            .baseUrl(EMPLOYEE_BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        return builder.create(EmployeeAPI::class.java)
//    }

    @Provides
    fun provideEmployeeRepository():EmployeeRepository = EmployeeRepository()

    @Provides
    fun provideMainViewModel(employeeRepository: EmployeeRepository):MainViewModel = MainViewModel(employeeRepository)
}