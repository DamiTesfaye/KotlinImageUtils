package com.mobiledev.imageutils

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

/**
 * Created by Manu on 11/8/2017.
 */
class MyApp : Application() {


    companion object {
        lateinit var instance: Application
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        Fresco.initialize(this)
    }
}