package com.example.learningjetpack.imageWithText

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningjetpack.R


//composable function to display birthday image

@Composable
fun BirthdayImage() {
    val image = painterResource(R.drawable.birthday_android)
    Box  {
        Image(
            painter = image,
            contentDescription = "Birthday Image",
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth(),
            contentScale = ContentScale.FillBounds,
//            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary),
        )
        HappyBirthdayGreeting("Android", "Linux ")

    }
}

@Preview
@Composable
fun BirthdayImagePreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        BirthdayImage()
    }
}