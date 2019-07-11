package com.scrumplanning.data.remote

import com.scrumplanning.data.remote.model.CreateRoomRequest
import com.scrumplanning.data.remote.model.CreateRoomResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("rooms/")
    fun createRoom(@Body createRoomRequest: CreateRoomRequest): Observable<CreateRoomResponse>


}