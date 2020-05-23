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
        calendar = newCalendar()
    }

    @Test
    fun dropSeconds_shouldSetSecondFieldToZero() {
        calendar.setTime(15, 15, 15)
        calendar.dropSeconds()
        assertEquals(0, calendar.getSecond())
    }

    @Test
    fun dropMilliseconds_shouldSetMillisecondFieldToZero() {
        calendar.timeInMillis = System.currentTimeMillis()
        calendar.dropMilliseconds()
        assertEquals(0, calendar.getMillisecond())
    }

    @Test
    fun isAfter() {
        calendar.timeInMillis = millis
        assertTrue(newCalendar(millis + 1000L).isAfter(calendar))
    }

    @Test
    fun isBefore() {
        calendar.timeInMillis = millis
        assertTrue(newCalendar(millis - 1000L).isBefore(calendar))
    }

    @Test
    fun diffInMillis_shouldHaveOneSecondDifference() {
        calendar.timeInMillis = millis
        assertEquals(1000L, newCalendar(millis + 1000L).diffInMillis(calendar))
    }

    @Test
    fun diffInDays_shouldHaveOneDayDifference() {
        calendar.timeInMillis = millis
        assertEquals(1, newCalendar(millis).apply { addDayOfMonth() }.diffInDays(calendar))
    }

    @Test
    fun isExactlySame() {
    }

    @Test
    fun isSameDateAndTime() {
    }

    @Test
    fun isSameTime() {
    }

    @Test
    fun isSameDate() {
    }

    @Test
    fun isLastDayOfMonth() {
    }

    @Test
    fun isDecember() {
    }

    @Test
    fun isNovember() {
    }

    @Test
    fun isOctober() {
    }

    @Test
    fun isSeptember() {
    }

    @Test
    fun isAugust() {
    }

    @Test
    fun isJuly() {
    }

    @Test
    fun isJune() {
    }

    @Test
    fun isMay() {
    }

    @Test
    fun isApril() {
    }

    @Test
    fun isMarch() {
    }

    @Test
    fun isFebruary() {
    }

    @Test
    fun isJanuary() {
    }

    @Test
    fun isMonth() {
    }

    @Test
    fun isSaturday() {
    }

    @Test
    fun isFriday() {
    }

    @Test
    fun isThursday() {
    }

    @Test
    fun isWednesday() {
    }

    @Test
    fun isTuesday() {
    }

    @Test
    fun isMonday() {
    }

    @Test
    fun isSunday() {
    }

    @Test
    fun isDayOfWeek() {
    }

    @Test
    fun setTime() {
    }

    @Test
    fun takeTimeFrom() {
    }

    @Test
    fun testTakeTimeFrom() {
    }

    @Test
    fun setDate() {
    }

    @Test
    fun takeDateFrom() {
    }

    @Test
    fun testTakeDateFrom() {
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
    fun toCalendar() {
    }

    @Test
    fun newCalendar_shouldCreateNewCalendar() {
    }

    @Test
    fun testToCalendar() {
    }

    @Test
    fun testNewCalendar() {
    }

    @Test
    fun testNewCalendar1() {
    }

    @Test
    fun testNewCalendar2() {
    }

    @Test
    fun testNewCalendar3() {
    }

    @Test
    fun testNewCalendar4() {
    }

    @Test
    fun testNewCalendar5() {
    }


}