package dev.ansgrb.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontStyle

@Composable
fun SectionsWrapper() {
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier
			.fillMaxSize()
			.fontFamily("Noto Sans")
			.fontStyle(FontStyle.Italic)
	) {
		HeroSection()
		AboutSection()
		TechStackSection()
		ProjectsSection()
		ContactSection()
	}
}