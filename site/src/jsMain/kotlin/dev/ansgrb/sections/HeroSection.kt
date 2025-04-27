package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun HeroSection() {
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center,
		modifier = Modifier
			.fillMaxSize()
			.minHeight(100.vh)
			.textAlign(TextAlign.Center)
			.padding(leftRight = 16.px)
	) {
		SpanText(
			text = "hi, i'm anas ghareib (ag)",
			modifier = Modifier
				.color(Theme.TEXT_PRIMARY.rgb)
				.fontSize(48.px)
				.fontWeight(FontWeight.Bold)
				.margin(bottom = 16.px)
		)
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier
				.maxWidth(576.px)
				.fontSize(20.px)
		) {
			SpanText(
				text = "kotlin multiplatform dev & coroutine wizard",
				modifier = Modifier
					.color(Theme.TEXT_SECONDARY.rgb)
					.margin(bottom = 8.px)
			)
			Row {
				SpanText(
					text = "building things that ",
					modifier = Modifier
						.color(Theme.TEXT_SECONDARY.rgb)
				)
				SpanText(
					text = "shouldn't",
					modifier = Modifier
						.color(Theme.ACCENT_TEAL.rgb)
				)
				SpanText(
					text = " crash!",
					modifier = Modifier
						.color(Theme.TEXT_SECONDARY.rgb)
				)
			}
		}

	}
}