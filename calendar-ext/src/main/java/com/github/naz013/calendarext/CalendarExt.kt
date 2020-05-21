package com.github.naz013.calendarext

import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun Calendar.setDayOfMonth(day: Int): Calendar = apply { this.set(Calendar.DAY_OF_MONTH, day) }

fun Calendar.setDayOfWeek(day: Int): Calendar = apply { this.set(Calendar.DAY_OF_WEEK, day) }

fun Calendar.setDayOfYear(day: Int): Calendar = apply { this.set(Calendar.DAY_OF_YEAR, day) }

fun Calendar.setMonth(month: Int): Calendar = apply { this.set(Calendar.MONTH, month) }

fun Calendar.setYear(year: Int): Calendar = apply { this.set(Calendar.YEAR, year) }

fun Calendar.addMillisecond(): Calendar = addMilliseconds(1)

fun Calendar.addMilliseconds(millis: Int): Calendar = apply { this.add(Calendar.MILLISECOND, millis) }

fun Calendar.addSecond(): Calendar = addSeconds(1)

fun Calendar.addSeconds(seconds: Int): Calendar = apply { this.add(Calendar.SECOND, seconds) }

fun Calendar.addMinute(): Calendar = addMinutes(1)

fun Calendar.addMinutes(minutes: Int): Calendar = apply { this.add(Calendar.MINUTE, minutes) }

fun Calendar.addHour(): Calendar = addHours(1)

fun Calendar.addHours(hours: Int): Calendar = apply { this.add(Calendar.HOUR_OF_DAY, hours) }

fun Calendar.addDayOfMonth(): Calendar = addDaysOfMonth(1)

fun Calendar.addDaysOfMonth(days: Int): Calendar = apply { this.add(Calendar.DAY_OF_MONTH, days) }

fun Calendar.addMonth(): Calendar = addMonths(1)

fun Calendar.addMonths(months: Int): Calendar = apply { this.add(Calendar.MONTH, months) }

fun Calendar.addYear(): Calendar = addYears(1)

fun Calendar.addYears(years: Int): Calendar = apply { this.add(Calendar.YEAR, years) }

fun String.toCalendar(formatter: (String) -> Date?): Calendar =
    formatter.invoke(this).takeIf { it != null }?.toCalendar() ?: newCalendar()

fun Long.toCalendar(): Calendar = newCalendar().apply { timeInMillis = this@toCalendar }

fun Date.toCalendar(): Calendar = newCalendar().apply { time = this@toCalendar }

fun newCalendar(date: Date = Date()): Calendar = date.toCalendar()

fun newCalendar(millis: Long = 0L): Calendar =
    if (millis == 0L) newCalendar() else millis.toCalendar()

fun newCalendar(): Calendar = Calendar.getInstance()

fun newCalendar(timeZone: TimeZone): Calendar = Calendar.getInstance(timeZone)

fun newCalendar(locale: Locale): Calendar = Calendar.getInstance(locale)

fun newCalendar(timeZone: TimeZone, locale: Locale): Calendar =
    Calendar.getInstance(timeZone, locale)