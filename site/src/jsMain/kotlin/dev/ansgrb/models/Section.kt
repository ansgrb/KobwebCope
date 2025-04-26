package dev.ansgrb.models

enum class Section(
	val id: String,
	val title: String,
	val subtitle: String? = null,
	val path: String? = null,
) {
	HOME("home", "Home", "Welcome to my personal website."),
	ABOUT("about", "About", "More about me."),
	SKILLS("skills", "Skills", "My skills and experience."),
	EXPERIENCE("experience", "Experience", "My experience."),
	SERVICES("services", "Services", "My services."),
	CONTACT("contact", "Contact", "Get in touch."),
	PROJECTS("projects", "Projects", "My open source projects."),
	BLOG("blog", "Blog", "My blog posts."),
	TESTIMONIAL("testimonial", "Testimonial", "Testimonials from my clients."),
	ACHIEVEMENTS("achievements", "Achievements", "Achievements I've achieved."),
}