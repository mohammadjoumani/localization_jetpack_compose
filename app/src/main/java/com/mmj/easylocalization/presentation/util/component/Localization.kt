package com.mmj.easylocalization.presentation.util.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.mmj.easylocalization.presentation.util.resource.language.ARABIC_LOCALE_LANG

@Composable
fun Localization(local: String, content: @Composable () -> Unit) {
    val direction = if (local == ARABIC_LOCALE_LANG)
        LayoutDirection.Rtl
    else
        LayoutDirection.Ltr
    CompositionLocalProvider(LocalLayoutDirection provides direction) {
        content()
    }
}