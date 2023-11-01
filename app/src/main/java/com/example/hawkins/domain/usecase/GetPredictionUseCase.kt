package com.example.hawkins.domain.usecase

import com.example.hawkins.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)


}