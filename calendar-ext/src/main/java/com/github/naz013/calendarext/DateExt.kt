package com.github.naz013.calendarext

import java.util.Date
import java.util.concurrent.TimeUnit

fun Date.isSameDateAndTime(date: Date) = toCalendar().isSameDateAndTime(date.toCalendar())

fun Date.isSameTime(date: Date) = toCalendar().isSameTime(date.toCalendar())

fun Date.isSameDate(date: Date) = toCalendar().isSameDate(date.toCalendar())

fun Date.isSame(date: Date) = toCalendar().isExactlySame(date.toCalendar())

fun Date.diffInDaysFrom(date: Date): Long {
    return TimeUnit.DAYS.convert(this.time - date.time, TimeUnit.MILLISECONDS)
}

fun Date.diffInDaysTo(date: Date): Long {
    return TimeUnit.DAYS.convert(date.time - this.time, TimeUnit.MILLISECONDS)
}

fun Date.second() = toCalendar().getSecond()

fun Date.minute() = toCalendar().getMinute()

fun Date.hour() = toCalendar().getHourOfDay()

fun Date.year() = toCalendar().getYear()

fun Date.month() = toCalendar().getMonth()

fun Date.day() = toCalendar().getDayOfMonth()