package com.ctyeung.hiltex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/*
 * Example REST ful API
 * http://dummy.restapiexample.com/
 *
 * Hilt code example this follows..
 * Just trying to duplicate and understand what is going on.
 * https://medium.com/@genc.tasbasi/finally-a-loveable-dependency-injection-for-android-hilt-koin-6cdfc08a6401
 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel:MainViewModel
    val index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    override fun onStart() {
        super.onStart()

        viewModel.getEmployeeBy(index)
    }

    private fun setListeners() {

        viewModel.employee.observe(this, Observer {
            // data updated
        })

        btn_get.setOnClickListener{
            viewModel.getEmployeeBy(index)
        }
    }
}