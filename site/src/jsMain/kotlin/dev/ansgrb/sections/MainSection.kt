package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection() {
	val isDarkTheme = remember { mutableStateOf(true) }

	val backgroundColor = if (isDarkTheme.value) Color.black else Color.white
	val textColor = if (isDarkTheme.value) Color.white else Color.black

	Column(
		modifier = Modifier
			.fillMaxSize()
			.backgroundColor(backgroundColor),
//		contentAlignment = Alignment.Center
	) {
		Text(
			"Hello, dynamic world!"
		)
		SpanText(
			text = "This site is built using Kobweb",
			modifier = Modifier.color(textColor)
		)

		Button(onClick = { isDarkTheme.value = !isDarkTheme.value }) {
			Text("Toggle Theme")
		}
	}
}

//@Composable
//fun MainBackground() {
//	Image(
//		modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover),
//		src = "/images/background.jpg",
//		desc = "Background image"
//	)
//}