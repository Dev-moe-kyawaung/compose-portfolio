package components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.Project
import data.ProjectData
import theme.AppColors

@Composable
fun Projects() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 48.dp, vertical = 80.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text("Portfolio", style = MaterialTheme.typography.labelLarge, color = AppColors.AccentGold)
        Text(
            "Featured Projects",
            style = MaterialTheme.typography.displaySmall.copy(fontSize = 40.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            "A selection of applications demonstrating architecture decisions, not just feature checklists.",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(Modifier.height(8.dp))

        // Render projects in rows of 2
        ProjectData.projects.chunked(2).forEach { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                rowItems.forEach { project ->
                    ProjectCard(project = project, modifier = Modifier.weight(1f))
                }
                // Fill remaining space if odd number of items in last row
                if (rowItems.size < 2) {
                    Spacer(Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun ProjectCard(project: Project, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        color = AppColors.BackgroundTertiary,
        tonalElevation = 2.dp,
        border = androidx.compose.foundation.BorderStroke(1.dp, AppColors.BorderSubtle)
    ) {
        Column(
            modifier = Modifier.padding(28.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Text(project.emoji, style = MaterialTheme.typography.titleLarge)
                Text(
                    project.title,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
            }

            ProjectBlock(label = "Problem", text = project.problem)
            ProjectBlock(label = "Architecture", text = project.architecture)

            FlowRowChips(items = project.stack)

            Divider(color = AppColors.BorderSubtle, modifier = Modifier.padding(vertical = 4.dp))

            Text(
                text = "View Code ↗",
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold),
                color = AppColors.AccentGold,
                modifier = Modifier.clickable {
                    js("window.open(project.repoUrl, '_blank')")
                }
            )
        }
    }
}

@Composable
fun ProjectBlock(label: String, text: String) {
    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
        Text(
            text = label.uppercase(),
            style = MaterialTheme.typography.labelSmall,
            color = AppColors.AccentGold
        )
        Text(
            text = text,
            style = MaterialTheme.typography.bodySmall.copy(lineHeight = 20.sp),
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun FlowRowChips(items: List<String>) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items.forEach { item ->
            Surface(
                shape = RoundedCornerShape(999.dp),
                color = AppColors.AccentGold.copy(alpha = 0.08f),
                border = androidx.compose.foundation.BorderStroke(1.dp, AppColors.BorderSubtle)
            ) {
                Text(
                    text = item,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}
