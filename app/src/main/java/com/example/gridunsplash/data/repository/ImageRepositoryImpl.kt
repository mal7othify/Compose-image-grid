package com.example.gridunsplash.data.repository

import com.example.gridunsplash.data.remote.PicsumApi
import com.example.gridunsplash.data.remote.dto.ImageDto
import com.example.gridunsplash.domain.repository.ImageRepository
import javax.inject.Inject

class ImageRepositoryImpl @Inject constructor(
    private val api: PicsumApi
) : ImageRepository {
    override suspend fun getImages(): List<ImageDto> {
        return api.getImages()
    }
}