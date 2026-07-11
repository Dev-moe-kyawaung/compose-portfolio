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
fun TechStack() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 48.dp, vertical = 80.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Tech Stack",
            style = MaterialTheme.typography.labelLarge,
            color = AppColors.AccentGold,
            letterSpacing = 0.05.sp
        )
        
        Text(
            text = "Skills & Technologies",
            style = MaterialTheme.typography.displaySmall.copy(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        )
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            TechGroup(
                title = "📱 Android / Mobile",
                items = listOf("Kotlin", "Jetpack Compose", "Android SDK", "Android Studio"),
                modifier = Modifier.weight(1f)
            )
            TechGroup(
                title = "🏗️ Architecture",
                items = listOf("MVVM", "Clean Architecture", "Coroutines", "Kotlin Flow"),
                modifier = Modifier.weight(1f)
            )
            TechGroup(
                title = "☁️ Backend & Cloud",
                items = listOf("Firebase", "REST APIs", "Retrofit", "Room DB"),
                modifier = Modifier.weight(1f)
            )
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            TechGroup(
                title = "🤖 AI / ML",
                items = listOf("Claude API", "Python", "TensorFlow Lite"),
                modifier = Modifier.weight(1f)
            )
            TechGroup(
                title = "🔐 Security",
                items = listOf("Ethical Hacking Basics", "Linux", "Network Fundamentals"),
                modifier = Modifier.weight(1f)
            )
            TechGroup(
                title = "🛠️ Dev Tools",
                items = listOf("Git", "GitHub Actions", "VS Code", "Figma"),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun TechGroup(title: String, items: List<String>, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        color = AppColors.BackgroundTertiary,
        tonalElevation = 2.dp
    ) {
        Column(
            modifier = Modifier.padding(28.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
            )
            
            items.forEach { item ->
                TechChip(item)
            }
        }
    }
}

@Composable
fun TechChip(text: String) {
    Surface(
        shape = RoundedCornerShape(999.dp),
        color = AppColors.AccentGold.copy(alpha = 0.1f),
        border = androidx.compose.foundation.BorderStroke(1.dp, AppColors.BorderSubtle)
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
            style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Medium),
            color = AppColors.AccentGold
        )
    }
}

