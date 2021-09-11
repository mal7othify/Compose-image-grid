package com.example.gridunsplash.presentation.image_list.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import com.example.gridunsplash.domain.model.Image

@OptIn(ExperimentalCoilApi::class)
@Composable
fun ImageItem(image: Image) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 5.dp
    ) {
        Box {
            NetworkImage(
                url = image.downloadUrl,
                contentDescription = null,
                modifier = Modifier
                    .aspectRatio(4f / 3f)
                    .size(200.dp)
            )
            Text(
                text = image.author.uppercase(),
                color = MaterialTheme.colors.onPrimary,
                style = MaterialTheme.typography.caption,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(MaterialTheme.colors.primary.copy(alpha = 0.5f))
                    .padding(vertical = 4.dp)
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
            )
        }
    }
}
