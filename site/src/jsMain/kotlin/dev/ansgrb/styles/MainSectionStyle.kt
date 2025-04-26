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
			.color(Theme.BLACKED_WHITE.rgb)
			.transition(Transition.all(0.2.s))
	}
	anyLink {
		Modifier
			.color(Theme.BLACKED_WHITE.rgb)
	}
	hover {
		Modifier
			.color(Theme.PRIMARY.rgb)
	}
}

val TitleStyle = CssStyle {
	base {
		Modifier
			.color(Theme.BLACK.rgb)
	}
	anyLink {
		Modifier
			.color(Theme.PRIMARY.rgb)
	}
	hover {
		Modifier
			.color(Theme.BLACK.rgb)
			.transform { scale(1.1f, 1.1f) }
			.transition(Transition.all(0.2.s))
	}
}