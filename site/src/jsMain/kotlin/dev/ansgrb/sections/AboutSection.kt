package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontStyle
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun AboutSection() {
	val breakpoint = rememberBreakpoint()

	Box(
		Modifier
			.fillMaxWidth()
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
			.backgroundColor(Theme.SECTION_BG.rgb)
	) {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier
				.fillMaxWidth()
				.maxWidth(
					when {
						breakpoint <= Breakpoint.SM -> 100.percent
						breakpoint <= Breakpoint.MD -> 90.percent
						else -> 896.px
					}
				)
				.margin(leftRight = auto as CSSLengthOrPercentageNumericValue)
				.padding(all = 24.px)
		) {
			SpanText(
				text = "about me",
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
					.textAlign(TextAlign.Center)
			)
			Column(
				horizontalAlignment = Alignment.Start,
				modifier = Modifier
					.align(Alignment.Start)
					.gap(8.px)
			) {
				val listItems = listOf(
					"kotlin multiplatform (mobile, desktop, backend)",
					"blockchain tinkering (solidity + web3)",
					"chaos engineering & robust pipelines",
					"golang services & micro-backend"
				)
				listItems.forEach { item ->
					Row(verticalAlignment = Alignment.CenterVertically) {
						SpanText(
							"• ",
							Modifier
								.color(Theme.TEXT_SECONDARY.rgb)
								.fontSize(18.px)
								.margin(right = 8.px)
						)
						SpanText(
							item,
							Modifier
								.color(Theme.TEXT_SECONDARY.rgb)
								.fontSize(18.px)
						)
					}
				}
			}
			SpanText(
				text = "\"compiling kmp apps | battling blockchain demons\"",
				modifier = Modifier
					.color(Theme.TEXT_SECONDARY.rgb)
					.margin(top = 24.px)
					.fontStyle(FontStyle.Italic)
					.textAlign(TextAlign.Center)
					.fillMaxWidth()
			)
		}
	}
}