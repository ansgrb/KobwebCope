//package dev.ansgrb.styles
//
//import com.varabyte.kobweb.compose.css.Transition
//import com.varabyte.kobweb.compose.ui.Modifier
//import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
//import com.varabyte.kobweb.compose.ui.modifiers.transition
//import com.varabyte.kobweb.silk.style.CssStyle
//import com.varabyte.kobweb.silk.style.selectors.hover
//import dev.ansgrb.models.Theme
//import org.jetbrains.compose.web.css.s
//
//val SubmitBtnStyle = CssStyle {
//	base {
//		Modifier
//			.transition(Transition.all(0.3.s))
//	}
//	hover {
//		Modifier.backgroundColor(Theme.ACCENT_TEAL.rgb)
//	}
//}