package com.scrumplanning.di.module

import com.scrumplanning.di.scope.ActivityScope
import com.scrumplanning.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BuildersModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}