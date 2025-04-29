package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.dom.svg.Text
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.alignContent
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.flex
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontStyle
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.forms.InputStyle
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaGithubAlt
import com.varabyte.kobweb.silk.components.icons.fa.FaGitkraken
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedinIn
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareXTwitter
import com.varabyte.kobweb.silk.components.icons.fa.FaTornado
import com.varabyte.kobweb.silk.components.icons.fa.FaXTwitter
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import dev.ansgrb.models.Theme
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.disabled
import org.jetbrains.compose.web.attributes.onSubmit
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.ms
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
			SimpleGrid(
				numColumns = numColumns(base = 1, sm = 2, md = 2),
				modifier = Modifier.fillMaxWidth()
			) {
				Column {
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
					Row(
						modifier = Modifier.margin(all = 4.px)
					) {
						FaEnvelope(modifier = Modifier.color(Theme.TEXT_PRIMARY.rgb).fontSize(22.px))
						Link(
							path = "ansgrb@gmail.com",
							openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
							modifier = Modifier.margin(left = 12.px)
						) {
							SpanText("ansgrb@gmail.com", Modifier.color(Theme.TEXT_SECONDARY.rgb).margin(bottom = 8.px))
						}
					}
					Row(
						modifier = Modifier.margin(all = 4.px)
					) {
						FaXTwitter(modifier = Modifier.color(Theme.TEXT_PRIMARY.rgb).fontSize(22.px))
						Link(
							path = "https://x.com/ansgrb",
							openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
							modifier = Modifier.margin(left = 12.px)
						) {
							SpanText("@ansgrb", Modifier.color(Theme.TEXT_SECONDARY.rgb).margin(bottom = 8.px))
						}
					}
					Row(
						modifier = Modifier.margin(all = 4.px)
					) {
						FaLinkedinIn(modifier = Modifier.color(Theme.TEXT_PRIMARY.rgb).fontSize(22.px))
						Link(
							path = "https://linkedin.com/in/ansgrb",
							openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
							modifier = Modifier.margin(left = 12.px)
						) {
							SpanText("linkedin.com/in/ansgrb", Modifier.color(Theme.TEXT_SECONDARY.rgb).margin(bottom = 8.px))
						}
					}
					Row(
						modifier = Modifier.margin(all = 4.px)
					) {
						FaGithubAlt(modifier = Modifier.color(Theme.TEXT_PRIMARY.rgb).fontSize(22.px))
						Link(
							path = "https://github.com/ansgrb",
							openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
							modifier = Modifier.margin(left = 12.px)
						) {
							SpanText("github.com/ansgrb", Modifier.color(Theme.TEXT_SECONDARY.rgb).margin(bottom = 8.px))
						}
					}
				}
				Column(
					Modifier
						.backgroundColor(Theme.CARD_BG.rgb)
						.borderRadius(16.px)
						.padding(24.px)
//						.fillMaxWidth()
//						.flexWrap(FlexWrap.Wrap)
				) {
					Column {
						SpanText(
							text = "Contact / Request a Demo",
							modifier = Modifier
								.fontSize(24.px)
								.color(Theme.TEXT_PRIMARY.rgb)
								.fontWeight(700)
								.margin(bottom = 35.px)

						)
						ContactFormComponent()
//						SpanText(
//							text = "Name",
//							modifier = Modifier
//								.color(Theme.TEXT_PRIMARY.rgb)
//								.fontSize(16.px)
//								.fontWeight(FontWeight.SemiBold)
//								.margin(bottom = 4.px)
//						)
//						Input(
//							type = InputType.Text,
//							attrs = {
//								id("name")
//								onInput { console.log(it.value) }
//								placeholder("Your name")
//								value("")
////								disabled()
//								style {
//									Modifier
//										.size(width = 100.percent, height = 48.px)
//										.backgroundColor(Theme.CARD_BG.rgb)
//										.borderRadius(16.px)
//										.padding(leftRight = 16.px)
//										.margin(bottom = 16.px)
//								}
//							}
//						)
					}

				}
			}
		}
	}

}


