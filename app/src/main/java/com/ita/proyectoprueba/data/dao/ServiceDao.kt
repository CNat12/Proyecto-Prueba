package com.ita.proyectoprueba.data.dao

import androidx.compose.runtime.CompositionServices
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.IMultiInstanceInvalidationService
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ita.proyectoprueba.data.model.ServiceEntity

    @Dao
    interface ServiceDao{
        @Query("SELECT * FROM ServiceEntity")
        fun getAll(): List<ServiceEntity>

        @Query("SELECT * FROM ServiceEntity WHERE id = :ServiceId")
        fun show (ServiceId: Int): ServiceEntity

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertAll(services: List<ServiceEntity>)

        @Delete
        fun delete(service: ServiceEntity)
    }