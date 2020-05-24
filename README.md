# Android Calendar extension functions

Useful java.util.Calendar and java.util.Date Kotlin extension functions for Android

[![](https://jitpack.io/v/naz013/android-calendar-ext.svg)](https://jitpack.io/#naz013/android-calendar-ext)

Download
--------
Download latest version with Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
     implementation 'com.github.naz013:android-calendar-ext:1.0.3'
}
```

List of java.util.Calendar extension functions
```kotlin
dropSeconds()
dropMilliseconds()
isAfter(calendar)
isBefore(calendar)
diffInMillis(calendar)
diffInDays(calendar)
isExactlySame(calendar)
isSameDateAndTime(calendar)
isSameTime(calendar)
isSameDate(calendar)
isLastDayOfMonth()
isDecember()
isNovember()
isOctober()
isSeptember()
isAugust()
isJuly()
isJune()
isMay()
isApril()
isMarch()
isFebruary()
isJanuary()
isMonth(month)
isSaturday()
isFriday()
isThursday()
isWednesday()
isTuesday()
isMonday()
isSunday()
isDayOfWeek(dayOfWeek)
setTime(hourOfDay, minute, second)
takeTimeFrom(calendar)
takeTimeFrom(date)
setDate(year, month, dayOfMonth)
takeDateFrom(calendar)
takeDateFrom(date)
setMillis(millis)
addMillis(millis)
setMillisecond(millisecond)
getLastDayOfMonth()
getMillisecond()
setSecond(second)
getSecond()
setMinute(minute)
getMinute()
setHour(hour)
getHour()
setHourOfDay(hourOfDay)
getHourOfDay()
setDayOfMonth(dayOfMonth)
getDayOfMonth()
setDayOfWeek(dayOfWeek)
getDayOfWeek()
setDayOfYear(dayOfYear)
getDayOfYear()
setMonth(month)
getMonth()
setYear(year)
getYear()
addSecond()
addSeconds(seconds)
addMinute()
addMinutes(minutes)
addHourOfDay()
addHoursOfDay(hours)
addDayOfMonth()
addDaysOfMonth(days)
addMonth()
addMonths(months)
addYear()
addYears(years)
copy()
```

List of java.util.Date extension functions
```kotlin
isSameDateAndTime(date)
isSameTime(date)
isSameDate(date)
isSame(date)
diffInDaysFrom(date)
diffInDaysTo(date)
second()
minute()
hour()
hourOfDay()
year()
month()
dayOfMonth()
```

License
-------

    Copyright 2020 Nazar Sukhovych

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.