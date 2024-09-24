package com.vipulasri.jetinstagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.vipulasri.jetinstagram.R

@Composable
fun TopBar(){
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = 10.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Daniel")
        Row {
            IconButton(onClick = {}) {
                Icon(ImageVector.vectorResource(R.drawable.add_box), contentDescription = "")
            }
            IconButton(onClick = {}) {
                Icon(ImageVector.vectorResource(R.drawable.menu), contentDescription = "")
            }
        }
    }
}
