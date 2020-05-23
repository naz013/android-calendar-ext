package com.github.naz013.calendarext

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.util.Calendar

class CalendarExtTest {

    private val millis = System.currentTimeMillis()
    private lateinit var calendar: Calendar

    @Before
    fun before() {
        calendar = newCalendar().apply { timeInMillis = millis }
    }

    @Test
    fun dropSeconds_shouldSetSecondFieldToZero() {
        calendar.setTime(15, 15, 15)
        calendar.dropSeconds()
        assertEquals(0, calendar.getSecond())
    }

    @Test
    fun dropMilliseconds_shouldSetMillisecondFieldToZero() {
        calendar.dropMilliseconds()
        assertEquals(0, calendar.getMillisecond())
    }

    @Test
    fun isAfter() {
        assertTrue(newCalendar(millis + 1000L).isAfter(calendar))
    }

    @Test
    fun isBefore() {
        assertTrue(newCalendar(millis - 1000L).isBefore(calendar))
    }

    @Test
    fun diffInMillis_shouldHaveOneSecondDifference() {
        assertEquals(1000L, newCalendar(millis + 1000L).diffInMillis(calendar))
    }

    @Test
    fun diffInDays_shouldHaveOneDayDifference() {
        assertEquals(1, newCalendar(millis).apply { addDayOfMonth() }.diffInDays(calendar))
    }

    @Test
    fun isExactlySame() {
        assertTrue(newCalendar(millis).isExactlySame(calendar))
    }

    @Test
    fun isSameDateAndTime() {
        assertTrue(newCalendar(millis).isSameDateAndTime(calendar))
    }

    @Test
    fun isSameTime() {
        assertTrue(newCalendar(millis).isSameTime(calendar))
    }

    @Test
    fun isSameDate() {
        assertTrue(newCalendar(millis).isSameDate(calendar))
    }

    @Test
    fun isLastDayOfMonth() {
        calendar.setDate(2020, 3, 30)
        assertTrue(calendar.isLastDayOfMonth())
    }

    private fun midMonthDate(month: Int): Calendar =
        calendar.setDate(2020, month, 15)

    @Test
    fun isDecember() {
        assertTrue(midMonthDate(Calendar.DECEMBER).isDecember())
    }

    @Test
    fun isNovember() {
        assertTrue(midMonthDate(Calendar.NOVEMBER).isNovember())
    }

    @Test
    fun isOctober() {
        assertTrue(midMonthDate(Calendar.OCTOBER).isOctober())
    }

    @Test
    fun isSeptember() {
        assertTrue(midMonthDate(Calendar.SEPTEMBER).isSeptember())
    }

    @Test
    fun isAugust() {
        assertTrue(midMonthDate(Calendar.AUGUST).isAugust())
    }

    @Test
    fun isJuly() {
        assertTrue(midMonthDate(Calendar.JULY).isJuly())
    }

    @Test
    fun isJune() {
        assertTrue(midMonthDate(Calendar.JUNE).isJune())
    }

    @Test
    fun isMay() {
        assertTrue(midMonthDate(Calendar.MAY).isMay())
    }

    @Test
    fun isApril() {
        assertTrue(midMonthDate(Calendar.APRIL).isApril())
    }

    @Test
    fun isMarch() {
        assertTrue(midMonthDate(Calendar.MARCH).isMarch())
    }

    @Test
    fun isFebruary() {
        assertTrue(midMonthDate(Calendar.FEBRUARY).isFebruary())
    }

    @Test
    fun isJanuary() {
        assertTrue(midMonthDate(Calendar.JANUARY).isJanuary())
    }

    @Test
    fun isMonth() {
        assertTrue(calendar.setMonth(Calendar.APRIL).isMonth(Calendar.APRIL))
    }

    private fun weekdayCalendar(dayOfWeek: Int): Calendar =
        calendar.apply { setDayOfWeek(dayOfWeek) }

    @Test
    fun isSaturday() {
        assertTrue(weekdayCalendar(Calendar.SATURDAY).isSaturday())
    }

    @Test
    fun isFriday() {
        assertTrue(weekdayCalendar(Calendar.FRIDAY).isFriday())
    }

    @Test
    fun isThursday() {
        assertTrue(weekdayCalendar(Calendar.THURSDAY).isThursday())
    }

    @Test
    fun isWednesday() {
        assertTrue(weekdayCalendar(Calendar.WEDNESDAY).isWednesday())
    }

    @Test
    fun isTuesday() {
        assertTrue(weekdayCalendar(Calendar.TUESDAY).isTuesday())
    }

    @Test
    fun isMonday() {
        assertTrue(weekdayCalendar(Calendar.MONDAY).isMonday())
    }

    @Test
    fun isSunday() {
        assertTrue(weekdayCalendar(Calendar.SUNDAY).isSunday())
    }

    @Test
    fun isDayOfWeek() {
        assertTrue(weekdayCalendar(Calendar.SATURDAY).isDayOfWeek(Calendar.SATURDAY))
    }

    @Test
    fun setTime() {
        calendar.setTime(15, 30)
        assertEquals(15, calendar.getHourOfDay())
        assertEquals(30, calendar.getMinute())
    }

    @Test
    fun setDate() {
    }

    @Test
    fun setMillis() {
    }

    @Test
    fun addMillis() {
    }

    @Test
    fun setMillisecond() {
    }

    @Test
    fun getLastDayOfMonth() {
    }

    @Test
    fun getMillisecond() {
    }

    @Test
    fun setSecond() {
    }

    @Test
    fun getSecond() {
    }

    @Test
    fun setMinute() {
    }

    @Test
    fun getMinute() {
    }

    @Test
    fun setHour() {
    }

    @Test
    fun getHour() {
    }

    @Test
    fun setHourOfDay() {
    }

    @Test
    fun getHourOfDay() {
    }

    @Test
    fun setDayOfMonth() {
    }

    @Test
    fun getDayOfMonth() {
    }

    @Test
    fun setDayOfWeek() {
    }

    @Test
    fun getDayOfWeek() {
    }

    @Test
    fun setDayOfYear() {
    }

    @Test
    fun getDayOfYear() {
    }

    @Test
    fun setMonth() {
    }

    @Test
    fun getMonth() {
    }

    @Test
    fun setYear() {
    }

    @Test
    fun getYear() {
    }

    @Test
    fun addMillisecond() {
    }

    @Test
    fun addMilliseconds() {
    }

    @Test
    fun addSecond() {
    }

    @Test
    fun addSeconds() {
    }

    @Test
    fun addMinute() {
    }

    @Test
    fun addMinutes() {
    }

    @Test
    fun addHour() {
    }

    @Test
    fun addHours() {
    }

    @Test
    fun addDayOfMonth() {
    }

    @Test
    fun addDaysOfMonth() {
    }

    @Test
    fun addMonth() {
    }

    @Test
    fun addMonths() {
    }

    @Test
    fun addYear() {
    }

    @Test
    fun addYears() {
    }

    @Test
    fun testCopy_mustBeExactlySame() {
        assertTrue(calendar.copy().isExactlySame(calendar))
    }
}