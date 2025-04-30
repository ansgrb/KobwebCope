package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextTransform
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
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import dev.ansgrb.models.Theme
import dev.ansgrb.styles.ProjectCard
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun ProjectsSection() {
	val breakpoint = rememberBreakpoint()

	data class Project(
		val title: String,
		val tags: List<String>,
		val desc: String,
		val link: String,
	)
	val projects = listOf(

		Project(
			"ag's digital corner",
			listOf("Kotlin", "Multiplatform", "Web", "Android", "iOS"),
			"object model showcasing style & humor",
			"https://github.com/ansgrb/ansgrb"
		),
		Project(
			"darkfi",
			listOf("Rust", "Web", "Desktop", "Mobile", "Android", "iOS"),
			"sovereign, anonymous web UI",
			"https://github.com/ansgrb/darkfi"
		),
		Project(
			"react-native-animation-lab",
			listOf("Kotlin", "JS", "React", "Native", "Android", "iOS"),
			"RN worklets & UI testbed",
			"https://github.com/ansgrb/react-native-animation-lab"
		),
		Project(
			"stickerapp",
			listOf("Kotlin", "JS", "Compose", "Android", "iOS"),
			"sticker creator w/ custom animations",
			"https://github.com/ansgrb/stickerapp"
		),
		Project(
			"kobweb-site",
			listOf("Kotlin", "JS", "Compose", "Web"),
			"this site",
			"https://github.com/ansgrb/kobweb-site"
		)


//		Project("ag’s digital corner", "kotlin multiplatform", "object model showcasing style & humor", "https://github.com/ansgrb/ansgrb"),
//		Project("darkfi", "rust & web interface", "sovereign, anonymous web UI", "#"),
//		Project("react-native-animation-lab", "typescript", "RN worklets & UI testbed", "#"),
//		Project("stickerapp", "expo & RN", "sticker creator w/ custom animations", "#")
	)
	Box(
		modifier = Modifier
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
			.backgroundColor(Theme.SECTION_BG.rgb)
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
				text = "featured projects",
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
			SimpleGrid(
				numColumns = numColumns(base = 1, sm = 2, md = 2, lg = 3),
				modifier = Modifier
					.fillMaxWidth()
					.gap(32.px)
			) {
				projects.forEach { project ->

					ProjectCard(
						title = project.title,
						description = project.desc,
						tags = project.tags,
						link = project.link
					)


//					Link(
//						path = project.link,
//						modifier = Modifier
//							.then(ProjectCard.toModifier()) // Apply CssStyle using .then()
//							.backgroundColor(Theme.CARD_BG.rgb)
//							.padding(24.px)
//							.borderRadius(16.px),
//						openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
//						openInternalLinksStrategy = OpenLinkStrategy.IN_PLACE
//					) {
//						// Column with SpanText components remains the same
//						Column {
//							SpanText(
//								text = project.title,
//								modifier = Modifier
//									.color(Theme.TEXT_PRIMARY.rgb)
//									.fontSize(24.px)
//									.fontWeight(FontWeight.SemiBold)
//									.margin(bottom = 8.px)
//							)
//							SpanText(
//								text = project.tech,
//								modifier = Modifier
//									.color(Theme.TEXT_SECONDARY.rgb)
//									.fontSize(12.px)
//									.textTransform(TextTransform.Uppercase)
//									.letterSpacing(0.5.px)
//									.margin(bottom = 16.px)
//							)
//							SpanText(
//								text = project.desc,
//								modifier = Modifier.color(Theme.TEXT_PRIMARY.rgb)
//							)
//						}
//					}
				}
			}
		}
	}
}

@Composable
private fun ProjectCard(
	title: String,
	description: String,
	tags: List<String>,
	link: String
) {
	val breakpoint = rememberBreakpoint()

	Box(
		modifier = Modifier
			.margin(all = 16.px)
			.padding(all = 24.px)
			.backgroundColor(Theme.CARD_BG.rgb)
			.borderRadius(16.px)
	) {
		Column {
			SpanText(
				text = title,
				modifier = Modifier
					.fontSize(24.px)
					.fontWeight(FontWeight.Bold)
					.color(Theme.TEXT_PRIMARY.rgb)
					.margin(bottom = 16.px)
			)

			SpanText(
				text = description,
				modifier = Modifier
					.fontSize(16.px)
					.color(Theme.TEXT_SECONDARY.rgb)
					.margin(bottom = 16.px)
			)

			Row(
				modifier = Modifier
					.fillMaxWidth()
					.margin(bottom = 16.px)
					.flexWrap(FlexWrap.Wrap)
			) {
				tags.forEach { tag ->
					Box(
						modifier = Modifier
							.margin(right = 8.px, bottom = 8.px)
							.padding(leftRight = 12.px, topBottom = 6.px)
							.backgroundColor(Theme.ACCENT_TEAL.rgb)
							.borderRadius(16.px)
					) {
						SpanText(
							text = tag,
							modifier = Modifier
								.fontSize(14.px)
								.color(Theme.CARD_BG.rgb)
						)
					}
				}
			}
			Link(
				path = link,
				openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
				modifier = Modifier
					.fontSize(16.px)
					.color(Theme.ACCENT_TEAL.rgb)
			) {
				SpanText("View Project →")
			}
		}
	}
}