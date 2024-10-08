package com.vipulasri.jetinstagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vipulasri.jetinstagram.model.Story

@Composable
fun FavoritesContainer(stories: List<Story>) {
    LazyColumn(
        modifier = Modifier.padding(horizontal = 10.dp)
    ) {
        items(stories.size) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(vertical = 10.dp)
                ,
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Highlights(stories[it].image)
                    Spacer(modifier = Modifier.padding(end = 5.dp))
                    Text(stories[it].name)
                }
                Button(
                    onClick = {},
                ) {
                    Text("Add")
                }
            }
        }
    }
}