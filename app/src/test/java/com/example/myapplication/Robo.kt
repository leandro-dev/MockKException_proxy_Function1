package com.example.myapplication

import io.mockk.mockk
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class Robo {
    private val stubInterface: StubInterface = mockk()
    private val stubInterfaceTwo: StubInterfaceTwo = mockk(relaxed = true)

    private val function: (StubClass) -> Unit = mockk(relaxed = true)

    @Test
    fun `assertTrue Robo`() {
        assertTrue(true)
    }

}