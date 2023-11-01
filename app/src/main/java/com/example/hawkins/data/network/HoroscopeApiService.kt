package com.example.hawkins.data.network

import com.example.hawkins.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    //Lo que aparece entre {} en el get tiene que llamarse igual en el @Path
    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign:String): PredictionResponse

}