package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.outline
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.forms.InputStyle
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaGithubAlt
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedinIn
import com.varabyte.kobweb.silk.components.icons.fa.FaXTwitter
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.focus
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Form
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Label
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.TextArea

@Composable
fun ContactSection() {
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
					else -> 24.px
				}
			)
	) {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier
				.maxWidth(
					when {
						breakpoint <= Breakpoint.SM -> 100.percent
						breakpoint <= Breakpoint.MD -> 90.percent
						else -> 896.px
					}
				)
				.margin(leftRight = auto as CSSLengthOrPercentageNumericValue)
				.fillMaxWidth()
		) {
			SimpleGrid(
				numColumns = numColumns(base = 1, sm = 1, md = 2),
				modifier = Modifier
					.fillMaxWidth()
			) {
				Column(
					horizontalAlignment = when {
						breakpoint <= Breakpoint.MD -> Alignment.CenterHorizontally
						else -> Alignment.Start
					},
					modifier = Modifier
						.fillMaxWidth()
						.margin(
							bottom = when {
								breakpoint <= Breakpoint.MD -> 32.px
								else -> 0.px
							}
						)
				) {
					SpanText(
						text = "let’s build!",
						modifier = Modifier
							.color(Theme.TEXT_PRIMARY.rgb)
							.fontSize(
								when {
									breakpoint <= Breakpoint.SM -> 28.px
									else -> 36.px
								}
							)
							.fontWeight(FontWeight.SemiBold)
							.margin(bottom = 24.px)
					)
					SpanText(
						text = "– anas (ag)",
						modifier = Modifier
							.color(Theme.TEXT_SECONDARY.rgb)
							.margin(bottom = 16.px)
					)
					SocialLinksList()
				}
				Column(
					horizontalAlignment = when {
						breakpoint <= Breakpoint.MD -> Alignment.CenterHorizontally
						else -> Alignment.Start
					},
					modifier = Modifier
						.fillMaxWidth()
						.margin(
							bottom = when {
								breakpoint <= Breakpoint.MD -> 32.px
								else -> 0.px
							}
						)
				) {
					SpanText(
						text = "Contact / Request a Demo",
						modifier = Modifier
							.fontSize(
								when {
									breakpoint <= Breakpoint.SM -> 20.px
									else -> 24.px
								}
							)
							.color(Theme.TEXT_PRIMARY.rgb)
							.fontWeight(FontWeight.Bold)
							.margin(bottom = 24.px)

					)
					ContactFormComponent()
				}
			}
		}
	}
}


