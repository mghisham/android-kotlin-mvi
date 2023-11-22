package com.mybank.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Dashboard(name: String, modifier: Modifier = Modifier, onExit: () -> Unit) {
    Column {

        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Spacer(modifier = Modifier.height(10.dp))

        for (i in 1..10) {
            Text(
                text = "Dashboard item $i",
                modifier = modifier
            )
            Spacer(modifier = Modifier.height(10.dp))
        }

        Button(onClick = { onExit() }) {
            Text(
                text = "Exit"
            )
        }
    }
}