package dev.usrmrz.emptywords.teststate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

//remember -> persist state on recomposition

@Composable
fun StateTestScreen() {
    var name by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        StateTestText(name)
        StateTestTextField(name, onNameChange = {
            name = it
        })
    }
}

@Composable
fun StateTestText(name: String) {
    Text(text = if(name.isEmpty()) "Hello" else "Hello, $name", style = TextStyle(fontSize = 30.sp))

}

@Composable
fun StateTestTextField(name: String, onNameChange: (String) -> Unit) {
    OutlinedTextField(
        value = name,
        onValueChange = {
            onNameChange(it)
        },
        label = { Text(text = "Enter your Name") }
    )
}

@Preview(apiLevel = 34, showBackground = true)
@Composable
fun StateTestScreenPreview() {
    StateTestScreen()
}