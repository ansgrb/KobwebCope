package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.px

@Composable
fun TechStackSection() {
	Box(
		Modifier
			.fillMaxSize()
			.padding(topBottom = 80.px, leftRight = 16.px)
	) {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier
				.fillMaxSize()
				.margin(leftRight = auto as CSSLengthOrPercentageNumericValue)
		) {
			SpanText(
				text = "tech stack",
				modifier = Modifier
					.color(Theme.TEXT_PRIMARY.rgb)
					.fontSize(36.px)
					.fontWeight(FontWeight.SemiBold)
					.margin(bottom = 24.px)
					.textAlign(TextAlign.Center)
			)
			Row(
				horizontalArrangement = Arrangement.Center,
				modifier = Modifier
					.flexWrap(FlexWrap.Wrap)
					.justifyContent(JustifyContent.Center)
					.fillMaxSize()
					.gap(16.px)
			) {
				val techStack = listOf(
					"kotlin", "go", "solidity", "compose", "coroutines", "firebase",
					"strapi", "bun", "expo", "zustand", "thirdweb"
				)
				techStack.forEach { item ->
					SpanText(
						text = item,
						modifier = Modifier
							.color(Theme.TEXT_SECONDARY.rgb)
							.backgroundColor(Theme.CARD_BG.rgb)
							.padding(topBottom = 4.px, leftRight = 12.px)
							.borderRadius(r = 9999.px)
					)
				}
			}
		}
	}
}