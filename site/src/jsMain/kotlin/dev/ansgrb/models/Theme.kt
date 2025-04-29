package dev.ansgrb.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(
	val hex: String,
	val rgb: CSSColorValue,
) {
	BACKGROUND("#121212", rgb(18, 18, 18)),
	SECTION_BG("#1e1e1e", rgb(30, 30, 30)),
	CARD_BG("#292929", rgb(41, 41, 41)),
	TEXT_PRIMARY("#ffffff", rgb(255, 255, 255)),
	TEXT_SECONDARY("#a3a3a3", rgb(163, 163, 163)),
	ACCENT_TEAL("#2dd4bf", rgb(45, 212, 191)), // used as neon accent (tailwind's teal-400)
	SHADOW("#000000", rgb(0, 0, 0)) // for subtle shadow
}