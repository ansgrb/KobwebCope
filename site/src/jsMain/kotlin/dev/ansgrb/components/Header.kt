package dev.ansgrb.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textDecorationLine
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import dev.ansgrb.models.Section
import dev.ansgrb.styles.NavigationItemStyle
import dev.ansgrb.styles.TitleStyle
import dev.ansgrb.util.R
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint

@Composable
fun Header() {
	val breakpoint = rememberBreakpoint()
	Row(
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth(if (breakpoint > Breakpoint.MD) 80.percent else 95.percent)
			.margin(topBottom = 50.px)
	) {
		Title(breakpoint = breakpoint)
		if (breakpoint > Breakpoint.MD) {
			Navigation()
			return@Row
		}
	}
}

@Composable
private fun Title(breakpoint: Breakpoint) {
	Row(
		horizontalArrangement = Arrangement.Start,
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier.fillMaxWidth(50.percent)
	) {
		if (breakpoint <= Breakpoint.SM) {
			FaBars(
				modifier = Modifier
					.margin(right = 10.px)
					.fontSize(24.px)
					.fontWeight(FontWeight.Bold)
					.textDecorationLine(TextDecorationLine.None)
					.padding(all = 10.px)
					.borderRadius(r = 50.px)
			)
		}
		SpanText(
			text = "Ansgr's",
			modifier = TitleStyle.toModifier()
				.fontSize(24.px)
				.fontWeight(FontWeight.Bold)
		)
	}
}

@Composable
private fun Navigation() {
	Row(
		horizontalArrangement = Arrangement.End,
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth()
			.padding(all = 20.px)
			.borderRadius(r = 50.px)
	) {
		Section.entries.take(5).forEach { section ->
			Link(
				path = section.path ?: section.id,
				text = section.title,
				modifier = NavigationItemStyle.toModifier()
					.fontFamily(R.font.roboto.regular)
					.fontWeight(FontWeight.Normal)
					.textDecorationLine(TextDecorationLine.None)
					.fontSize(18.px)
					.padding(right = 30.px)
			)
		}
	}
}