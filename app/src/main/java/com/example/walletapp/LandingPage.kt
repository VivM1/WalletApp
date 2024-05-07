package com.example.walletapp

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WalletBankSection() {
    Column( verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)) {
        IndividualSurface(titleInSurface = "Wallet", color = Color(0xFF76BDF3))
        IndividualSurface(titleInSurface = "Bank", color = Color(0xFFEE7B71))
    }
}


@Composable
fun IndividualSurface(
    titleInSurface: String,
    color: Color
) {
    Surface(
        modifier = Modifier
            .clickable { }
            .height(250.dp)
            .width(330.dp)
        /*Padding for surface*/,
        color = color,
        shadowElevation = 40.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        TextInSurface(text = titleInSurface)
    }
}


@Composable
fun TextInSurface(
    text : String,
) {
    Column() {
        Text(text = text,
            modifier = Modifier
                .padding(top = 60.dp)
                .padding(horizontal = 30.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold
        )
        Buttons()
    }
    
}



@Composable
fun Buttons() {
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(top = 30.dp)
    )
    {
        FilledTonalButton(onClick = { },
            modifier = Modifier.padding(start = 30.dp)
        ) {
            Text(text = "Transfer")
        }
        Spacer(modifier = Modifier.width(30.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "View")
        }

    }

}















