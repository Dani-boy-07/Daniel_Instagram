package com.vipulasri.jetinstagram.ui.components

import android.graphics.drawable.shapes.Shape
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.google.android.material.tabs.TabLayout
import com.vipulasri.jetinstagram.R


@Composable
fun Tabs() {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabData = listOf(
        TabData(
            title = "Home",
            icon = ImageVector.vectorResource(id = R.drawable.grid)
        ),
        TabData(
            title = "Profile",
            icon = ImageVector.vectorResource(id = R.drawable.video)
        ),
        TabData(
            title = "Profile",
            icon = ImageVector.vectorResource(id = R.drawable.profile)
        )
    )
    Column {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = Color.White
        ) {
            tabData.forEachIndexed { index, tabData ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    icon = {
                        Icon(
                            imageVector = tabData.icon, contentDescription = tabData.title
                        )
                    },
                )
            }
        }
        when (selectedTabIndex) {
            0 -> PicGrid()
            1 -> ShareGrid("Share a moment with the world")
            2 -> ShareGrid("No Items yet")
        }
    }
}

@Composable
fun PicGrid() {
    val context = LocalContext.current
    val currentUri =
        Uri.parse("android.resource://${context.packageName}/${R.drawable.ic_outlined_camera}").toString()
    Column(
        modifier = Modifier
            .fillMaxSize(1f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = rememberImagePainter(currentUri),
                contentDescription = null,
                modifier = Modifier

            )
            Text(
                "No posts yet",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp

            )
        }

    }
}

@Composable
fun ShareGrid(text: String) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .padding(vertical = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp
        )
    }
}