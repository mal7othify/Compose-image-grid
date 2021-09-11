package com.example.gridunsplash.di

import com.example.gridunsplash.common.Constants
import com.example.gridunsplash.data.remote.PicsumApi
import com.example.gridunsplash.data.repository.ImageRepositoryImpl
import com.example.gridunsplash.domain.repository.ImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePicsumApi(): PicsumApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PicsumApi::class.java)
    }

    @Provides
    @Singleton
    fun provideImageRepository(api: PicsumApi): ImageRepository {
        return ImageRepositoryImpl(api)
    }
}