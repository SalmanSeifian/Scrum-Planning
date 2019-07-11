package com.scrumplanning.di.component

import com.scrumplanning.ScrumPlanningApplication
import com.scrumplanning.di.module.AppModule
import com.scrumplanning.di.module.BuildersModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class, BuildersModule::class, AppModule::class]
)
interface AppComponent {

    fun inject(app: ScrumPlanningApplication)

}