package com.vipulasri.jetinstagram.ui.components


import android.text.Highlights
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.vipulasri.jetinstagram.ui.components.diagonalGradientBorder

@Composable
fun Highlights(imageUrl: String) {
    val shape = CircleShape
    Box(
        modifier = Modifier
    ) {
        Box(
            modifier = Modifier
                .size(70.dp)
                .background(color = Color.White, shape = shape)
                .clip(shape)
                .border(BorderStroke(1.dp, Color.Gray), shape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = rememberImagePainter(imageUrl),
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
        }
    }
}
