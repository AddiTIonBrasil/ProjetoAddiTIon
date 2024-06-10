package com.example.pime3app.bd

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper (context: Context) : SQLiteOpenHelper(context, "database.db",null,1) {

    val sql = arrayOf(
        "CREATE TABLE IF NOT EXISTS USUARIO (ID INTEGER PRIMARY KEY AUTOINCREMENT, USERNAME TEXT)"
    )

    override fun onCreate(db: SQLiteDatabase) {
        sql.forEach {
            db.execSQL(it)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS USUARIO")
        onCreate(db)
    }

}