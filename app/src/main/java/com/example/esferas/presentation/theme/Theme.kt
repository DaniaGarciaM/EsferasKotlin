package com.example.esferas.presentation.theme

import androidx.compose.runtime.Composable
import androidx.wear.compose.material.MaterialTheme

@Composable
fun EsferasTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = EsferasAppColorPalette,
        typography = EsferasAppTypography,
        content = content
    )
}