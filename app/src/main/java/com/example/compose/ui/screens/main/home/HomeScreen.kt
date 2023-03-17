package com.example.compose.ui.screens.main.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.R
import com.example.compose.ui.screens.main.home.elements.AlignYourBodyRow
import com.example.compose.ui.screens.main.home.elements.FavoriteCollectionsGrid
import com.example.compose.ui.screens.main.home.elements.HomeSection
import com.example.compose.ui.screens.main.home.elements.SearchBar
import com.example.compose.ui.screens.main.home.elements.alignYourBodyData
import com.example.compose.ui.screens.main.home.elements.favoriteCollectionsData
import com.example.compose.ui.theme.MySootheTheme

@Composable
fun HomeScreen(
    searchText: String,
    favoriteItemItems: List<FavoriteItem>,
    alignYourBodyItems: List<AlignYourBodyItem>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .verticalScroll(state = rememberScrollState())
            .padding(vertical = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(height = 16.dp))

        SearchBar(
            text = searchText,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow(
                items = alignYourBodyItems
            )
        }

        HomeSection(title = R.string.align_your_body) {
            FavoriteCollectionsGrid(
                items = favoriteItemItems
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeScreenPreview() {
    MySootheTheme {
        HomeScreen(
            searchText = "",
            favoriteItemItems = favoriteCollectionsData,
            alignYourBodyItems = alignYourBodyData
        )
    }
}