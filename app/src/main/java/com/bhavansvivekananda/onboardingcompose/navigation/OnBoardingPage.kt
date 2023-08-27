package com.bhavansvivekananda.onboardingcompose.navigation

import androidx.annotation.DrawableRes
import com.bhavansvivekananda.onboardingcompose.R


sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String,

) {
    object First : OnBoardingPage(
        image = R.drawable.bvcreal,
        title = "Bhavan's",
        description = "Welcome to the official Bhavan's App"
    )

    object Second : OnBoardingPage(
        image = R.drawable.preqp,
        title = "Question Papers",
        description = "You can access previous year question papers"
    )

    object Third : OnBoardingPage(
        image = R.drawable.acadmicsonboarding,
        title = "Academics",
        description = "All your Academics need at one place"
    )

    object Fourth : OnBoardingPage(
        image = R.drawable.manymore,
        title = "",
        description = "And Much More "
    )

}
