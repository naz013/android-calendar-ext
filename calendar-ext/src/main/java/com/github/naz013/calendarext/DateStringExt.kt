package com.github.naz013.calendarext

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun String.toDate(
    dateFormat: String,
    timeZone: TimeZone = TimeZone.getDefault(),
    locale: Locale = Locale.getDefault()
): Date {
    return try {
        toDateWithException(dateFormat, timeZone, locale)
    } catch (e: ParseException) {
        Date()
    } catch (e: NumberFormatException) {
        Date()
    } catch (e: ArrayIndexOutOfBoundsException) {
        Date()
    } catch (e: NullPointerException) {
        Date()
    }
}

@Throws(
    ParseException::class,
    NumberFormatException::class,
    ArrayIndexOutOfBoundsException::class,
    NullPointerException::class
)
fun String.toDateWithException(
    dateFormat: String,
    timeZone: TimeZone = TimeZone.getDefault(),
    locale: Locale = Locale.getDefault()
): Date {
    val format = SimpleDateFormat(dateFormat, locale)
    format.timeZone = timeZone
    return format.parse(this) ?: throw NullPointerException("Parsed NULL date from String")
}