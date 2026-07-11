package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import theme.AppColors

@Composable
fun Hero() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 48.dp, vertical = 96.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Senior Android Developer",
                style = MaterialTheme.typography.labelLarge,
                color = AppColors.AccentGold,
                letterSpacing = 0.05.sp
            )
            
            Text(
                text = "Moe Kyaw Aung",
                style = MaterialTheme.typography.displayLarge.copy(
                    fontSize = 56.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 64.sp
                )
            )
            
            Text(
                text = "မိုးကျော်အောင်",
                style = MaterialTheme.typography.displayMedium.copy(
                    fontSize = 42.sp,
                    fontWeight = FontWeight.Bold
                ),
                color = AppColors.AccentGold
            )
            
            Text(
                text = "📍 Tachileik, Myanmar 🇲🇲 ↔ Bangkok, Thailand 🇹🇭",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.secondary
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(
                text = "I build performant, well-architected Android applications using Kotlin, Jetpack Compose, and Clean Architecture — with a focus on maintainable code, offline-first design, and real-world production readiness.",
                style = MaterialTheme.typography.bodyLarge.copy(lineHeight = 28.sp),
                color = MaterialTheme.colorScheme.secondary
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            Row(
                horizontalArrangement = Arrangement.spacedBy(32.dp)
            ) {
                StatCard(number = "6+", label = "Featured Apps")
                StatCard(number = "3+", label = "Years Experience")
                StatCard(number = "40+", label = "Certifications")
            }
            
            Spacer(modifier = Modifier.height(32.dp))
            
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Button(
                    onClick = { /* Navigate to projects */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AppColors.AccentGold,
                        contentColor = AppColors.BackgroundPrimary
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.height(48.dp)
                ) {
                    Text("View Projects", fontWeight = FontWeight.SemiBold)
                }
                
                OutlinedButton(
                    onClick = { /* Download resume */ },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.height(48.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = MaterialTheme.colorScheme.onBackground
                    )
                ) {
                    Text("↓ Resume", fontWeight = FontWeight.SemiBold)
                }
            }
        }
        
        Spacer(modifier = Modifier.width(48.dp))
        
        CodeWindow()
    }
}

@Composable
fun StatCard(number: String, label: String) {
    Column {
        Text(
            text = number,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp
            ),
            color = AppColors.AccentGold
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun CodeWindow() {
    Surface(
        modifier = Modifier
            .width(480.dp)
            .height(520.dp),
        shape = RoundedCornerShape(20.dp),
        color = AppColors.BackgroundTertiary,
        tonalElevation = 4.dp
    ) {
        Column {
            // Window header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(AppColors.BackgroundSecondary)
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(11.dp)
                        .background(
                            color = androidx.compose.ui.graphics.Color(0xFFFF5F56),
                            shape = RoundedCornerShape(50)
                        )
                )
                Box(
                    modifier = Modifier
                        .size(11.dp)
                        .background(
                            color = androidx.compose.ui.graphics.Color(0xFFFFBD2E),
                            shape = RoundedCornerShape(50)
                        )
                )
                Box(
                    modifier = Modifier
                        .size(11.dp)
                        .background(
                            color = androidx.compose.ui.graphics.Color(0xFF27C93F),
                            shape = RoundedCornerShape(50)
                        )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Developer.kt",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
            
            // Code content
            Text(
                text = """
data class Developer(
    val name: String = "Moe Kyaw Aung",
    val role: String = "Senior Android Developer",
    val location: Pair<String, String> =
        "Tachileik" to "Bangkok",
    val languages: List<String> = listOf(
        "Burmese 🇲🇲", "English 🌐", "Kotlin ☕"
    )
) {
    val focus = mapOf(
        "Mobile"   to "Kotlin · Compose · MVVM",
        "Backend"  to "Firebase · REST · Python",
        "Security" to "Ethical Hacking",
        "AI/ML"    to "Claude API · TFLite"
    )

    val philosophy = 
        "Code with culture. Build with purpose."
}
                """.trimIndent(),
                modifier = Modifier.padding(24.dp),
                style = MaterialTheme.typography.bodySmall.copy(
                    fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace,
                    lineHeight = 22.sp,
                    fontSize = 13.sp
                ),
                color = androidx.compose.ui.graphics.Color(0xFFE6E6E6)
            )
        }
    }
}

