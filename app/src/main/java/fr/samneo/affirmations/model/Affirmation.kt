package fr.samneo.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @DrawableRes val image: Int, @StringRes val text: Int
)
