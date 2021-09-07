package com.example.gridunsplash.domain.repository

import com.example.gridunsplash.data.remote.dto.ImageDto

interface ImageRepository {
    suspend fun getImages(): List<ImageDto>
}