package com.github.naz013.calendarext

import java.util.Calendar
import java.util.Calendar.DAY_OF_MONTH
import java.util.Calendar.DAY_OF_WEEK
import java.util.Calendar.DAY_OF_YEAR
import java.util.Calendar.HOUR
import java.util.Calendar.HOUR_OF_DAY
import java.util.Calendar.MILLISECOND
import java.util.Calendar.MINUTE
import java.util.Calendar.MONTH
import java.util.Calendar.SECOND
import java.util.Calendar.YEAR
import java.util.Date
import java.util.Locale
import java.util.TimeZone
import java.util.concurrent.TimeUnit

fun Calendar.dropSeconds() = setSecond(0)

fun Calendar.dropMilliseconds() = setMillisecond(0)

fun Calendar.isAfter(calendar: Calendar) = diffInMillis(calendar) > 0L

fun Calendar.isBefore(calendar: Calendar) = diffInMillis(calendar) < 0L

fun Calendar.diffInMillis(calendar: Calendar): Long = this.timeInMillis - calendar.timeInMillis

fun Calendar.diffInDays(calendar: Calendar): Long =
    TimeUnit.DAYS.convert(diffInMillis(calendar), TimeUnit.MILLISECONDS)

fun Calendar.isExactlySame(calendar: Calendar) = isSameDateAndTime(calendar) &&
        getMillisecond() == calendar.getMillisecond()

fun Calendar.isSameDateAndTime(calendar: Calendar) = isSameDate(calendar) && isSameTime(calendar)

fun Calendar.isSameTime(calendar: Calendar) = getHourOfDay() == calendar.getHourOfDay() &&
        getMinute() == calendar.getMinute() &&
        getSecond() == calendar.getSecond()

fun Calendar.isSameDate(calendar: Calendar) = getDayOfMonth() == calendar.getDayOfMonth() &&
        getMonth() == calendar.getMonth() &&
        getYear() == calendar.getYear()

fun Calendar.isLastDayOfMonth() = getLastDayOfMonth() == getDayOfMonth()

fun Calendar.isDecember() = isMonth(Calendar.DECEMBER)

fun Calendar.isNovember() = isMonth(Calendar.NOVEMBER)

fun Calendar.isOctober() = isMonth(Calendar.OCTOBER)

fun Calendar.isSeptember() = isMonth(Calendar.SEPTEMBER)

fun Calendar.isAugust() = isMonth(Calendar.AUGUST)

fun Calendar.isJuly() = isMonth(Calendar.JULY)

fun Calendar.isJune() = isMonth(Calendar.JUNE)

fun Calendar.isMay() = isMonth(Calendar.MAY)

fun Calendar.isApril() = isMonth(Calendar.APRIL)

fun Calendar.isMarch() = isMonth(Calendar.MARCH)

fun Calendar.isFebruary() = isMonth(Calendar.FEBRUARY)

fun Calendar.isJanuary() = isMonth(Calendar.JANUARY)

fun Calendar.isMonth(month: Int) = getMonth() == month

fun Calendar.isSaturday() = isDayOfWeek(Calendar.SATURDAY)

fun Calendar.isFriday() = isDayOfWeek(Calendar.FRIDAY)

fun Calendar.isThursday() = isDayOfWeek(Calendar.THURSDAY)

fun Calendar.isWednesday() = isDayOfWeek(Calendar.WEDNESDAY)

fun Calendar.isTuesday() = isDayOfWeek(Calendar.TUESDAY)

fun Calendar.isMonday() = isDayOfWeek(Calendar.MONDAY)

fun Calendar.isSunday() = isDayOfWeek(Calendar.SUNDAY)

fun Calendar.isDayOfWeek(dayOfWeek: Int) = getDayOfWeek() == dayOfWeek

fun Calendar.setTime(hourOfDay: Int, minute: Int, second: Int = 0) = apply {
    setHourOfDay(hourOfDay)
    setMinute(minute)
    setSecond(second)
}

fun Calendar.takeTimeFrom(calendar: Calendar) =
    setTime(calendar.getHourOfDay(), calendar.getMinute(), calendar.getSecond())

fun Calendar.takeTimeFrom(date: Date) = takeTimeFrom(newCalendar(date))

fun Calendar.setDate(year: Int, month: Int, dayOfMonth: Int) = apply {
    set(year, month, dayOfMonth)
}

