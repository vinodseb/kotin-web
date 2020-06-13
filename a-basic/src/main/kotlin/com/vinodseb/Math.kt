package com.vinodseb

fun add(arg1: Int, arg2: Int) = arg1 + arg2

fun subtract(arg1: Int, arg2: Int) = arg1 - arg2

fun greaterThan(arg1: Int, arg2: Int) = if (arg1 > arg2) "true" else "false"

fun weekday(day: String) = when (day) {
    "SUNDAY" -> 1
    "MONDAY" -> 2
    "TUESDAY" -> 3
    "WEDNESDAY" -> 4
    "THURSDAY" -> 5
    "FRIDAY" -> 6
    "SATURDAY" -> 7
    else -> 0
}