package de.sharable.android.school_planner.util

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Constants {

    companion object {
        const val shortDateFormat: String = "EE, d. MMM y"
        const val longDateFormat: String = "EEEE, d. MMM"
        const val mainTitleDateFormat: String = "EEEE, d. MMM y"

        val shortFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern(shortDateFormat)
        val longFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern(longDateFormat)
        val mainTitleFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern(mainTitleDateFormat)

        val reminderChoices: Array<String> = arrayOf("1 Day Before", "2 Day Before", "3 Day Before", "4 Day Before",
            "1 Week Before", "2 Week Before")
        val reminderDays: IntArray = intArrayOf(1, 2, 3, 4, 7, 14)

        fun reminderChoiceFromLocalDate(localDate: LocalDate, targetDate: LocalDate): String? {
            for(i: Int in reminderDays.indices) {
                if(localDate.plusDays(reminderDays[i].toLong()) == targetDate) {
                    return reminderChoices[i]
                }
            }

            return null
        }
    }

}