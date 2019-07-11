package com.scrumplanning.data.remote.model

data class CreateRoomResponse(
    val created: String,
    val creator: String,
    val creator_name: String,
    val description: String,
    val title: String,
    val uid: String,
    val updated: String
)