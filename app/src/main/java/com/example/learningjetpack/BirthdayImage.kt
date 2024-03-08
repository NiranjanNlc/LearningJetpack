package com.example.learningjetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


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