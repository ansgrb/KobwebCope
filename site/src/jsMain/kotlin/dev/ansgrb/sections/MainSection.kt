package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import dev.ansgrb.components.Header
import dev.ansgrb.util.Constants.SECTION_WIDTH
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection() {
	Box(
		contentAlignment = Alignment.TopCenter,
		modifier = Modifier
			.maxWidth(SECTION_WIDTH.px)
			.fillMaxSize()
		) {
		Header()
	}
}
