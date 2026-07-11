package components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.browser.window
import theme.AppColors

data class SocialLink(val name: String, val url: String, val icon: String)

@Composable
fun Footer() {
    val socialLinks = listOf(
        SocialLink("GitHub", "https://github.com/Dev-moe-kyawaung", "⚡"),
        SocialLink("LinkedIn", "https://www.linkedin.com/in/moe-kyaw-aung-2653093a1", "💼"),
        SocialLink("Gravatar", "https://gravatar.com/moekyawaung2026", "👤"),
        SocialLink("YouTube", "https://www.youtube.com/channel/UCuTXUguZb4xjeL2nX8WJG", "📺")
    )

    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 48.dp, vertical = 48.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Divider(color = AppColors.BorderSubtle)

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    "MKA.",
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    "Building the future of mobile experiences, one commit at a time.",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.secondary
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    "📍 Tachileik, Myanmar 🇲🇲 ↔ Bangkok, Thailand 🇹🇭",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.secondary
                )
            }

            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                socialLinks.forEach { social ->
                    Text(
                        text = social.icon,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.clickable {
                            window.open(social.url, "_blank")
                        }
                    )
                }
            }
        }

        Divider(color = AppColors.BorderSubtle)

        Text(
            "© 2025 Moe Kyaw Aung. Built with Compose Multiplatform.",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

