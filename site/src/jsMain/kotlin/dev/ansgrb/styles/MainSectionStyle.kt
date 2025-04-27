package dev.ansgrb.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.anyLink
import com.varabyte.kobweb.silk.style.selectors.hover
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.css.s


val NavigationItemStyle = CssStyle {
	base {
		Modifier
			.color(Theme.TEXT_PRIMARY.rgb)
			.transition(Transition.all(0.2.s))
	}
	anyLink {
		Modifier
			.color(Theme.TEXT_PRIMARY.rgb)
	}
	hover {
		Modifier
			.color(Theme.TEXT_SECONDARY.rgb)
	}
}

val TitleStyle = CssStyle {
	base {
		Modifier
			.color(Theme.TEXT_PRIMARY.rgb)
	}
	anyLink {
		Modifier
			.color(Theme.TEXT_PRIMARY.rgb)
	}
	hover {
		Modifier
			.color(Theme.TEXT_PRIMARY.rgb)
			.transform { scale(1.1f, 1.1f) }
			.transition(Transition.all(0.2.s))
	}
}