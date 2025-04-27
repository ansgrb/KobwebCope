package dev.ansgrb.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.rgba
import com.varabyte.kobweb.silk.style.selectors.anyLink
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val ProjectCard = CssStyle {
	val alpha = 0.8f

	base {
		Modifier
			.boxShadow(
				blurRadius = 8.px,
				spreadRadius = 1.px,
				color = rgba(0, 0, 0, 0.2f)
			)
			.transition(Transition.all(0.2.s))
	}
	anyLink {
		Modifier
			.color(rgba(255, 255, 255, alpha))
			.transition(Transition.all(0.2.s))
	}
	hover {
		Modifier
			.boxShadow(
				blurRadius = 12.px,
				spreadRadius = 2.px,
				color = rgba(0, 0, 0, 0.3f)
			)
			.transform { scale(1.02f) }
	}
}