@Composable
private fun ContactFormComponent() {
	val breakpoint = rememberBreakpoint()
	Form(
		action = null,
		attrs = Modifier.attrsModifier { attr("method", "POST") }.toAttrs()
	) {
		Column {
			Label(
				attrs = Modifier
					.classNames("form-label")
					.textAlign(TextAlign.Start)
					.color(Theme.TEXT_PRIMARY.rgb)
					.fillMaxWidth()
					.textAlign(TextAlign.Start)
					.fontSize(14.px)
					.fontWeight(FontWeight.SemiBold)
					.fontStyle(FontStyle.Normal)
					.margin(bottom = 8.px)
					.toAttrs(),
				forId = "inputName"
			) {
				Text("Name")
			}
			Input(
				type = InputType.Text,
				attrs = InputStyle.toModifier()
					.id("inputName")
					.classNames("form-control")
					.padding(all = 12.px)
					.margin(bottom = 10.px)
					.width(
						if (breakpoint >= Breakpoint.MD) 500.px
						else 250.px
					)
					.height(48.px)
					.backgroundColor(Theme.BACKGROUND.rgb)
					.boxShadow(0.px, 0.px, 0.px, 0.px, null)
					.attrsModifier {
						attr("placeholder", "Your name")
						attr("name", "name")
						attr("required", "true")
					}
					.toAttrs()
			)
			Label(
				attrs = Modifier
					.classNames("form-label")
					.textAlign(TextAlign.Start)
					.color(Theme.TEXT_PRIMARY.rgb)
					.fillMaxWidth()
					.textAlign(TextAlign.Start)
					.fontSize(14.px)
					.fontWeight(FontWeight.SemiBold)
					.fontStyle(FontStyle.Normal)
					.margin(bottom = 8.px)
					.toAttrs(),
				forId = "inputEmail"
			) {
				Text("Email")
			}
			Input(
				type = InputType.Text,
				attrs = InputStyle.toModifier()
					.id("inputEmail")
					.classNames("form-control")
					.padding(all = 12.px)
					.margin(bottom = 10.px)
					.width(
						if (breakpoint >= Breakpoint.MD) 500.px
						else 250.px
					)
					.height(48.px)
					.backgroundColor(Theme.BACKGROUND.rgb)
					.boxShadow(0.px, 0.px, 0.px, 0.px, null)
					.attrsModifier {
						attr("placeholder", "Your email")
						attr("name", "email")
						attr("required", "true")
					}
					.toAttrs()
			)
			Label(
				attrs = Modifier
					.classNames("form-label")
					.textAlign(TextAlign.Start)
					.color(Theme.TEXT_PRIMARY.rgb)
					.fillMaxWidth()
					.textAlign(TextAlign.Start)
					.fontSize(14.px)
					.fontWeight(FontWeight.SemiBold)
					.fontStyle(FontStyle.Normal)
					.margin(bottom = 8.px)
					.toAttrs(),
				forId = "inputSubject"
			) {
				Text("Subject")
			}
			Input(
				type = InputType.Text,
				attrs = InputStyle.toModifier()
					.id("inputName")
					.classNames("form-control")
					.padding(all = 12.px)
					.margin(bottom = 10.px)
					.width(
						if (breakpoint >= Breakpoint.MD) 500.px
						else 250.px
					)
					.height(48.px)
					.backgroundColor(Theme.BACKGROUND.rgb)
					.boxShadow(0.px, 0.px, 0.px, 0.px, null)
					.attrsModifier {
						attr("placeholder", "Subject")
						attr("name", "subject")
						attr("required", "true")
					}
					.toAttrs()
			)
			Label(
				attrs = Modifier
					.classNames("form-label")
					.textAlign(TextAlign.Start)
					.color(Theme.TEXT_PRIMARY.rgb)
					.fillMaxWidth()
					.textAlign(TextAlign.Start)
					.fontSize(14.px)
					.fontWeight(FontWeight.SemiBold)
					.fontStyle(FontStyle.Normal)
					.margin(bottom = 8.px)
					.toAttrs(),
				forId = "inputMessage"
			) {
				Text("Message")
			}
			TextArea(
				attrs = InputStyle.toModifier()
					.id("inputMessage")
					.classNames("form-control")
					.height(150.px)
					.margin(bottom = 20.px)
					.width(
						if (breakpoint >= Breakpoint.MD) 500.px else 250.px
					)
					.backgroundColor(Theme.BACKGROUND.rgb)
					.boxShadow(0.px, 0.px, 0.px, 0.px, null)
					.padding(12.px)
					.attrsModifier {
						attr("placeholder", "Your message")
						attr("name", "message")
						attr("required", "true")
					}
					.toAttrs()
			)
			Box(
				contentAlignment = Alignment.Center,
				modifier = Modifier.fillMaxWidth()
			) {
				Button(
					attrs = MainBtnStyle.toModifier()
						.margin(bottom = 20.px)
						.onClick {
							console.log("Submit form")
						}
						.toAttrs()
				) {
					Text("Send Message")
				}
			}
		}

	}
}

val MainBtnStyle = CssStyle {
	base {
		Modifier
			.width(100.px)
			.transition(Transition.all(0.2.s))
	}
	hover {
		Modifier.width(120.px)
	}}


@Composable
private fun ContactFormII(
	modifier: Modifier = Modifier,
	title: String = "Contact / Request a Demo"
) {
	var name by remember { mutableStateOf("") }
	var email by remember { mutableStateOf("") }
	var subject by remember { mutableStateOf("") }
	var message by remember { mutableStateOf("") }
	var submitted by remember { mutableStateOf(false) }

	// Simple validation (extend as needed)
	val isValid = name.isNotBlank() && email.contains("@") && message.isNotBlank()

	Column(
		modifier = modifier
			.maxWidth(500.px)
			.fillMaxWidth()
			.padding(24.px)
			.backgroundColor(Theme.CARD_BG.rgb)
	) {
		SpanText(
			text = title,
			modifier = Modifier
				.fontSize(24.px)
				.fontWeight(700)
				.margin(bottom = 12.px)
		)
		if (submitted) {
			SpanText(
				text = "Thank you for your message! I’ll get back to you soon.",
				modifier = Modifier.margin(top = 16.px)
			)
		} else {
			Form(
				attrs = {
					onSubmit {
						it.preventDefault()
						submitted = true
						// Here, integrate with backend, Formspree etc.
					}
				}
			) {
				// Name
				Input(InputType.Text) {
					value(name)
					placeholder("Your name")
					onInput { name = it.value }
					Modifier
						.margin(bottom = 10.px)
						.fillMaxWidth()
				}
				// Email
				Input(InputType.Email) {
					value(email)
					placeholder("Your email")
					onInput { email = it.value }
					Modifier
						.margin(bottom = 10.px)
						.fillMaxWidth()
				}
				// Subject
				Input(InputType.Text) {
					value(subject)
					placeholder("Subject")
					onInput { subject = it.value }
					Modifier
						.margin(bottom = 10.px)
						.fillMaxWidth()
				}
				// Message
				TextArea {
					value(message)
					placeholder("Your message")
					onInput { message = it.value }
					Modifier
						.minHeight(120.px)
						.margin(bottom = 18.px)
						.fillMaxWidth()
				}
				// Submit
				Button(
					attrs = {
						if (!isValid) disabled()
//						Modifier.then(SubmitBtnStyle.toModifier())
					}
				) { SpanText("Send Message") }
			}
		}
	}
}
