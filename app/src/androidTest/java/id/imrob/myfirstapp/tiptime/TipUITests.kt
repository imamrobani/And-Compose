package id.imrob.myfirstapp.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import id.imrob.myfirstapp.ui.theme.MyFirstAppTheme
import id.imrob.myfirstapp.ui.tiptime.TipTimeApp
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            MyFirstAppTheme {
                TipTimeApp()
            }
        }
        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")
        composeTestRule.onNodeWithText("Tip amount: Rp2,00").assertExists()
    }

}