package com.enieber.timeupdate

import android.content.Context

val PREFERENCE_NAME = "preference"
val PREFERENCE_WIDGET_ID = "widgetId"

class MyPreference(context: Context) {

    val preference = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun updateWidgetIds(ids: MutableSet<String>) {
        val editor = preference.edit()
        editor.putStringSet(PREFERENCE_WIDGET_ID, ids)
        editor.apply()
    }

    fun getWidgetIds() : MutableSet<String> {
        return preference.getStringSet(PREFERENCE_WIDGET_ID, hashSetOf())
    }
}