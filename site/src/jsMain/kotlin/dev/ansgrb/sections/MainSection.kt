package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import dev.ansgrb.components.Header
import dev.ansgrb.models.Theme
import dev.ansgrb.util.Constants.SECTION_WIDTH
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection() {
	Box(
		contentAlignment = Alignment.TopCenter,
		modifier = Modifier
			.maxWidth(SECTION_WIDTH.px)
			.fillMaxSize()
			.backgroundColor(Theme.BACKGROUND.rgb),
		) {
		MainSectionContent()
	}
}

@Composable
private fun MainSectionContent() {
	val breakpoint = rememberBreakpoint()
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = if (breakpoint > Breakpoint.MD) Arrangement.Top else Arrangement.Center,
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

@Composable
private fun MainText() {
	Row(
		horizontalArrangement = Arrangement.Center,
		verticalAlignment = Alignment.CenterVertically,
	) {
		Column {
		}
	}
}