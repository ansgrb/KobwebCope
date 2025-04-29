//package dev.ansgrb.components
//
//import androidx.compose.runtime.Composable
//import com.varabyte.kobweb.compose.css.borderColor
//import com.varabyte.kobweb.compose.foundation.layout.Column
//import com.varabyte.kobweb.compose.foundation.layout.Row
//import com.varabyte.kobweb.compose.ui.Modifier
//import com.varabyte.kobweb.compose.ui.modifiers.alignItems
//import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
//import com.varabyte.kobweb.compose.ui.modifiers.borderBottom
//import com.varabyte.kobweb.compose.ui.modifiers.color
//import com.varabyte.kobweb.compose.ui.modifiers.flexDirection
//import com.varabyte.kobweb.compose.ui.modifiers.fontSize
//import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
//import com.varabyte.kobweb.compose.ui.modifiers.gap
//import com.varabyte.kobweb.compose.ui.modifiers.margin
//import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
//import com.varabyte.kobweb.compose.ui.modifiers.opacity
//import com.varabyte.kobweb.compose.ui.modifiers.padding
//import com.varabyte.kobweb.navigation.OpenLinkStrategy
//import com.varabyte.kobweb.silk.components.forms.Input
//import com.varabyte.kobweb.silk.components.layout.SimpleGrid
//import com.varabyte.kobweb.silk.components.layout.numColumns
//import com.varabyte.kobweb.silk.components.navigation.Link
//import com.varabyte.kobweb.silk.components.text.SpanText
//import com.varabyte.kobweb.silk.style.toModifier
//import dev.ansgrb.models.Theme
//import dev.ansgrb.styles.SubmitBtnStyle
////import org.jetbrains.compose.web.attributes.InputType
////import org.jetbrains.compose.web.attributes.placeholder
//import org.jetbrains.compose.web.css.AlignItems
//import org.jetbrains.compose.web.css.FlexDirection
//import org.jetbrains.compose.web.css.LineStyle
//import org.jetbrains.compose.web.css.px
////import org.jetbrains.compose.web.dom.Input
////import org.jetbrains.compose.web.dom.TextArea
//
//@Composable
//fun ContactForm() {
//	Column(
//		modifier = Modifier
//			.padding(topBottom = 6.px)
//			.borderBottom(1.px, LineStyle.Solid, Theme.ACCENT_TEAL.rgb)
////			.media(mediaMaxWidth(768.px)) { padding(topBottom = 4.px) }
//	) {
//		Column(
//			modifier = Modifier
//				.margin(bottom = 3.px)
//		) {
//			SpanText(
//				text = "Contact",
//				modifier = Modifier
//					.fontSize(2.2.px)
//					.fontWeight(700)
//					.margin(bottom = 1.px)
//			)
//			SpanText(
//				text = "Get in touch for collaboration or project inquiries",
//				modifier = Modifier
//					.fontSize(1.1.px)
//					.opacity(0.8)
//					.maxWidth(600.px)
//			)
//		}
//		SimpleGrid(
//			numColumns = numColumns(base = 1, md = 2),
//			modifier = Modifier
//				.gap(4.px)
////				.media(mediaMaxWidth(768.px)) { gap(2.px) }
//		) {
//			Column {
//				SpanText(
//					text = "Interested in working together? Whether you have a project in mind or just want to connect, feel free to reach out. I'm always open to discussing new opportunities and interesting challenges.",
//					modifier = Modifier
//						.fontSize(1.05.px)
//						.margin(bottom = 1.5.px)
//				)
//				Column(
//					modifier = Modifier
//						.margin(top = 2.px)
//				) {
//					Row(
//						modifier = Modifier
////							.display { flex }
//							.alignItems(AlignItems.Center)
//							.gap(1.px)
//							.margin(bottom = 1.px)
//					) {
//						SpanText("📧")
//						Link(
//							path = "mailto:ansgrb@gmail.com",
//							modifier = Modifier
//								.fontSize(1.05.px)
//								.color(Theme.TEXT_PRIMARY.rgb),
//							openInternalLinksStrategy = OpenLinkStrategy.IN_PLACE
//						) {
//							SpanText("ansgrb@gmail.com")
//						}
//					}
//					Row(
//						modifier = Modifier
////							.display { flex }
//							.alignItems(AlignItems.Center)
//							.gap(1.px)
//							.margin(bottom = 1.px)
//					) {
//						SpanText("🌐")
//						Link(
//							path = "https://github.com/ansgrb",
//							modifier = Modifier
//								.fontSize(1.05.px)
//								.color(Theme.TEXT_PRIMARY.rgb),
//							openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
//						) {
//							SpanText("github.com/ansgrb")
//						}
//					}
//					Row(
//						modifier = Modifier
////							.display { flex }
//							.alignItems(AlignItems.Center)
//							.gap(1.px)
//							.margin(bottom = 1.px)
//					) {
//						SpanText("🐦")
//						Link(
//							path = "https://x.com/ansgrb",
//							modifier = Modifier
//								.fontSize(1.05.px)
//								.color(Theme.TEXT_PRIMARY.rgb),
//							openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
//						) {
//							SpanText("@ansgrb")
//						}
//					}
//				}
//			}
//			Column(
//				modifier = Modifier
////					.display { flex }
//					.flexDirection(FlexDirection.Column)
//					.gap(1.5.px)
//			) {
//				Column(
//					modifier = Modifier
////						.display { flex }
//						.flexDirection(FlexDirection.Column)
//						.gap(0.5.px)
//				) {
//					SpanText(
//						text = "Name",
//						modifier = Modifier
//							.fontSize(0.9.px)
//							.fontWeight(500)
//					)
//					Input(
//						type = InputType.Text,
//						attrs = {
//							id("name")
//							placeholder("Your name")
//							style {
//								Modifier
//									.padding(1.px)
//									.backgroundColor(Theme.CARD_BG)
//									.border(1.px, LineStyle.Solid, Theme.BORDER_COLOR)
//									.borderRadius(4.px)
//									.color(Theme.TEXT_COLOR)
//									.fontSize(1.px)
//									.transition(CSSTransition("border-color", 0.3.s))
//									.focus { borderColor(Theme.ACCENT_COLOR) }
//							}
//						}
//					)
//				}
//				Column(
//					modifier = Modifier
////						.display { flex }
//						.flexDirection(FlexDirection.Column)
//						.gap(0.5.px)
//				) {
//					SpanText(
//						text = "Email",
//						modifier = Modifier
//							.fontSize(0.9.px)
//							.fontWeight(500)
//					)
//					Input(
//						type = InputType.Email,
//						attrs = {
//							id("email")
//							placeholder("Your email")
//							style {
//								Modifier
//									.padding(1.px)
//									.backgroundColor(Theme.CARD_BG)
//									.border(1.px, LineStyle.Solid, Theme.BORDER_COLOR)
//									.borderRadius(4.px)
//									.color(Theme.TEXT_COLOR)
//									.fontSize(1.px)
//									.transition(CSSTransition("border-color", 0.3.s))
//									.focus { borderColor(Theme.ACCENT_COLOR) }
//							}
//						}
//					)
//				}
//				Column(
//					modifier = Modifier
////						.display { flex }
//						.flexDirection(FlexDirection.Column)
//						.gap(0.5.px)
//				) {
//					SpanText(
//						text = "Subject",
//						modifier = Modifier
//							.fontSize(0.9.px)
//							.fontWeight(500)
//					)
//					Input(
//						type = InputType.Text,
//						attrs = {
//							id("subject")
//							placeholder("Subject")
//							style {
//								Modifier
//									.padding(1.px)
//									.backgroundColor(Theme.CARD_BG)
//									.border(1.px, LineStyle.Solid, Theme.BORDER_COLOR)
//									.borderRadius(4.px)
//									.color(Theme.TEXT_COLOR)
//									.fontSize(1.px)
//									.transition(CSSTransition("border-color", 0.3.s))
//									.focus { borderColor(Theme.ACCENT_COLOR) }
//							}
//						}
//					)
//				}
//				Column(
//					modifier = Modifier
////						.display { flex }
//						.flexDirection(FlexDirection.Column)
//						.gap(0.5.px)
//				) {
//					SpanText(
//						text = "Message",
//						modifier = Modifier
//							.fontSize(0.9.px)
//							.fontWeight(500)
//					)
//					TextArea(
//						attrs = {
//							id("message")
//							placeholder("Your message")
//							style {
//								Modifier
//									.padding(1.px)
//									.backgroundColor(Theme.CARD_BG)
//									.border(1.px, LineStyle.Solid, Theme.BORDER_COLOR)
//									.borderRadius(4.px)
//									.color(Theme.TEXT_COLOR)
//									.fontSize(1.px)
//									.minHeight(150.px)
//									.resize(Resize.Vertical)
//									.transition(CSSTransition("border-color", 0.3.s))
//									.focus { borderColor(Theme.ACCENT_COLOR) }
//							}
//						}
//					)
//				}
//				SpanText(
//					text = "Send Message",
//					modifier = Modifier
//						.then(SubmitBtnStyle.toModifier())
//						.padding(topBottom = 1.px, leftRight = 2.px)
//						.backgroundColor(Theme.ACCENT_COLOR)
//						.color(Theme.TEXT_COLOR)
//						.borderRadius(4.px)
//						.fontSize(1.px)
//						.fontWeight(600)
//						.cursor("pointer")
//						.alignSelf { flexStart }
//				)
//			}
//		}
//	}
//}}