package com.bhavansvivekananda.onboardingcompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.contentColorFor
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.bhavansvivekananda.onboardingcompose.ui.theme.Blue200



private val DarkColorPalette = darkColors(

    primary = Blue500,
    primaryVariant = ButtonBlue,
    secondary = Teal200,
   // onBackground = Color.Blue,
    //background = ButtonBlue



)

private val LightColorPalette = lightColors(
    primary = Blue500,
    primaryVariant = Black,
    secondary = Teal200,
   // onBackground = Color.Blue,
    //background = Blue500


    /* Other default colors to override
    
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun OnBoardingComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
       colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content,


    )

}