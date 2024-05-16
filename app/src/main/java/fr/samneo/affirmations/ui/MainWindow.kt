package fr.samneo.affirmations.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import fr.samneo.affirmations.R
import fr.samneo.affirmations.data.DataSource
import fr.samneo.affirmations.model.Affirmation
import fr.samneo.affirmations.ui.theme.AffirmationsTheme

@Composable
fun MainWindow(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(DataSource.affirmations) { affirmation ->
            AffirmationCard(
                affirmation = affirmation,
                modifier = Modifier.padding(
                    bottom = dimensionResource(id = R.dimen.card_bottom_padding),
                    start = dimensionResource(id = R.dimen.card_left_and_right_padding),
                    end = dimensionResource(id = R.dimen.card_left_and_right_padding)
                ),
            )
        }
    }
}

@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
    Card(modifier) {
        Image(
            painter = painterResource(id = affirmation.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(id = affirmation.text),
            modifier = Modifier.padding(dimensionResource(id = R.dimen.card_text_padding)),
            style = MaterialTheme.typography.displayMedium
        )
    }
}

@Preview
@Composable
fun MainWindowPreview() {
    AffirmationsTheme {
        MainWindow()
    }
}

@Preview
@Composable
fun AffirmationCardPreview() {
    AffirmationsTheme {
        AffirmationCard(DataSource.affirmations[0])
    }
}