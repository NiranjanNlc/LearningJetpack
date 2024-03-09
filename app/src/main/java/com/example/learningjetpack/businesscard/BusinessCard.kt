package com.example.learningjetpack.businesscard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningjetpack.R

@Composable
fun BusinessCard() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Icon(
                modifier = Modifier
                    .padding(16.dp)
                    .height(100.dp)
                    .width(100.dp),
                imageVector = Icons.Default.AccountCircle,
                contentDescription = " go top hell "
            )
            Text(
                text = " Niranjan Lamichhane ",
                modifier = Modifier.padding(16.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Senior Android Developer",
//                modifier = Modifier.padding(16.dp),
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.height(48.dp))
            Column(
//                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            )
            {
                ContactRow(
                    icon = Icons.Default.Phone,
                    contact = "+977-9841234567"
                )
                ContactRow(icon = Icons.Default.Email, contact = "niranjannlc@keemail.com")
                ContactRow(icon = Icons.Default.LocationOn, contact = "Kathmandu, Nepal")

                Spacer(modifier = Modifier.height(32.dp))

            }
        }
    }
}
@Composable
fun ContactSection() {
Column(
    modifier = Modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.Bottom
) {
    ContactRow(
        icon = Icons.Default.Phone,
        contact = "+977-9841234567"
    )
    ContactRow(icon = Icons.Default.Email, contact = "niranjannlc@keemail.com")
    ContactRow(icon = Icons.Default.LocationOn, contact = "Kathmandu, Nepal")
}
}

@Composable
fun ContactRow(icon: ImageVector, contact: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
       ) {
        Icon( icon, contentDescription = "Contact Icon")
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = contact)
    }
}

@Composable
fun ProfileSection() {
    Column(
      modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    )
    {
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = " go top hell "
        )
        Text(text = " Niranjan Lamichhane ")
        Text(text = "Senior Android Developer")
    }
}

@Preview
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}
