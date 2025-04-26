package dev.ansgrb.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import dev.ansgrb.models.Theme
import dev.ansgrb.sections.MainSection

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Theme.BLACKED_WHITE.rgb),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        MainSection()
    }
}
