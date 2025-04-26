package dev.ansgrb.styles

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import dev.ansgrb.models.Theme


val NavigationItemStyle = CssStyle {
	base {
		Modifier.color(Theme.BLACKED_WHITE.rgb)
	}
	hover {
		Modifier.color(Theme.PRIMARY.rgb)
	}
}