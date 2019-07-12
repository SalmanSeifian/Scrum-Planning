package com.scrumplanning.data.remote.model

import com.squareup.moshi.Json

data class CreateRoomRequest(
    @Json(name = "title")
    val title: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "creator_name")
    val creatorName: String
)