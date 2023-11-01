package com.example.hawkins.data.network.response

import com.example.hawkins.domain.model.PredictionModel
import com.google.gson.annotations.SerializedName


class PredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
) {
    fun toDomain(): PredictionModel {
        return PredictionModel(
            horoscope = horoscope,
            sign = sign
        )
    }
}