package com.example.hawkins.domain


import com.example.hawkins.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}