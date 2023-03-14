package mx.tecnm.misantla.itsmapp.screen.login.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginBottonBar(){

    Row (
        modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp),
        horizontalArrangement = Arrangement.Center
            ){
        Text(text = "No tienes cuenta?",
            fontSize = 14.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.width(7.dp))
        Text(text = "REGISTRATE AQUI",
            color = Color.Red,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}