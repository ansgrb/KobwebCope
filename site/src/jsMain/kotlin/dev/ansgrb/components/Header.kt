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
            .fillMaxWidth(
                when {
                    breakpoint <= Breakpoint.SM -> 100.percent
                    breakpoint <= Breakpoint.MD -> 95.percent
                    else -> 80.percent
                }
            )
            .padding(
                leftRight = when {
                    breakpoint <= Breakpoint.SM -> 16.px
                    else -> 0.px
                }
            )
            .margin(
                topBottom = when {
                    breakpoint <= Breakpoint.SM -> 30.px
                    else -> 50.px
                }
            )
    ) {
        Title(breakpoint = breakpoint)
        if (breakpoint > Breakpoint.MD) {
            Navigation()
        }
    }
}

@Composable
private fun Title(breakpoint: Breakpoint) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(
            when {
                breakpoint <= Breakpoint.MD -> 100.percent
                else -> 50.percent
            }
        )
    ) {
        if (breakpoint <= Breakpoint.MD) {
            FaBars(
                modifier = Modifier
                    .margin(right = 15.px)
                    .fontSize(24.px)
                    .fontWeight(FontWeight.Bold)
                    .textDecorationLine(TextDecorationLine.None)
                    .padding(all = 12.px)
                    .borderRadius(r = 50.px)
            )
        }
        SpanText(
            text = "Ansgr's",
            modifier = TitleStyle.toModifier()
                .fontSize(
                    when {
                        breakpoint <= Breakpoint.SM -> 20.px
                        else -> 24.px
                    }
                )
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
                    .padding(
                        leftRight = 30.px,
                        topBottom = 8.px
                    )
            )
        }
    }
}