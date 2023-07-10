package com.mmj.easylocalization.presentation.util.resource.language

import com.mmj.easylocalization.presentation.util.resource.language.string.arabicSA
import com.mmj.easylocalization.presentation.util.resource.language.string.englishUS
import io.paperdb.Paper
import java.util.Locale

const val APP_LANG = "AppLang"

const val ENGLISH_LOCALE_LANG = "en"
const val ARABIC_LOCALE_LANG = "ar"
const val DEFAULT_SYSTEM_LOCALE_LANG = "def"

fun String.translate(): String {
    return when (getLocal()) {
        ENGLISH_LOCALE_LANG -> {
            englishUS(this)
        }

        ARABIC_LOCALE_LANG -> {
            arabicSA(this)
        }

        else -> {
            englishUS(this)
        }
    }
}

fun setLocale(local: String) {
    Paper.book().write(APP_LANG, local)
}

fun getLocal(): String {
    return when (Paper.book().read(APP_LANG, DEFAULT_SYSTEM_LOCALE_LANG)!!) {
        DEFAULT_SYSTEM_LOCALE_LANG -> {
            Locale.getDefault().language
        }

        ARABIC_LOCALE_LANG -> {
            ARABIC_LOCALE_LANG
        }

        ENGLISH_LOCALE_LANG -> {
            ENGLISH_LOCALE_LANG
        }

        else -> {
            ENGLISH_LOCALE_LANG
        }
    }
}