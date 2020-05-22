package com.github.naz013.calendarextensions

import com.github.naz013.calendarext.isAfter
import com.github.naz013.calendarext.newCalendar
import com.github.naz013.calendarext.toCalendar

fun main() {
    System.currentTimeMillis().toCalendar().isAfter(newCalendar())
}