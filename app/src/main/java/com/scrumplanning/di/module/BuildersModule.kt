package com.scrumplanning.di.module

import com.scrumplanning.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BuildersModule{

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}