

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.R  
import com.bhavansvivekananda.onboardingcompose.navigation.Screen
import com.bhavansvivekananda.onboardingcompose.screen.GradientB3
import com.bhavansvivekananda.onboardingcompose.screen.Gradienthallticket
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable

fun act(navController: NavHostController,
        welcomeViewModel: WelcomeViewModel = hiltViewModel()

) {

    val scrollState = rememberScrollState()
    var shouldAnimate by remember {
        mutableStateOf(true)
    }

    Image(
        painter = painterResource(id = R.drawable.bgacad), contentDescription = null,
        modifier = Modifier
            .padding(top = 1.dp)
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
                Color(0xFFB97AC4),
                Color(0xFF80A6ED)
            )
        )

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()

    ) {   Box(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.topacad),
                contentDescription = null,
                //alignment = Alignment.TopCenter,
                modifier = Modifier
                    .padding(top = 0.dp, bottom = 1.dp)

                    .background(color = Color.Transparent)
                .fillMaxWidth(),
                //.fillMaxHeight()
                //.fillMaxSize(),
                contentScale = ContentScale.FillWidth,
            )
        Image(
            painter = painterResource(id = R.drawable.quote),
            contentDescription = null,
            //alignment = Alignment.BottomStart,
            modifier = Modifier
                //.background(color = Color.White)
                .padding(top = 190.dp, bottom = 0.dp, start = 0.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth


        )







    }
        Box(modifier = Modifier.height(20.dp)) {

        }
        Column(
            verticalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier.fillMaxHeight()

        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB3(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.result.route) },
                    text = "Results",
                   img = painterResource(id = R.drawable.resultsicon)
                )
                GradientB3(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.almanac.route) },
                    text = "Almanac",
                    img = painterResource(id = R.drawable.alamancicon)
                )


            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB3(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.notification.route) },
                    text = "Notification",
                    img = painterResource(id = R.drawable.notificationiconhome)
                )
                Gradienthallticket(

                    gradient = gradient,
                    onClick = {},
                    text = "Downloads",
                    img = painterResource(id = R.drawable.downloadicon)
                )

            }

            }

        Spacer(modifier = Modifier.height(60.dp))
        }

    }
