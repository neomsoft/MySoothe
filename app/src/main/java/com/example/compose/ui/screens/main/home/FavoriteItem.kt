package com.example.compose.ui.screens.main.home

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class FavoriteItem(
    @StringRes val text: Int,
    @DrawableRes val drawable: Int,
)
