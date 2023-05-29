package com.example.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.convidados.constants.DataBaseConstants

class GuestDataBase(context: Context, ) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Criação do banco de dados. É chamado uma única vez
        db.execSQL("create table" + DataBaseConstants.GUEST.TABLE_NAME + "(" +
                DataBaseConstants.GUEST.COLUMNS.ID + "integer primary key autoincrement, " +
                DataBaseConstants.GUEST.COLUMNS.NAME + " text,"+
                DataBaseConstants.GUEST.COLUMNS.PRESENCE + " integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Atualização do banco de dados. É chamado quando a versão do banco de dados é alterada
        /*
        if (oldVersion == 1) {
            if (newVersion == 2) {
                // Código para atualizar da versão 1 para a versão 2
            }
        }
         */
    }
}