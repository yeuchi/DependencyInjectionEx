package com.ctyeung.hiltex

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ctyeung.hiltex.data.Employee
import com.ctyeung.hiltex.data.EmployeeRepository
import com.ctyeung.hiltex.event.SingleLiveEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainViewModel @Inject constructor(private val employeeRepository: EmployeeRepository) : ViewModel() {

    private var _employee = SingleLiveEvent<Employee>()
    val employee: LiveData<Employee> = _employee

    fun getEmployeeBy(index:Int) {
        viewModelScope.launch (Dispatchers.IO){
            val e = employeeRepository.searchEmployee(index)

            e?.let {
                withContext(Dispatchers.Main) {
                    _employee.setValue(it)
                }
            }
        }
    }
}