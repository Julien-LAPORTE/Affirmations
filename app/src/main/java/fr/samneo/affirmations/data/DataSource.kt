package fr.samneo.affirmations.data

import fr.samneo.affirmations.R
import fr.samneo.affirmations.model.Affirmation

object DataSource {
    val affirmations = listOf<Affirmation>(
        Affirmation(image = R.drawable.image1, text = R.string.affirmation1),
        Affirmation(image = R.drawable.image2, text = R.string.affirmation2),
        Affirmation(image = R.drawable.image3, text = R.string.affirmation3),
        Affirmation(image = R.drawable.image4, text = R.string.affirmation4),
        Affirmation(image = R.drawable.image5, text = R.string.affirmation5),
        Affirmation(image = R.drawable.image6, text = R.string.affirmation6),
        Affirmation(image = R.drawable.image7, text = R.string.affirmation7),
        Affirmation(image = R.drawable.image8, text = R.string.affirmation8),
        Affirmation(image = R.drawable.image9, text = R.string.affirmation9),
        Affirmation(image = R.drawable.image10, text = R.string.affirmation10)
    )
}