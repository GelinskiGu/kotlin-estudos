package com.example.convidados.repository

// Não se pode instanciar o banco de dados mais de uma vez,
// por isso tem que ser privado o construtor
class GuestRepository private constructor() {

    // Singleton - Padrão de projeto
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(): GuestRepository {
            if(!Companion::repository.isInitialized) {
                repository = GuestRepository()
            }
            return repository
        }
    }
}