package dev.ansgrb.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(
	val hex: String,
	val rgb: CSSColorValue,
) {
	PRIMARY("#0070f3", rgb(0, 112, 243)),
	SECONDARY("#0099cc", rgb(0, 153, 204)),
	TERTIARY("#666666", rgb(102, 102, 102)),
	GRAY("#888888", rgb(136, 136, 136)),
	WHITE("#ffffff", rgb(255, 255, 255)),
	BLACKED_BLUE("#2b2b2b", rgb(43, 43, 43)),
	BLACKED_WHITE("#f5f5f5", rgb(245, 245, 245)),
	BLACKED_GRAY("#666666", rgb(102, 102, 102)),
	BLACKED_BLACK("#333333", rgb(51, 51, 51)),
	BLACKED_LIGHT("#f0f0f0", rgb(240, 240, 240)),
	BLACKED_DARK("#111111", rgb(17, 17, 17)),
	BLACKED_PRIMARY("#004999", rgb(0, 73, 153)),
	BLACKED_SECONDARY("#0066aa", rgb(0, 102, 170)),
	BLACKED_TERTIARY("#666666", rgb(102, 102, 102)),
	BLACK("#000000", rgb(0, 0, 0)),
	LIGHT("#f4f4f4", rgb(244, 244, 244)),
	DARK("#111111", rgb(17, 17, 17)),


	BACKGROUND("#121212", rgb(18, 18, 18)),
	SECTION_BG("#1e1e1e", rgb(30, 30, 30)),
	CARD_BG("#292929", rgb(41, 41, 41)),
	TEXT_PRIMARY("#ffffff", rgb(255, 255, 255)),
	TEXT_SECONDARY("#a3a3a3", rgb(163, 163, 163)),
	ACCENT_TEAL("#2dd4bf", rgb(45, 212, 191)), // used as neon accent (tailwind's teal-400)
	SHADOW("#000000", rgb(0, 0, 0)) // for subtle shadow

}