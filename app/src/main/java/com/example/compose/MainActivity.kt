package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.screens.main.SootheBottomNavigation
import com.example.compose.ui.screens.main.home.AlignYourBodyItem
import com.example.compose.ui.screens.main.home.FavoriteItem
import com.example.compose.ui.screens.main.home.HomeScreen
import com.example.compose.ui.screens.main.home.elements.alignYourBodyData
import com.example.compose.ui.screens.main.home.elements.favoriteCollectionsData
import com.example.compose.ui.theme.MySootheTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySootheApp(
                searchText = "",
                favoriteItemItems = favoriteCollectionsData,
                alignYourBodyItems = alignYourBodyData,
            )
        }
    }
}

@Composable
fun MySootheApp(
    searchText: String,
    favoriteItemItems: List<FavoriteItem>,
    alignYourBodyItems: List<AlignYourBodyItem>
) {
    MySootheTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ) { padding ->
            HomeScreen(
                searchText = searchText,
                favoriteItemItems = favoriteItemItems,
                alignYourBodyItems = alignYourBodyItems,
                modifier = Modifier.padding(padding)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MySootheAppPreview() {
    MySootheTheme {
        MySootheApp(
            searchText = "",
            favoriteItemItems = favoriteCollectionsData,
            alignYourBodyItems = alignYourBodyData
        )
    }
}