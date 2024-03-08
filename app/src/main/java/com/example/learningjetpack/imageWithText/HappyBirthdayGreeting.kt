package com.example.learningjetpack.imageWithText

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpack.ui.theme.LearningJetpackTheme


@Composable
fun HappyBirthdayGreeting(birthdayBoy : String, wisher : String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Happy Birthday my dear  $birthdayBoy",
            modifier= Modifier
                .padding(24.dp),
            fontStyle = FontStyle.Normal,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight(900),
            lineHeight = 64.sp,
            fontSize = 40.sp,
            letterSpacing = 1.sp,
            textAlign = TextAlign.Center
        )
        Text(text = "From $wisher",
            modifier= Modifier
                .padding(24.dp)
                .align(Alignment.End),
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight(900),
            fontSize = 40.sp,
            textAlign = TextAlign.End
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearningJetpackTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.primary
        ) {
            HappyBirthdayGreeting("Android", "Linux ")
        }
    }
}