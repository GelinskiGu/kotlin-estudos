package com.example.convidados.repository

import android.content.ContentValues
import android.content.Context
import com.example.convidados.model.GuestModel

// Não se pode instanciar o banco de dados mais de uma vez,
// por isso tem que ser privado o construtor
class GuestRepository private constructor(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    // Singleton - Padrão de projeto
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if(!Companion::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun insert(guest: GuestModel): Boolean {
        return try {
            val db = guestDataBase.writableDatabase

            val present = if (guest.presence) 1 else 0

            val values = ContentValues()
            values.put("name", guest.name)
            values.put("presence", guest.presence)

            db.insert("Guest", null, values)
            true
        } catch (e: Exception) {
            false
        }
    }

}