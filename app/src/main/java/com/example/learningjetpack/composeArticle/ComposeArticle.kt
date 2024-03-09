package com.example.learningjetpack.composeArticle

import android.app.Application
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.getString
import androidx.core.content.res.TypedArrayUtils.getText
import com.example.learningjetpack.R


@Composable
fun ComposeArticle(context : Application)
{
    var image = painterResource(id = R.drawable.header)
    // read string from resopurces
    var title = getString(context,R.string.jetpack_header)
    var intro = getString(context,R.string.jetpack_intro)
    var desc = getString(context,R.string.jetpack_description)
    //column of image , title , intro and desc
    Column {
        Image(painter = image, contentDescription = "Jetpack")
        Text(text = title,
        fontSize = 24.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(16.dp),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
            )
        Text(text = intro,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(8.dp),
            fontStyle = FontStyle.Normal,
            letterSpacing = 1.sp)
        Text(text = desc,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(8.dp),
            fontStyle = FontStyle.Normal,
            letterSpacing = 1.sp
        )
    }
}

@Preview
@Composable
fun ComposeArticlePreview()
{
    ComposeArticle(context = Application())
}