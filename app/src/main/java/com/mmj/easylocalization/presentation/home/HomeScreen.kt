package com.mmj.easylocalization.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mmj.easylocalization.presentation.main.MainEvent
import com.mmj.easylocalization.presentation.main.MainViewModel
import com.mmj.easylocalization.presentation.util.resource.language.ARABIC_LOCALE_LANG
import com.mmj.easylocalization.presentation.util.resource.language.AppStrings
import com.mmj.easylocalization.presentation.util.resource.language.ENGLISH_LOCALE_LANG
import com.mmj.easylocalization.presentation.util.resource.language.setLocale
import com.mmj.easylocalization.presentation.util.resource.language.translate

@Composable
fun HomeScreen(mainViewModel: MainViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = AppStrings.strHelloMohammad.translate())

        Row(modifier = Modifier.fillMaxWidth()) {

            Button(onClick = {
                mainViewModel.onEvent(MainEvent.LanguageChange(ENGLISH_LOCALE_LANG))
                setLocale(ENGLISH_LOCALE_LANG)
            }) {
                Text(text = AppStrings.strEnglish.translate())
            }

            Spacer(modifier = Modifier.padding(16.dp))

            Button(onClick = {
                mainViewModel.onEvent(MainEvent.LanguageChange(ARABIC_LOCALE_LANG))
                setLocale(ARABIC_LOCALE_LANG)
            }) {
                Text(text = AppStrings.strArabic.translate())
            }
        }

    }
}