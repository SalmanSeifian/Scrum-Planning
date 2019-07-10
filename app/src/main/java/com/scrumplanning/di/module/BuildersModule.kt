package com.scrumplanning.di.module

import com.scrumplanning.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BuildersModule{

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}