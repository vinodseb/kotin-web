package com.vinodseb

import kotlin.test.Test
import kotlin.test.assertEquals

class MathKtTest {

    @Test
    fun add_test() {
        assertEquals(3, add(1, 2))
    }

    @Test
    fun subtract_test() {
        assertEquals(1, subtract(3, 2))
    }
}