package com.bhavansvivekananda.onboardingcompose.screen


import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.R  
import com.bhavansvivekananda.onboardingcompose.ui.theme.*
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel


@ExperimentalMaterialApi
@Composable
fun FAQScreen(navController: NavHostController,
              welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    Image(
        painter = painterResource(id = R.drawable.devbg), contentDescription = null,
        modifier = Modifier
            .padding(top = 0.dp)
            .fillMaxHeight()
            .fillMaxWidth(),
        /*.background(
            Color.White
        )*/
        contentScale = ContentScale.FillBounds,

        )
    Image(
        painter = painterResource(id = R.drawable.faq),
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

    Column (){

        FAQSection()
    }

    BottomText()
}

@Composable
fun BottomText() {
    Box (
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.padding(top = 750.dp, start = 10.dp, end = 10.dp)
    ){
        Text(text = "Can't find an answer to your questions? Feel free to contact us at developerbvc@gmail.com",
            fontSize = 12.sp, color = IconColor3,
            fontFamily = Poppins
        )
    }
}

@ExperimentalMaterialApi
@Composable
fun FAQSection() {
    Column(modifier = Modifier.padding(top = 260.dp)
            .verticalScroll(rememberScrollState())
        .fillMaxHeight()) {
        ExpandableFAQCard(
            "Why am i getting white screen?", "The white screen can be due to the slow internet,try checking your connection and try again" +
                    "."
        )
        ExpandableFAQCard(
            "Is payment of fees safe from the app?", "Yes, as the app redirects to the website internally the transaction made is directly on the official feepayer website."
        )
        ExpandableFAQCard(
            "why is it showing\"web page not available\"?",
            "To take you to the website app requires internet connection kindly turn on the internet in order to solve the issue" +
                    "."
        )
    }
}

@ExperimentalMaterialApi
@Composable
fun ExpandableFAQCard(title: String, description: String) {
    var expandedState by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.padding(top = 10.dp)
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 400,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = Shapes.small ,
        onClick = {
            expandedState = !expandedState
        },
        backgroundColor = HeadText

    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 0.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = title,
                    modifier = Modifier.weight(6f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines =if(!expandedState) 1 else 3,
                    overflow =if(!expandedState) TextOverflow.Ellipsis else TextOverflow.Visible,
                    fontFamily = Poppins
                )
                IconButton(
                    onClick = { expandedState = !expandedState },
                    modifier = Modifier
                        .weight(1f)
                        .alpha(.5f),
                ) {
                    if (expandedState)
                        Icon(
                            painterResource(id = R.drawable.faqicon1), contentDescription = "",
                            modifier = Modifier.size(20.dp),
                            tint = IconColor2
                        )
                    else
                        Icon(
                            imageVector = Icons.Default.Add, contentDescription = "",
                            modifier = Modifier.size(20.dp),
                            tint =  IconColor2
                        )


                }
            }

            if (expandedState) {
                Text(
                    text = description,
                    modifier = Modifier.padding(bottom = 40.dp),
                    fontSize = 14.sp,
                    color = Color.Black,
                    lineHeight = 18.sp
                )
            }

        }

    }
}

