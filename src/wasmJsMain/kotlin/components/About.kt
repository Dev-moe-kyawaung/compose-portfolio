package components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import theme.AppColors

@Composable
fun About() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 48.dp, vertical = 80.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "About",
            style = MaterialTheme.typography.labelLarge,
            color = AppColors.AccentGold,
            letterSpacing = 0.05.sp
        )
        
        Text(
            text = "Android developer by focus,\nproblem-solver by nature.",
            style = MaterialTheme.typography.displaySmall.copy(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 52.sp
            )
        )
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(48.dp)
        ) {
            Column(
                modifier = Modifier.weight(1.3f),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = "I'm a Senior Android Developer specializing in building performant, maintainable mobile applications with Kotlin and Jetpack Compose. My work centers on Clean Architecture, MVVM/MVI patterns, and offline-first design that scales gracefully in production.",
                    style = MaterialTheme.typography.bodyLarge.copy(lineHeight = 28.sp),
                    color = MaterialTheme.colorScheme.secondary
                )
                
                Text(
                    text = "Beyond mobile development, I bring working knowledge of Firebase backend services, REST API integration, and Python-based tooling — along with a genuine interest in cybersecurity and on-device machine learning, which increasingly intersect with modern Android development.",
                    style = MaterialTheme.typography.bodyLarge.copy(lineHeight = 28.sp),
                    color = MaterialTheme.colorScheme.secondary
                )
                
                Text(
                    text = "I build with intention: clean code, modern practices, and continuous learning across the mobile ecosystem.",
                    style = MaterialTheme.typography.bodyLarge.copy(lineHeight = 28.sp),
                    color = MaterialTheme.colorScheme.secondary
                )
            }
            
            Surface(
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(20.dp),
                color = AppColors.BackgroundTertiary,
                tonalElevation = 2.dp
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    InfoRow("Full Name", "Moe Kyaw Aung")
                    InfoRow("GitHub", "Dev-moe-kyawaung", accent = true)
                    InfoRow("Focus", "Android · Kotlin · Compose")
                    InfoRow("Currently Building", "MoeKyawTranslator — AI Translation App", accent = true)
                    InfoRow("Status", "Open to Work 🟢", accent = true)
                }
            }
        }
    }
}

@Composable
fun InfoRow(label: String, value: String, accent: Boolean = false) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.secondary
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold),
            color = if (accent) AppColors.AccentGold else MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(12.dp))
        Divider(color = AppColors.BorderSubtle)
    }
}

