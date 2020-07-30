package com.example.kotlin_study

import android.app.Application
import android.support.multidex.MultiDex
import dagger.internal.DaggerCollections

class App : Application() {
    companion object {
        lateinit var instance:App
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
        //初始化MultiDex
        MultiDex.install(this)
    }
}