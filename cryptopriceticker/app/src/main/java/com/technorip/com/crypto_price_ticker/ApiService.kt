package com.technorip.com.crypto_price_ticker

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface  KoinexApiService {

    @GET("/ticker")
    fun CheckLogin()
            : Observable<KoinexResponse>


    companion object {
        fun create(): KoinexApiService {

            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://koinex.in/api")
                .build()
            return retrofit.create(KoinexApiService::class.java)
        }
    }
}