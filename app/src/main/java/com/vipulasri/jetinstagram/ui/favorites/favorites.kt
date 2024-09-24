package com.vipulasri.jetinstagram.ui.favorites

import android.view.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.material.search.SearchBar
import com.vipulasri.jetinstagram.ui.components.SearchBar
import com.vipulasri.jetinstagram.ui.components.TopBarFavorites

@Composable
fun Favorites() {
    var searchQuery by rememberSaveable { mutableStateOf("") }
    Scaffold(
        topBar = { TopBarFavorites("Favorites") }, modifier = Modifier.padding(top = 10.dp)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(1f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(100.dp)
                    .padding(horizontal = 10.dp)
                    .background(Color(248, 248, 248)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    buildAnnotatedString {
                        append("New Posts from your favorites will appear higher in feed. Only you can see who you add or remove.")
                        withStyle(style = SpanStyle(Color.Blue)) {
                            append(" How it works")
                        }
                    }, textAlign = TextAlign.Center, fontSize = 15.sp
                )
            }
            Column {
                SearchBar(
                    modifier = Modifier.fillMaxWidth(),
                    query = searchQuery,
                    onQueryChange = { /* Handle query change */ },
                    placeholder = { Text("Search") },
                    onActiveChanged = { /* Handle active change */ }
                )

            }

        }
    }
}