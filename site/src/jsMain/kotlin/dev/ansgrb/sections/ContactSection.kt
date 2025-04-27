package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.px

@Composable
fun ContactSection() {
	Box(
		Modifier
			.fillMaxWidth()
			.padding(topBottom = 80.px, leftRight = 16.px)
	) {
		Column(
			modifier = Modifier
				.maxWidth(896.px)
				.margin(leftRight = auto as CSSLengthOrPercentageNumericValue)
				.fillMaxWidth()
				.textAlign(TextAlign.Center),
			horizontalAlignment = Alignment.CenterHorizontally
		) {
			SpanText(
				text = "let’s build!",
				modifier = Modifier
					.color(Theme.TEXT_PRIMARY.rgb)
					.fontSize(36.px)
					.fontWeight(FontWeight.SemiBold)
					.margin(bottom = 24.px)
			)
			SpanText(
				text = "– anas (ag)",
				modifier = Modifier
					.color(Theme.TEXT_SECONDARY.rgb)
					.margin(bottom = 16.px)
			)
			SpanText(
				text = "📫 ansgrb@gmail.com · anasghareib@gmail.com",
				modifier = Modifier.color(Theme.TEXT_SECONDARY.rgb).margin(bottom = 8.px)
			)
			SpanText(
				text = "🐦 @ansgrb · github.com/ansgrb",
				modifier = Modifier.color(Theme.TEXT_SECONDARY.rgb)
			)
		}
	}

}