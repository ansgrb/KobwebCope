package dev.ansgrb.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.Page
import dev.ansgrb.models.Theme
import dev.ansgrb.sections.SectionsWrapper
import org.jetbrains.compose.web.css.vh

@Page
@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .minHeight(100.vh)
            .backgroundColor(Theme.BACKGROUND.rgb),
    ) {
        SectionsWrapper()
    }
}
