package com.bhavansvivekananda.onboardingcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.bhavansvivekananda.onboardingcompose.R  

val bab = FontFamily(Font(R.font.nunito_extrabold_italic))
val avtar = FontFamily(Font(R.font.ok))
val ReemKufi = FontFamily(Font(R.font.reemkufi))
val Poppins = FontFamily(Font(R.font.poppins))
// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = bab,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = ButtonBlue,
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)