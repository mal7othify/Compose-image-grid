package com.example.gridunsplash.presentation.image_list

import com.example.gridunsplash.domain.model.Image

data class ImageListState(
    val isLoading: Boolean = false,
    val images: List<Image> = emptyList(),
    val error: String = ""
)