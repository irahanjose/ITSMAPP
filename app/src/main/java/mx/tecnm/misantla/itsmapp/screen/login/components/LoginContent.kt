package mx.tecnm.misantla.itsmapp.screen.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.tecnm.misantla.itsmapp.R
import mx.tecnm.misantla.itsmapp.ui.theme.Darkaray500

@Composable
fun LoginContent(){
    Column(
        //modificar el acho de columna
        modifier = Modifier
            // modifier = Modifier.padding(paddingValues = paddingValues)
            .fillMaxWidth(),
        //.wrapContentHeight()  //solo el espacio
        // .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.height(130.dp),
            painter = painterResource(id = R.drawable.tecnm) ,
            contentDescription = "Logo TECNM" )
        Text(
            text = "TecNM Campus Misantla"
        )

       //---- componente card

        CardForm()

        //----------------------

    }
}

@Composable
fun CardForm(){
    Card(
        modifier = Modifier.padding(start = 50.dp, end = 50.dp),
        backgroundColor = Darkaray500) {

        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Text(
                modifier = Modifier.
                padding(
                    top = 40.dp,
                    bottom = 0.dp,
                    start = 0.dp,
                    end = 0.dp),
                text = "LOGIN",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            // margen
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Por favor inicia sesion para continuar",
                fontSize = 12.sp,
                color = Color.Gray
            )
//------
         //   TextField(
           OutlinedTextField(
                modifier = Modifier.padding(top = 25.dp),
                value = "",    // lo que va almacenar
                onValueChange = { },    // guardar el estado del texto que se digite
              //  placeholder = {
               label = {
                    Text(text = "Correo electronico")
                },
             //  leadingIcon = {
               trailingIcon = {
                   Icon(
                       imageVector = Icons.Default.Email,
                       contentDescription = "",
                       tint = Color.White)
               }
            )
            Spacer(modifier = Modifier.height(10.dp))
          //  TextField(
            OutlinedTextField(
                value = "",    // lo que va almacenar
                onValueChange = { },    // guardar el estado del texto que se digite
              //  placeholder = {
                label = {
                    Text(text = "Contraseña")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "")
                }
            )

            //-----------

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                  //  .padding(horizontal = 30.dp, vertical = 15.dp),
                .padding( vertical = 35.dp),
                onClick = {  }) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "INICIAR SESION")
            }
        }

    }
}