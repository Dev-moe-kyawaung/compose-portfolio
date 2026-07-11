package components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.browser.window
import theme.AppColors

data class ContactMethod(
    val icon: String,
    val label: String,
    val value: String,
    val link: String
)

@Composable
fun Contact() {
    val contactMethods = listOf(
        ContactMethod("📧", "Primary Email", "moekyawaung@programmer.net", "mailto:moekyawaung@programmer.net"),
        ContactMethod("📱", "Phone (Myanmar)", "+95 9 889 000 889", "tel:+959889000889"),
        ContactMethod("📱", "Phone (Thailand)", "+95 9 666 000 050", "tel:+959666000050"),
        ContactMethod("💼", "GitHub", "Dev-moe-kyawaung", "https://github.com/Dev-moe-kyawaung")
    )

    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 48.dp, vertical = 80.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text("Get In Touch", style = MaterialTheme.typography.labelLarge, color = AppColors.AccentGold)
        Text(
            "Let's Work Together",
            style = MaterialTheme.typography.displaySmall.copy(fontSize = 40.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            "Open to full-time Android development roles, consulting projects, and technical collaboration opportunities.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(Modifier.height(8.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            contactMethods.forEach { method ->
                ContactCard(method)
            }
        }
    }
}

@Composable
fun ContactCard(method: ContactMethod) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { window.open(method.link, "_blank") },
        shape = RoundedCornerShape(16.dp),
        color = AppColors.BackgroundTertiary,
        tonalElevation = 2.dp
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(method.icon, style = MaterialTheme.typography.headlineSmall)

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    method.label.uppercase(),
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.secondary
                )
                Text(
                    method.value,
                    style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold)
                )
            }

            Text("→", color = MaterialTheme.colorScheme.secondary)
        }
    }
}