fun Calendar.takeDateFrom(calendar: Calendar) =
    setDate(calendar.getYear(), calendar.getMonth(), calendar.getDayOfMonth())

fun Calendar.takeDateFrom(date: Date) = takeDateFrom(newCalendar(date))

fun Calendar.setMillis(millis: Long) = apply { timeInMillis = millis }

fun Calendar.addMillis(millis: Long) = apply { timeInMillis += millis }

fun Calendar.setMillisecond(millisecond: Int) =
    apply { this.set(MILLISECOND, millisecond) }

fun Calendar.getLastDayOfMonth() = getActualMaximum(DAY_OF_MONTH)

fun Calendar.getMillisecond() = get(MILLISECOND)

fun Calendar.setSecond(second: Int) = apply { this.set(SECOND, second) }

fun Calendar.getSecond() = get(SECOND)

fun Calendar.setMinute(minute: Int) = apply { this.set(MINUTE, minute) }

fun Calendar.getMinute() = get(MINUTE)

fun Calendar.setHour(hour: Int) = apply { this.set(HOUR, hour) }

fun Calendar.getHour() = get(HOUR)

fun Calendar.setHourOfDay(hour: Int) = apply { this.set(HOUR_OF_DAY, hour) }

fun Calendar.getHourOfDay() = get(HOUR_OF_DAY)

fun Calendar.setDayOfMonth(day: Int) = apply { this.set(DAY_OF_MONTH, day) }

fun Calendar.getDayOfMonth() = get(DAY_OF_MONTH)

fun Calendar.setDayOfWeek(day: Int) = apply { this.set(DAY_OF_WEEK, day) }

fun Calendar.getDayOfWeek() = get(DAY_OF_WEEK)

fun Calendar.setDayOfYear(day: Int) = apply { this.set(DAY_OF_YEAR, day) }

fun Calendar.getDayOfYear() = get(DAY_OF_YEAR)

fun Calendar.setMonth(month: Int) = apply { this.set(MONTH, month) }

fun Calendar.getMonth() = get(MONTH)

fun Calendar.setYear(year: Int) = apply { this.set(YEAR, year) }

fun Calendar.getYear() = get(YEAR)

fun Calendar.addMillisecond() = addMilliseconds(1)

fun Calendar.addMilliseconds(millis: Int) = apply { this.add(MILLISECOND, millis) }

fun Calendar.addSecond() = addSeconds(1)

fun Calendar.addSeconds(seconds: Int) = apply { this.add(SECOND, seconds) }

fun Calendar.addMinute() = addMinutes(1)

fun Calendar.addMinutes(minutes: Int) = apply { this.add(MINUTE, minutes) }

fun Calendar.addHour() = addHours(1)

fun Calendar.addHours(hours: Int) = apply { this.add(HOUR_OF_DAY, hours) }

fun Calendar.addDayOfMonth() = addDaysOfMonth(1)

fun Calendar.addDaysOfMonth(days: Int) = apply { this.add(DAY_OF_MONTH, days) }

fun Calendar.addMonth() = addMonths(1)

fun Calendar.addMonths(months: Int) = apply { this.add(MONTH, months) }

fun Calendar.addYear() = addYears(1)

fun Calendar.addYears(years: Int) = apply { this.add(YEAR, years) }

fun String.toCalendar(formatter: (String) -> Date?) =
    formatter.invoke(this).takeIf { it != null }?.toCalendar() ?: newCalendar()

fun newCalendar(date: String, formatter: (String) -> Date?) =
    formatter.invoke(date)?.let { newCalendar(it) } ?: newCalendar()

fun Date.toCalendar() = newCalendar().apply { time = this@toCalendar }

fun newCalendar(date: Date = Date()) = newCalendar().apply { time = date }

fun newCalendar(millis: Long = 0L) =
    if (millis == 0L) newCalendar() else newCalendar().apply { timeInMillis = millis }

fun newCalendar(): Calendar = Calendar.getInstance()

fun newCalendar(timeZone: TimeZone): Calendar = Calendar.getInstance(timeZone)

fun newCalendar(locale: Locale): Calendar = Calendar.getInstance(locale)

fun newCalendar(timeZone: TimeZone, locale: Locale): Calendar =
    Calendar.getInstance(timeZone, locale)