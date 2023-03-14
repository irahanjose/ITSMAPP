package mx.tecnm.misantla.itsmapp.screen.login

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.tecnm.misantla.itsmapp.R
import mx.tecnm.misantla.itsmapp.screen.login.components.LoginBottonBar
import mx.tecnm.misantla.itsmapp.screen.login.components.LoginContent
import mx.tecnm.misantla.itsmapp.ui.theme.ITSMAPPTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginScreens (){
    Scaffold(
        topBar = {},
        content = {
            //BodyContent(it)
            LoginContent()
        },
        bottomBar = {
            LoginBottonBar()
        }
    )
}

//showSystemUi = true como dispositivo movil
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    // ITSMAPPTheme {
    // BodyContent()
    // }
    ITSMAPPTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            //organizar de manera vertical
            LoginScreens()

        }
    }
}