@Composable
private fun ContactFormComponent() {
	val breakpoint = rememberBreakpoint()

	Form(
		action = "https://formspree.io/f/xrbqeoae",
		attrs = Modifier
			.attrsModifier {
				attr("method", "POST")
				attr("novalidate", "novalidate")
				attr("enctype", "multipart/form-data")
				attr("accept-charset", "utf-8")
				attr("data-validate", "true")
				attr("data-validate-error-message", "Please fill out the form completely")
				attr("data-validate-success-message", "Thank you for your message! I'll get back to you soon.")
				attr("data-validate-required-message", "This field is required")
				attr("data-validate-email-message", "Please enter a valid email address")
			}
			.toAttrs()
	) {
		Column(
			modifier = Modifier
				.fillMaxWidth()
		) {

			val labelModifier = Modifier
				.textAlign(TextAlign.Start)
				.color(Theme.TEXT_PRIMARY.rgb)
				.fillMaxWidth()
				.fontSize(14.px)
				.fontWeight(FontWeight.SemiBold)
				.margin(bottom = 8.px)

			val inputModifier = InputStyle.toModifier()
				.fillMaxWidth()
				.padding(all = 12.px)
				.borderRadius(8.px)
				.color(Theme.TEXT_PRIMARY.rgb)
				.fontFamily("Noto Sans")
				.margin(bottom = when {
					breakpoint <= Breakpoint.SM -> 16.px
					else -> 20.px
				})
				.height(48.px)
				.backgroundColor(Theme.CARD_BG.rgb)
				.outline(0.px, LineStyle.None, Colors.Transparent)
				.transition(Transition.all(0.2.s))
				.then(InputFocusStyle.toModifier())

			Label(attrs = labelModifier.toAttrs(), forId = "inputName") {
				Text("Name")
			}
			Input(
				type = InputType.Text,
				attrs = inputModifier
					.attrsModifier {
						attr("placeholder", "Your name")
						attr("name", "name")
						attr("required", "true")
					}
					.toAttrs()
			)

			Label(attrs = labelModifier.toAttrs(), forId = "inputEmail") {
				Text("Email")
			}
			Input(
				type = InputType.Email,
				attrs = inputModifier
					.attrsModifier {
						attr("placeholder", "Your email")
						attr("name", "email")
						attr("required", "true")
					}
					.toAttrs()
			)

			Label(attrs = labelModifier.toAttrs(), forId = "inputSubject") {
				Text("Subject")
			}
			Input(
				type = InputType.Text,
				attrs = inputModifier
					.attrsModifier {
						attr("placeholder", "Subject")
						attr("name", "subject")
						attr("required", "true")
					}
					.toAttrs()
			)

			Label(attrs = labelModifier.toAttrs(), forId = "inputMessage") {
				Text("Message")
			}
			TextArea(
				attrs = inputModifier
					.height(150.px)
					.attrsModifier {
						attr("placeholder", "Your message")
						attr("name", "message")
						attr("required", "true")
					}
					.toAttrs()
			)

			Box(
				contentAlignment = Alignment.CenterStart,
				modifier = Modifier
					.fillMaxWidth()
					.margin(top = when {
						breakpoint <= Breakpoint.SM -> 16.px
						else -> 24.px
					})
			) {
				Button(
					attrs = Modifier
						.padding(
							leftRight = when {
								breakpoint <= Breakpoint.SM -> 16.px
								else -> 24.px
							}
						)
						.height(48.px)
						.fontSize(14.px)
						.fontWeight(FontWeight.SemiBold)
						.borderRadius(8.px)
						.backgroundColor(Theme.ACCENT_TEAL.rgb)
						.color(Theme.TEXT_PRIMARY.rgb)
						.transition(Transition.all(0.2.s))
						.then(MainBtnStyle.toModifier())
						.fillMaxWidth(
							when {
								breakpoint <= Breakpoint.SM -> 100.percent
								else -> 40.percent
							}
						)
						.toAttrs()
				) {
					SpanText(
						text = "Send Message",
						Modifier.color(Theme.TEXT_PRIMARY.rgb)
					)
				}
			}
		}
	}
}

@Composable
private fun SocialLinksList() {
	Column(
		modifier = Modifier.margin(top = 16.px)
	) {
		SocialLinkItem(
			icon = { FaEnvelope(it) },
			text = "ansgrb@gmail.com",
			link = "mailto:ansgrb@gmail.com"
		)
		SocialLinkItem(
			icon = { FaXTwitter(it) },
			text = "@ansgrb",
			link = "https://x.com/ansgrb"
		)
		SocialLinkItem(
			icon = { FaLinkedinIn(it) },
			text = "linkedin.com/in/ansgrb",
			link = "https://linkedin.com/in/ansgrb"
		)
		SocialLinkItem(
			icon = { FaGithubAlt(it) },
			text = "github.com/ansgrb",
			link = "https://github.com/ansgrb"
		)
	}
}

@Composable
private fun SocialLinkItem(
	icon: @Composable (Modifier) -> Unit,
	text: String,
	link: String
) {
	Row(
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.margin(bottom = 16.px)
			.padding(all = 8.px)
			.borderRadius(8.px)
	) {
		icon(
			Modifier
				.color(Theme.TEXT_PRIMARY.rgb)
				.fontSize(22.px)
		)
		Link(
			path = link,
			openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
			modifier = Modifier
				.margin(left = 12.px)
				.transition(Transition.all(0.2.s))
		) {
			SpanText(
				text = text,
				modifier = Modifier
					.color(Theme.TEXT_SECONDARY.rgb)
			)
		}
	}
}


val MainBtnStyle = CssStyle {
	base {
		Modifier
			.backgroundColor(Theme.BACKGROUND.rgb)
			.transition(Transition.all(0.2.s))
	}
	hover {
		Modifier
			.backgroundColor(Theme.ACCENT_TEAL.rgb)

	}
}

val InputFocusStyle = CssStyle {
	base {
		Modifier
			.outline(0.px, LineStyle.None, Colors.Transparent)
			.transition(Transition.all(0.2.s))
			.border(2.px, LineStyle.Solid, Colors.Transparent)
	}
	hover {
		Modifier
			.border(2.px, LineStyle.Solid, Theme.ACCENT_TEAL.rgb) // TODO:  add alpha to the color
	}
	focus {
		Modifier
			.border(2.px, LineStyle.Solid, Theme.ACCENT_TEAL.rgb)
	}

}