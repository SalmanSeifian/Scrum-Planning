package com.scrumplanning.di.component

import com.scrumplanning.di.module.NetworkModule
import com.scrumplanning.ui.create.CreateRoomViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelComponent {

    fun inject(createRoomViewModel: CreateRoomViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelComponent

        fun networkModule(networkModule: NetworkModule): Builder
    }

}