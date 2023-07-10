package com.mmj.easylocalization.core.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.paperdb.Paper

@HiltAndroidApp
class EasyLocalization: Application() {

    override fun onCreate() {
        super.onCreate()
        Paper.init(this)
    }
}