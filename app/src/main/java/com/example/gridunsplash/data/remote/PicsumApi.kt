package com.example.gridunsplash.data.remote

import com.example.gridunsplash.data.remote.dto.ImageDto
import retrofit2.http.GET

interface PicsumApi {

    @GET("/v2/list")
    suspend fun getImages(): List<ImageDto>
}