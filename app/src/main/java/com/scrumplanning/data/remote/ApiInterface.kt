package com.scrumplanning.data.remote

import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("rooms/")
    fun createRoom(@Body createRoomRequest: CreateRoomRequest): Observable<CreateRoomResponse>


}