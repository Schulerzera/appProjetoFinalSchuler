package com.example.schulerquiz.repository

import android.content.ContentValues
import android.content.Context
import com.example.schulerquiz.model.APPDatabase
import com.example.schulerquiz.model.User

class UserRepository(context: Context) {
    private val db = APPDatabase(context).readableDatabase
    private val table = "users"

    fun addUser(user: User): Long {
        val content = ContentValues()
        content.put("score", user.score)
        return db.insert(table, null, content)
    }
}