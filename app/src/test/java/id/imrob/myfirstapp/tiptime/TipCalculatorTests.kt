package id.imrob.myfirstapp.tiptime

import id.imrob.myfirstapp.ui.tiptime.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun `calculate 20 percent tip no roundup` () {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "Rp2,00"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun `calculate 50 percent tip roundup` () {
        val amount = 10000.00
        val tipPercent = 50.00
        val expectedTip = "Rp5.000,00"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertTrue(expectedTip == actualTip)
    }

}