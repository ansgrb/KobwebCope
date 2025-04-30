package dev.ansgrb.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(
    val hex: String,
    val rgb: CSSColorValue,
) {
	BACKGROUND("#000000", rgb(0, 0, 0)), // Pure black background
	SECTION_BG("#0a0a0a", rgb(10, 10, 10)), // Very dark background for sections
	CARD_BG("#161616", rgb(22, 22, 22)), // Slightly lighter for cards
	TEXT_PRIMARY("#ffffff", rgb(255, 255, 255)), // Pure white for primary text
	TEXT_SECONDARY("#d1d5da", rgb(209, 213, 218)), // Lighter secondary text for better contrast
	ACCENT_TEAL("#7F52FF", rgb(127, 82, 255)), // Kotlin's signature purple
	SHADOW("#000000", rgb(0, 0, 0)) // Pure black for shadows

}