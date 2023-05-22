package com.slabstech.bhoomi.prep

import org.junit.Assert
import org.junit.jupiter.api.Test

internal class ManipulateStringsTest {
    @Test
    fun testCheckDigits() {
        val manipulateStrings = ManipulateStrings()
        Assert.assertEquals(manipulateStrings.checkDigits(10), "zero")
        Assert.assertEquals(manipulateStrings.checkDigits(25), "five")
        Assert.assertEquals(manipulateStrings.checkDigits(14), "even")
        Assert.assertEquals(manipulateStrings.checkDigits(13), "odd")
        Assert.assertNotEquals(manipulateStrings.checkDigits(0), "even")
    }
}