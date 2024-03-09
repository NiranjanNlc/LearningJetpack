package com.example.learningjetpack.composeQuadarnt

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningjetpack.R

@Composable
fun ComposeQuadarnt()
{
    Column(modifier = Modifier.fillMaxSize())
    {
        val textComposableTitle = stringResource(R.string.text_composable_title)
        val textComposableDescription = stringResource(R.string.text_composable_description)

        val imageComposableTitle = stringResource(R.string.image_composable_title)
        val imageComposableDescription = stringResource(R.string.image_composable_description)

        val rowComposableTitle = stringResource(R.string.row_composable_title)
        val rowComposableDescription = stringResource(R.string.row_composable_description)
        val columnComposableTitle = stringResource(R.string.column_composable_title)
        val columnComposableDescription = stringResource(R.string.column_composable_description)

        Row (
            modifier = Modifier.weight(0.5f)

        ){
           Column(
               modifier = Modifier.weight(0.5f)
                   .padding(16.dp),
              ) {
               DisplayColumn(textComposableTitle,textComposableDescription,Color(0xFFEADDFF))
           }
            Column(
                modifier = Modifier.weight(0.5f)
                    .padding(16.dp)
            ) {
                DisplayColumn(imageComposableTitle, imageComposableDescription,Color(0xFFD0BCFF))
            }
        }

        Row (
            modifier = Modifier.weight(0.5f)
        ){
            Column(
                modifier = Modifier.weight(0.5f)
                    .padding(16.dp)
            ) {
                DisplayColumn(rowComposableTitle,rowComposableDescription,   Color(0xFFB69DF8))
            }
            Column(
                modifier = Modifier.weight(0.5f)
                    .padding(16.dp),

            ) {
                DisplayColumn(columnComposableTitle,columnComposableDescription, Color(0xFFF6EDFF))
            }
        }
    }
}

@Composable
fun DisplayColumn(title : String, description : String, color : Color ) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
            .background(color =color)

            ){
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp))
        Text(text = description)
    }
}

@Preview
@Composable
fun ComposeQuadarntPreview() {
    ComposeQuadarnt()
}