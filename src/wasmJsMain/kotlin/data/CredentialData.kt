package data

data class Credential(
    val title: String,
    val issuer: String,
    val category: String,
    val date: String,
    val verifyUrl: String? = null,
    val featured: Boolean = true
)

object CredentialData {
    val featuredCredentials = listOf(
        Credential(
            title = "Associate Android Developer",
            issuer = "Google",
            category = "Android",
            date = "2024",
            verifyUrl = "#",
            featured = true
        ),
        Credential(
            title = "Kotlin for Android Developers",
            issuer = "JetBrains Academy",
            category = "Android",
            date = "2024",
            verifyUrl = "#",
            featured = true
        ),
        Credential(
            title = "Advanced Android with Kotlin",
            issuer = "Google Developers",
            category = "Android",
            date = "2023",
            verifyUrl = "#",
            featured = true
        ),
        Credential(
            title = "Firebase Fundamentals",
            issuer = "Google Cloud",
            category = "Cloud",
            date = "2024",
            verifyUrl = "#",
            featured = true
        ),
        Credential(
            title = "Machine Learning on Device with TensorFlow Lite",
            issuer = "TensorFlow",
            category = "AI/ML",
            date = "2024",
            verifyUrl = "#",
            featured = true
        ),
        Credential(
            title = "Clean Architecture for Mobile",
            issuer = "Coursera",
            category = "Mobile",
            date = "2023",
            verifyUrl = "#",
            featured = true
        ),
        Credential(
            title = "Ethical Hacking Essentials",
            issuer = "EC-Council",
            category = "Security",
            date = "2024",
            verifyUrl = "#",
            featured = true
        ),
        Credential(
            title = "REST API Design & Development",
            issuer = "Udemy",
            category = "Web",
            date = "2023",
            verifyUrl = "#",
            featured = true
        )
    )
}

