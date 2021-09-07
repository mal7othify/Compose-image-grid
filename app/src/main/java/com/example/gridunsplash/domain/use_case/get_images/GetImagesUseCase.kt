package com.example.gridunsplash.domain.use_case.get_images

import com.example.gridunsplash.common.Resource
import com.example.gridunsplash.data.remote.dto.toImage
import com.example.gridunsplash.domain.model.Image
import com.example.gridunsplash.domain.repository.ImageRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetImagesUseCase @Inject constructor(
    private val repository: ImageRepository
) {
    operator fun invoke(): Flow<Resource<List<Image>>> = flow {
        try {
            emit(Resource.Loading<List<Image>>())
            val images = repository.getImages().map { it.toImage() }
            emit(Resource.Success<List<Image>>(images))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Image>>(e.localizedMessage ?: "Error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<List<Image>>("Failed to connect to server"))
        }
    }
}