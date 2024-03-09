package com.example.learningjetpack.taskDone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpack.ui.theme.LearningJetpackTheme
import com.example.learningjetpack.R


@Composable
fun TaskDone()
{
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.task_completed)
        val title = stringResource(R.string.task_title)
        val comment = stringResource(R.string.task_comment)
        Image(
            painter = image,
            contentDescription = "Task Done",
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
        )
        Text(text = title
            , style = MaterialTheme.typography.bodyLarge
            , fontFamily = FontFamily.Serif
            , fontWeight = FontWeight.Bold
            , textAlign = TextAlign.Center
            , modifier = Modifier
                .padding(0.dp,8.dp,0.dp,8.dp)
            )
        Text(text = comment
            , style = MaterialTheme.typography.bodySmall
            , fontFamily = FontFamily.Default
            , fontStyle = FontStyle.Italic
            , textAlign = TextAlign.Center
            , fontSize = 16.sp)
    }
}