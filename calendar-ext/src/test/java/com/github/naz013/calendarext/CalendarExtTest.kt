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
        calendar.setDate(2020, 4, 15)
        assertTrue(calendar.isMay())
        assertEquals(2020, calendar.getYear())
        assertEquals(15, calendar.getDayOfMonth())
    }

    @Test
    fun setMillis() {
        val millis = System.currentTimeMillis()
        calendar.setMillis(millis)
        assertEquals(millis, calendar.timeInMillis)
    }

    @Test
    fun addMillis() {
        val millis = System.currentTimeMillis()
        calendar.setMillis(millis)
        calendar.addMillis(5000L)
        assertEquals(millis + 5000L, calendar.timeInMillis)
    }

    @Test
    fun setMillisecond() {
        calendar.setMillisecond(500)
        assertEquals(500, calendar.getMillisecond())
    }

    @Test
    fun getLastDayOfMonth() {
        calendar.setDate(2020, 3, 15)
        assertEquals(30, calendar.getLastDayOfMonth())
    }

    @Test
    fun setSecond() {
        calendar.setSecond(10)
        assertEquals(10, calendar.getSecond())
    }

    @Test
    fun setMinute() {
        calendar.setMinute(10)
        assertEquals(10, calendar.getMinute())
    }

    @Test
    fun setHour() {
        calendar.setHour(10)
        assertEquals(10, calendar.getHour())
    }

    @Test
    fun setHourOfDay() {
        calendar.setHourOfDay(10)
        assertEquals(10, calendar.getHourOfDay())
    }

    @Test
    fun setDayOfMonth() {
        calendar.setDayOfMonth(10)
        assertEquals(10, calendar.getDayOfMonth())
    }

    @Test
    fun setDayOfWeek() {
        calendar.setDayOfWeek(3)
        assertEquals(3, calendar.getDayOfWeek())
    }

    @Test
    fun setDayOfYear() {
        calendar.setDayOfYear(10)
        assertEquals(10, calendar.getDayOfYear())
    }

    @Test
    fun setMonth() {
        calendar.setMonth(10)
        assertEquals(10, calendar.getMonth())
    }

    @Test
    fun setYear() {
        calendar.setYear(2025)
        assertEquals(2025, calendar.getYear())
    }

    @Test
    fun addSecond() {
        calendar.setSecond(0)
        val second = calendar.getSecond()
        calendar.addSecond()
        assertEquals(second + 1, calendar.getSecond())
    }

    @Test
    fun addSeconds() {
        calendar.setSecond(0)
        val second = calendar.getSecond()
        calendar.addSeconds(5)
        assertEquals(second + 5, calendar.getSecond())
    }

    @Test
    fun addMinute() {
        calendar.setMinute(0)
        val minute = calendar.getMinute()
        calendar.addMinute()
        assertEquals(minute + 1, calendar.getMinute())
    }

    @Test
    fun addMinutes() {
        calendar.setMinute(0)
        val minute = calendar.getMinute()
        calendar.addMinutes(5)
        assertEquals(minute + 5, calendar.getMinute())
    }

    @Test
    fun addHour() {
        calendar.setHourOfDay(0)
        val hourOfDay = calendar.getHourOfDay()
        calendar.addHourOfDay()
        assertEquals(hourOfDay + 1, calendar.getHourOfDay())
    }

    @Test
    fun addHours() {
        calendar.setHourOfDay(0)
        val hourOfDay = calendar.getHourOfDay()
        calendar.addHoursOfDay(5)
        assertEquals(hourOfDay + 5, calendar.getHourOfDay())
    }

    @Test
    fun addDayOfMonth() {
        calendar.setDayOfMonth(5)
        val dayOfMonth = calendar.getDayOfMonth()
        calendar.addDayOfMonth()
        assertEquals(dayOfMonth + 1, calendar.getDayOfMonth())
    }

    @Test
    fun addDaysOfMonth() {
        calendar.setDayOfMonth(5)
        val dayOfMonth = calendar.getDayOfMonth()
        calendar.addDaysOfMonth(5)
        assertEquals(dayOfMonth + 5, calendar.getDayOfMonth())
    }

    @Test
    fun addMonth() {
        calendar.setMonth(5)
        val month = calendar.getMonth()
        calendar.addMonth()
        assertEquals(month + 1, calendar.getMonth())
    }

    @Test
    fun addMonths() {
        calendar.setMonth(5)
        val month = calendar.getMonth()
        calendar.addMonths(5)
        assertEquals(month + 5, calendar.getMonth())
    }

    @Test
    fun addYear() {
        calendar.setYear(2020)
        val year = calendar.getYear()
        calendar.addYear()
        assertEquals(year + 1, calendar.getYear())
    }

    @Test
    fun addYears() {
        calendar.setYear(2020)
        val year = calendar.getYear()
        calendar.addYears(5)
        assertEquals(year + 5, calendar.getYear())
    }

    @Test
    fun testCopy_mustBeExactlySame() {
        assertTrue(calendar.copy().isExactlySame(calendar))
    }
}