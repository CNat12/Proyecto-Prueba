package com.ita.proyectoprueba.data.database


import androidx.room.Database
import androidx.room.RoomDatabase
import com.ita.proyectoprueba.data.dao.ServiceDao
import com.ita.proyectoprueba.data.model.ServiceEntity

@Database(entities = [ServiceEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun serviceDao(): ServiceDao
}