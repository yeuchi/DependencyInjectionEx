package com.ctyeung.koinex.di.module

import com.ctyeung.koinex.repository.MainRepository
import org.koin.dsl.module


val repoModule = module {
    single {
        MainRepository(get())
    }
}