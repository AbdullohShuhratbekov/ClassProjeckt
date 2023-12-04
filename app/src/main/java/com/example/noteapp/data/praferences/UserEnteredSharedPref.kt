package com.example.noteapp.data.praferences

import android.content.Context


private const val SHARED_PREFERENCES_KAY = "SHARED_PREFERENCES_KAY"
private const val USER_SIGH_SHEREDPREF_KEY = "USER_SIGH_SHEREDPREF_KEY"


class UserEnteredSharedPref (

    private val context: Context,
){
    private val sharedPreferences = context.getSharedPreferences(
        SHARED_PREFERENCES_KAY,
        Context.MODE_PRIVATE
    )
    fun getIsUserFirstSigh(b: Boolean):Boolean{
       return sharedPreferences.getBoolean(USER_SIGH_SHEREDPREF_KEY,false)
    }

    fun setUserFirstSigh(userFirstSigh:Boolean) {
        sharedPreferences.edit().putBoolean(USER_SIGH_SHEREDPREF_KEY,userFirstSigh).apply()
    }
}