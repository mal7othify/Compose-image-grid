package com.example.gridunsplash.data.remote.dto

import com.example.gridunsplash.domain.model.Image
import com.google.gson.annotations.SerializedName

data class ImageDto(
    val author: String,
    @SerializedName("download_url")
    val downloadUrl: String,
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)

fun ImageDto.toImage(): Image {
    return Image(
        author = author,
        id = id,
        downloadUrl = downloadUrl
    )
}