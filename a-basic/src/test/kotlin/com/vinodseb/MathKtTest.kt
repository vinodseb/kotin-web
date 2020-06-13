package com.vinodseb

import kotlin.test.Test
import kotlin.test.assertEquals

class MathKtTest {

    @Test
    fun addTest() {
        assertEquals(3, add(1, 2))
    }

    @Test
    fun subtractTest() {
        assertEquals(1, subtract(3, 2))
    }

    @Test
    fun greaterThanTest() {
        assertEquals("true", greaterThan(5, 3))
    }

    @Test
    fun weekdayTest() {
        assertEquals(3, weekday("TUESDAY"))
    }
}