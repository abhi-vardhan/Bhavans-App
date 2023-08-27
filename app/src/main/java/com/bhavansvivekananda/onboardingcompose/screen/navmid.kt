package com.bhavansvivekananda.onboardingcompose.screen


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.R  
import com.bhavansvivekananda.onboardingcompose.navigation.Screen
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun navmid(navController: NavHostController,
           welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    val exam = FontFamily(Font(R.font.exam))
    Image(
        painter = painterResource(id = R.drawable.qpkabg), contentDescription = null,
        modifier = Modifier
            .padding(top = 0.dp)
            .fillMaxWidth()

            .fillMaxHeight(),
        /*.background(
            Color.White
        )*/
        contentScale = ContentScale.FillBounds,
    )


    val gradient =
        Brush.horizontalGradient(
            listOf(
                Color(0xFF75ADB6),
                Color(0xFFACD8DB)
            )
        )


    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()

    ) {


        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxHeight()

        ) {
            Spacer(modifier = Modifier.height(150.dp))
            NB(
                gradient = gradient,
                text = "Navigation",
                onClick = { navController.navigate(Screen.navfinal.route) }

            )
            Spacer(modifier = Modifier.height(150.dp))

            NB(
                gradient = gradient,
                text = "360 View",
                onClick = { navController.navigate(Screen.three60.route) }

            )

        }
    }
}




@Composable
fun NB(
    text :String,
    gradient : Brush,
    onClick: () -> Unit,
) {
    val homefont = FontFamily(
        Font(R.font.home))
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  Color.Transparent
        ),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.padding(start = 10.dp),
        onClick = onClick) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 30.dp, bottom = 30.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth()
                .height(50.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = Color.Black,
                fontSize = 25.sp, textAlign = TextAlign.Center, fontFamily = homefont

            )
        }
    }

}
