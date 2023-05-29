package com.example.convidados.repository

import android.content.Context

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

    fun get(){
    }
    fun save() {}

}