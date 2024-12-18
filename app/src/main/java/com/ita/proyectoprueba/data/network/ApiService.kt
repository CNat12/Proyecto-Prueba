package com.ita.proyectoprueba.data.network

import com.ita.proyectoprueba.data.model.ServiceModel
import retrofit2.http.GET
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @GET("service")
    suspend fun getServices(): Response<List<ServiceModel>>

    @GET("service/{id}")
    suspend fun getService(@Path("id") id:Int): Response<ServiceModel>

    @POST("service")
    suspend fun createService(@Body service: ServiceModel): Response<ServiceModel>

    @PUT("service/{id}")
    suspend fun updateService(@Path ("id") id: Int, @Body service: ServiceModel): Response<ServiceModel>

    @DELETE("service/{id}")
    suspend fun deteleService(@Path("id") id: Int): Response<ServiceModel>

}