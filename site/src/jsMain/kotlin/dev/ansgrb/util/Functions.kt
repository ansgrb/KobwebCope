package dev.ansgrb.util

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.text.SpanText
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.css.px


@Composable
fun FontShow(fontName: List<String>) {
	fontName.forEach {
		Row(
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier
				.margin(bottom = 8.px, top = 8.px)
				.fontWeight(FontWeight.Bold)
		) {
			SpanText(
				text = "hey hey, this is Anas Ghareib, (ag) with $it",
				modifier = Modifier
					.color(Theme.TEXT_PRIMARY.rgb)
					.fontSize(48.px)
					.fontFamily(it)
			)
		}
	}
}