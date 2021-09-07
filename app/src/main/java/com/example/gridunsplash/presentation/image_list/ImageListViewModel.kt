package com.example.gridunsplash.presentation.image_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gridunsplash.common.Resource
import com.example.gridunsplash.domain.use_case.get_images.GetImagesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ImageListViewModel @Inject constructor(
    private val getImagesUseCase: GetImagesUseCase
) : ViewModel() {
    private val _state = mutableStateOf(ImageListState())
    val state: State<ImageListState> = _state

    init {
        getImages()
    }

    private fun getImages() {
        getImagesUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = ImageListState(images = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = ImageListState(error = result.message ?: "An error occurred")
                }
                is Resource.Loading -> {
                    _state.value = ImageListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}