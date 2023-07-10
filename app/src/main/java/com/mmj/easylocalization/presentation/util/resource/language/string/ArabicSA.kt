package com.mmj.easylocalization.presentation.util.resource.language.string

fun arabicSA(key: String): String {
    val translations: Map<String, String> = mapOf(
        "hello_mohammad" to "مرحبا محمد",
        "arabic" to "عربي",
        "english" to "انكليزي",
    )

    return translations[key] ?: key
}