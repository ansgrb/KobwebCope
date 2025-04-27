package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextTransform
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.letterSpacing
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.textTransform
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import dev.ansgrb.models.Theme
import dev.ansgrb.styles.ProjectCard
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.px

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun ProjectsSection() {
	data class Project(
		val title: String,
		val tech: String,
		val desc: String,
		val link: String,
	)
	val projects = listOf(
		Project("ag’s digital corner", "kotlin multiplatform", "object model showcasing style & humor", "https://github.com/ansgrb/ansgrb"),
		Project("darkfi", "rust & web interface", "sovereign, anonymous web UI", "#"),
		Project("react-native-animation-lab", "typescript", "RN worklets & UI testbed", "#"),
		Project("stickerapp", "expo & RN", "sticker creator w/ custom animations", "#")
	)
	Box(
		modifier = Modifier
			.fillMaxSize()
			.padding(topBottom = 80.px, leftRight = 16.px)
			.backgroundColor(Theme.SECTION_BG.rgb)
	) {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier
				.fillMaxSize()
				.maxWidth(1200.px)
				.margin(leftRight = auto as CSSLengthOrPercentageNumericValue)
		) {
			SpanText(
				text = "featured projects",
				modifier = Modifier
					.color(Theme.TEXT_PRIMARY.rgb)
					.fontSize(36.px)
					.fontWeight(FontWeight.SemiBold)
					.margin(bottom = 48.px)
					.textAlign(TextAlign.Center)
			)
			SimpleGrid(
				numColumns = numColumns(base = 1, sm = 2, md = 2),
				modifier = Modifier
					.fillMaxWidth()
					.gap(32.px)
			) {
				projects.forEach { project ->
					Link(
						path = project.link,
						modifier = Modifier
							.then(ProjectCard.toModifier()) // Apply CssStyle using .then()
							.backgroundColor(Theme.CARD_BG.rgb)
							.padding(24.px)
							.borderRadius(16.px),
						openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
						openInternalLinksStrategy = OpenLinkStrategy.IN_PLACE
					) {
						// Column with SpanText components remains the same
						Column {
							SpanText(
								text = project.title,
								modifier = Modifier
									.color(Theme.TEXT_PRIMARY.rgb)
									.fontSize(24.px)
									.fontWeight(FontWeight.SemiBold)
									.margin(bottom = 8.px)
							)
							SpanText(
								text = project.tech,
								modifier = Modifier
									.color(Theme.TEXT_SECONDARY.rgb)
									.fontSize(12.px)
									.textTransform(TextTransform.Uppercase)
									.letterSpacing(0.5.px)
									.margin(bottom = 16.px)
							)
							SpanText(
								text = project.desc,
								modifier = Modifier.color(Theme.TEXT_PRIMARY.rgb)
							)
						}
					}
				}
			}
		}
	}
}