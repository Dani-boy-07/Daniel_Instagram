package com.vipulasri.jetinstagram.ui.profile

import android.net.Uri
import androidx.compose.material.TabRow
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vipulasri.jetinstagram.R
import com.vipulasri.jetinstagram.model.currentUser
import com.vipulasri.jetinstagram.ui.components.HighlightsContainer
import com.vipulasri.jetinstagram.ui.components.Tabs
import com.vipulasri.jetinstagram.ui.components.TopBar
import com.vipulasri.jetinstagram.ui.home.StoryImage

@Composable
fun Profile() {
    val context = LocalContext.current
    val batmanImageUri =
        Uri.parse("android.resource://${context.packageName}/${R.drawable.batman}").toString()
    Scaffold(
        modifier = Modifier
            .padding(top = 10.dp)
            .fillMaxSize(1f),
        topBar = { TopBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 10.dp)

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    StoryImage(currentUser.image)
                    Text(
                        text = currentUser.username,
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "0",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "Posts", fontSize = 13.sp,
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "100M",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "Followers", fontSize = 13.sp,
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "5",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "Following", fontSize = 13.sp,
                    )
                }
            }
            Text(
                buildAnnotatedString {
                    withStyle(style = ParagraphStyle(lineHeight = 20.sp)) {
                        append("Android Developer | 9+ years of experience | compose is easy-peezy")
                    }
                },
                fontSize = 14.sp,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            Row {
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier
                        .weight(.65f)
                        .padding(end = 5.dp)
                ) {
                    Text(
                        text = "Edit Profile",
                        color = Color.Black
                    )
                }
                OutlinedButton(onClick = {}) {
                    Icon(
                        ImageVector.vectorResource(R.drawable.person_add),
                        contentDescription = "",
                        tint = Color.Black
                    )
                }
            }
            HighlightsContainer()
            Tabs()
        }
    }
}






