package id.imrob.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.imrob.myfirstapp.ui.artspace.ArtSpaceApp
import id.imrob.myfirstapp.ui.diceroller.DiceRollerApp
import id.imrob.myfirstapp.ui.lemonade.LemonadeApp
import id.imrob.myfirstapp.ui.theme.MyFirstAppTheme
import id.imrob.myfirstapp.ui.tiptime.TipTimeApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            DiceRollerApp()
//            LemonadeApp()
//            TipTimeApp()
            ArtSpaceApp()
        }
    }

    override fun onStart() {
        super.onStart()
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstAppTheme {
        Greeting("Android")
    }
}