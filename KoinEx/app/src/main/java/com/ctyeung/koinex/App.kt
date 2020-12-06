package com.ctyeung.koinex

import android.app.Application
import com.ctyeung.koinex.di.module.appModule
import com.ctyeung.koinex.di.module.repoModule
import com.ctyeung.koinex.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}