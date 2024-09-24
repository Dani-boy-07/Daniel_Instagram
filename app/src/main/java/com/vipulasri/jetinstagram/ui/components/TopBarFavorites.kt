package com.vipulasri.jetinstagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vipulasri.jetinstagram.R


@Composable
fun TopBarFavorites(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(all = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            ImageVector.vectorResource(R.drawable.close),
            contentDescription = null
        )
        Text(
            text,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Icon(
            ImageVector.vectorResource(R.drawable.add),
            contentDescription = null
        )
    }
}