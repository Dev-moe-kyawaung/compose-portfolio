package data

data class Project(
    val title: String,
    val emoji: String,
    val problem: String,
    val architecture: String,
    val stack: List<String>,
    val repoUrl: String,
    val liveUrl: String? = null,
    val featured: Boolean = true
)

object ProjectData {
    val featuredProjects = listOf(
        Project(
            title = "POS Ultimate Pro Max",
            emoji = "💼",
            problem = "A full-featured point-of-sale system designed for retail and small business environments, handling inventory tracking, multi-user checkout flows, and sales reporting in real time.",
            architecture = "Built with a modular structure separating inventory, transaction, and reporting layers. State management handles concurrent cart operations safely, with local persistence ensuring the system remains functional during network interruptions.",
            stack = listOf("Kotlin", "Room DB", "MVVM", "Coroutines"),
            repoUrl = "https://github.com/moekyawaung-tech/POS-Ultimate-Pro-Max",
            featured = true
        ),
        Project(
            title = "Video Player",
            emoji = "🎯",
            problem = "A custom media playback application built to handle adaptive streaming, gesture-based controls, and background playback.",
            architecture = "Implements a custom player controller layer decoupled from the UI, allowing playback state to survive configuration changes and process death.",
            stack = listOf("Kotlin", "ExoPlayer/Media3", "Jetpack Compose"),
            repoUrl = "https://github.com/moekyawaung-tech/video-player",
            featured = true
        ),
        Project(
            title = "Social Dashboard",
            emoji = "📱",
            problem = "An analytics dashboard consolidating multi-platform social media metrics into a unified, real-time view for content creators and marketing teams.",
            architecture = "Data-layer built around a repository pattern abstracting multiple API sources behind a single interface, with reactive UI updates driven by Kotlin Flow.",
            stack = listOf("Kotlin", "Retrofit", "Flow", "Clean Architecture"),
            repoUrl = "https://github.com/moekyawaung-tech/social-dashboard",
            featured = true
        ),
        Project(
            title = "Job Portal App",
            emoji = "💼",
            problem = "A two-sided marketplace application connecting job seekers with employers, supporting search/filter workflows, application tracking, and profile management.",
            architecture = "Role-based navigation graph separating employer and candidate flows within a single codebase, with shared authentication and profile modules.",
            stack = listOf("Kotlin", "Firebase Auth", "Firestore", "Navigation"),
            repoUrl = "https://github.com/moekyawaung-tech/Job-Portal-App",
            featured = true
        ),
        Project(
            title = "Weather App",
            emoji = "🌤️",
            problem = "A weather forecasting application integrating third-party weather API data with location services, presenting current conditions and multi-day forecasts.",
            architecture = "Repository pattern caches API responses locally to reduce redundant network calls and support graceful degradation when offline.",
            stack = listOf("Kotlin", "REST API", "Room DB", "Location Services"),
            repoUrl = "https://github.com/moekyawaung-tech/Weather-app",
            featured = true
        ),
        Project(
            title = "Game Collection",
            emoji = "🎮",
            problem = "A curated collection of classic mini-games rebuilt for mobile, demonstrating custom rendering, input handling, and game-loop architecture.",
            architecture = "Custom Canvas-based rendering loop with delta-time calculations for consistent gameplay speed across device refresh rates.",
            stack = listOf("Kotlin", "Canvas API", "Custom Views"),
            repoUrl = "https://github.com/moekyawaung-tech/game-collection",
            featured = true
        )
    )
}

