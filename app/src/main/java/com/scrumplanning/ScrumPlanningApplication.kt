package com.scrumplanning

import android.app.Activity
import android.app.Application
import com.scrumplanning.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class ScrumPlanningApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .build()
            .inject(this)
    }


    override fun activityInjector(): AndroidInjector<Activity> =  activityInjector

}