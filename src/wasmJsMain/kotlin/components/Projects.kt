package components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.ProjectData
import theme.AppColors

@Composable
fun Projects() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 48.dp, vertical = 80.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Portfolio",
            style = MaterialTheme.typography.labelLarge,
            color = AppColors.AccentGold,
            letterSpacing = 0.05.sp
        )
        
        Text(
            text = "Featured Projects",
            style = MaterialTheme.typography.displaySmall.copy(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        )
        
        Text(
            text = "A selection of applications demonstrating architecture decisions, not just feature checklists.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.secondary
        )
        
