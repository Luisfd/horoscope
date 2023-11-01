package com.example.hawkins.data.core.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val tokenManager: TokenManager): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain
            .request()
            .newBuilder()
            .header("Autorization", tokenManager.getToken())
            .build()
        return chain.proceed(request)
    }
}


//Para el ejemplo se crearía el class
class TokenManager @Inject constructor(){
    //Esta función accedería a base de datos, recuperaría el token, y lo mandaría
    fun getToken():String = "yDaleD4leC0mpa"
}