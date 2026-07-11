package components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.Credential
import data.CredentialData
import theme.AppColors

@Composable
fun Credentials() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 48.dp, vertical = 80.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text("Credentials", style = MaterialTheme.typography.labelLarge, color = AppColors.AccentGold)
        Text(
            "Continuous Learning",
            style = MaterialTheme.typography.displaySmall.copy(fontSize = 40.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            "Certifications and professional development demonstrating commitment to staying current across the mobile and cloud ecosystem.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(Modifier.height(8.dp))

        CredentialData.credentials.chunked(4).forEach { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                rowItems.forEach { cred ->
                    CredentialCard(cred, Modifier.weight(1f))
                }
                repeat(4 - rowItems.size) {
                    Spacer(Modifier.weight(1f))
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        Text(
            text = "Showing 8 of 40+ certifications",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun CredentialCard(cred: Credential, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        color = AppColors.BackgroundTertiary,
        tonalElevation = 2.dp
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Surface(
                shape = RoundedCornerShape(6.dp),
                color = AppColors.AccentGold.copy(alpha = 0.12f)
            ) {
                Text(
                    text = cred.category.uppercase(),
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                    style = MaterialTheme.typography.labelSmall,
                    color = AppColors.AccentGold
                )
            }

            Text(
                text = cred.title,
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold, lineHeight = 20.sp)
            )

            Text(
                text = "🏆 ${cred.issuer}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.secondary
            )

            Divider(color = AppColors.BorderSubtle)

            Text(
                text = "📅 ${cred.date}",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.secondary
            )
        }
    }
}

