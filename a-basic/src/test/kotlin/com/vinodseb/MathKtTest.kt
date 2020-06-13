package com.vinodseb

import kotlin.test.Test
import kotlin.test.assertEquals

class MathKtTest {

    @Test
    fun add() {
        assertEquals(3, add(1, 2))
    }

    @Test
    fun subtract() {
        assertEquals(1, subtract(3, 2))
    }

    @Test
    fun greaterThan() {
        assertEquals("true", greaterThan(5, 3))
    }
}