package com.scrumplanning

import android.app.Activity
import android.app.Application
import com.scrumplanning.di.component.DaggerAppComponent
import com.scrumplanning.di.module.AppModule
import com.scrumplanning.di.module.NetworkModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject

class ScrumPlanningApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .networkModule(NetworkModule(BuildConfig.URL))
            .build()
            .inject(this)
    }


    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

}