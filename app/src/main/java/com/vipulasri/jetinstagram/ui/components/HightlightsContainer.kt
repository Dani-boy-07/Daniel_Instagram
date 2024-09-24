package com.vipulasri.jetinstagram.ui.components

import android.net.Uri
import android.text.Highlights
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vipulasri.jetinstagram.R
import com.vipulasri.jetinstagram.model.highlights

val m = listOf(
    highlights(icon = R.drawable.add, "Highlight"),
    highlights(icon = R.drawable.restaurant, "Restaurants"),
    highlights(icon = R.drawable.memory, "Memories"),
    highlights(icon = R.drawable.android, "Android stuff"),
    highlights(icon = R.drawable.tv, "TV"),
    highlights(icon = R.drawable.fitness, "Gym")
)


@Composable
fun HighlightsContainer(highlights: List<highlights> = m){
    LazyRow(
        modifier = Modifier.padding(vertical = 10.dp)
    ) {
        items(highlights.size) {
            val context = LocalContext.current
            val currentUri =
                Uri.parse("android.resource://${context.packageName}/${highlights[it].icon}").toString()
            Column(
                modifier = Modifier.padding(end = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Highlights(currentUri)
                Text(
                    text = highlights[it].text,
                    fontSize = 13.sp
                )
            }
        }
    }
}