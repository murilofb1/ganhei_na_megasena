package com.example.ganheinamegasena

import android.content.Context


abstract class SharedPref(context: Context) {
    protected val prefDB = context.getSharedPreferences(DATABASE, Context.MODE_PRIVATE)
    protected val editor = prefDB.edit()

    companion object {
        const val DATABASE = "db"
    }
}

class NumbersPref(context: Context) : SharedPref(context) {

    companion object {
        private const val LAST_NUMBERS = "lm"
    }

    fun putLastNumbers(value: String) {
        editor.putString(LAST_NUMBERS, value)
        editor.commit()
    }

    fun getLastNumbers(): String? {
        return prefDB.getString(LAST_NUMBERS, null)
    }
}