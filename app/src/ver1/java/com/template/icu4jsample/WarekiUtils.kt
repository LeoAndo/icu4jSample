package com.template.icu4jsample

import com.ibm.icu.text.DateFormatSymbols
import com.ibm.icu.text.SimpleDateFormat
import com.ibm.icu.util.JapaneseCalendar
import java.util.*

object WarekiUtils {
    /**
     * 和暦表示用の文字列を取得する.
     */
    fun getWarekiStr(): String {
        return try {
            // JapaneseCalendarクラスは、日本の元号に対応しています.
            val jpCalendar = JapaneseCalendar()
            val dfs = DateFormatSymbols(jpCalendar, Locale.JAPANESE)
            val dateFormat = SimpleDateFormat("Gyy年MM月dd日", dfs)
            dateFormat.calendar = jpCalendar
            dateFormat.format(jpCalendar.time)
        } catch (ex: Exception) {
            ex.message ?: ""
        }
    }
}