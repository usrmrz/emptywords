package dev.usrmrz.emptywords

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.usrmrz.emptywords.teststate.StateTestScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateTestScreen()
        }
    }
}

@Preview(apiLevel = 34, showBackground = true)
@Composable
fun StateTestScreenPreview() {
    StateTestScreen()
}