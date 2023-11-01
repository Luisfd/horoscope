package com.example.hawkins.data

import android.util.Log
import com.example.hawkins.data.network.HoroscopeApiService
import com.example.hawkins.data.network.response.PredictionResponse
import com.example.hawkins.domain.Repository
import com.example.hawkins.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
       runCatching {  apiService.getHoroscope(sign)}
           .onSuccess { return it.toDomain()}
           .onFailure { Log.i("aris","Ha ocurrido un error ${it.message}") }
       return null
    }
}