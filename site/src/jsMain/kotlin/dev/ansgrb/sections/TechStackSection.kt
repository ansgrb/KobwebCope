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
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyleVariant
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun TechStackSection() {
	val breakpoint = rememberBreakpoint()

	Box(
		Modifier
			.fillMaxSize()
			.padding(
				topBottom = when {
					breakpoint <= Breakpoint.SM -> 40.px
					else -> 80.px
				},
				leftRight = when {
					breakpoint <= Breakpoint.SM -> 16.px
					breakpoint <= Breakpoint.MD -> 32.px
					else -> 64.px
				}
			)
	) {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier
				.fillMaxSize()
				.maxWidth(
					when {
						breakpoint <= Breakpoint.SM -> 100.percent
						breakpoint <= Breakpoint.MD -> 90.percent
						else -> 896.px
					}
				)
				.margin(leftRight = auto as CSSLengthOrPercentageNumericValue)
		) {
			SpanText(
				text = "tech stack",
				modifier = Modifier
					.color(Theme.TEXT_PRIMARY.rgb)
					.fontSize(
						when {
							breakpoint <= Breakpoint.SM -> 28.px
							else -> 36.px
						}
					)
					.fontWeight(FontWeight.Bold)
					.margin(bottom = 24.px)
			)
//			SimpleGrid(
//				numColumns = numColumns(base = 2, sm = 3, md = 4, lg = 5),
//				modifier = Modifier
//					.fillMaxWidth()
//					.justifyContent(JustifyContent.Center)
//					.align(Alignment.CenterHorizontally)
//					.flexWrap(FlexWrap.Wrap)
//					.margin(top = 32.px)
//			) {
//				val techStack = listOf(
//					"kotlin", "go", "solidity", "compose", "coroutines", "firebase",
//					"strapi", "bun", "expo", "zustand", "thirdweb"
//				)
//				techStack.forEach { item ->
//					SpanText(
//						item,
//						Modifier
//							.color(Theme.TEXT_SECONDARY.rgb)
//							.borderRadius(12.px)
//							.backgroundColor(Theme.CARD_BG.rgb)
//							.padding(leftRight = 16.px, topBottom = 8.px)
//							.fontSize(18.px)
//							.margin(all = 8.px)
//							.textAlign(TextAlign.Center)
//					)
//				}
//			}

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

