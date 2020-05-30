package com.github.naz013.calendarext

import java.text.DateFormat
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
    return toDate(SimpleDateFormat(dateFormat, locale), timeZone)
}

fun String.toDate(
    dateFormat: DateFormat,
    timeZone: TimeZone = TimeZone.getDefault()
): Date {
    return try {
        toDateWithException(dateFormat, timeZone)
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
    return this.toDateWithException(format, timeZone)
}

@Throws(
    ParseException::class,
    NumberFormatException::class,
    ArrayIndexOutOfBoundsException::class,
    NullPointerException::class
)
fun String.toDateWithException(
    dateFormat: DateFormat,
    timeZone: TimeZone = TimeZone.getDefault()
): Date {
    dateFormat.timeZone = timeZone
    return dateFormat.parse(this) ?: throw NullPointerException("Parsed NULL date from String")
}