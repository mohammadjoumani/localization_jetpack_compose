package com.mmj.easylocalization.presentation.util.resource.language.string

fun englishUS(key: String): String {
    val translations: Map<String, String> = mapOf(
        "hello_mohammad" to "Hello Mohammad",
        "arabic" to "Arabic",
        "english" to "English",
    )

    return translations[key] ?: key
}