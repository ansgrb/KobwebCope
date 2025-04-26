package dev.ansgrb.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textDecorationLine
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import dev.ansgrb.models.Section
import dev.ansgrb.models.Theme
import dev.ansgrb.styles.NavigationItemStyle
import dev.ansgrb.util.R
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun Header() {
	Row(
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth(80.percent)
			.margin(topBottom = 50.px)
	) {
		Row(
			horizontalArrangement = Arrangement.Start,
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier.fillMaxWidth(50.percent)
		) {
			Text("Ansgr's")
		}
		Row(
			horizontalArrangement = Arrangement.End,
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier
				.fillMaxWidth()
				.padding(all = 20.px)
				.borderRadius(r = 50.px)
				.backgroundColor(Theme.GRAY.rgb)
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
}