package com.bhavansvivekananda.onboardingcompose.screen.homescreen


import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.R  
import com.bhavansvivekananda.onboardingcompose.navigation.Screen
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun noti1(navController: NavHostController,
          welcomeViewModel: WelcomeViewModel = hiltViewModel()) {
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
    val gradient =
        Brush.horizontalGradient(
            listOf(
                Color(0xFF008EFF),
                Color(0xFFFFFFFF)
            )
        )
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.feedbackbannertop),
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


        }
        Box(modifier = Modifier.height(200.dp)) {

        }
        Column(
            verticalArrangement = Arrangement.spacedBy(30.dp),
            modifier = Modifier.fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            fdb(
                gradient = gradient,
                text = "Developer Contact",
                onClick = {navController.navigate(Screen.devcon2.route)}

            )
            fdb(
                gradient = gradient,
                text = "Feedback",
                onClick = {navController.navigate(Screen.feedback.route)}

            )
        }

    }

}


@Composable
fun fdb(
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
        shape = RoundedCornerShape(30.dp),
        modifier = Modifier.padding(start = 30.dp,end = 30.dp),
        onClick = onClick
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 30.dp, bottom = 30.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth()
                .height(100.dp)
                .width(190.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = Color.Black,
                fontSize = 25.sp, textAlign = TextAlign.Center, fontFamily = homefont

            )
        }
    }

}


@Composable
fun fdb12(
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
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.padding(start=260.dp, end = 10.dp, top=100.dp),
        onClick = onClick
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 10.dp, bottom = 10.dp, end = 10.dp)

                .height(30.dp)
                .width(500.dp).shadow(50.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = Color.Black,
                fontSize = 14.sp, textAlign = TextAlign.Center, fontFamily = homefont

            )
        }
    }

}



@Composable
fun devcon2(navController: NavHostController,
            welcomeViewModel: WelcomeViewModel = hiltViewModel()) {
    val gradient =
        Brush.horizontalGradient(
            listOf(
                Color(0xFFFFFFFF),
                Color(0xFFFFFFFF)
            )
        )
    val handler = LocalUriHandler.current
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

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.devcontact),
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
            fdb12(
                gradient = gradient,
                text = "Feedback",
                onClick = {navController.navigate(Screen.feedback.route)}

            )

        }
        Box(modifier = Modifier.height(10.dp)) {

        }



        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Box(modifier = Modifier
                .fillMaxHeight()
            ) {
                Column() {
                    Text(text = "Digvijay Shelar",fontSize = 25.sp, color = Color.Black
                        , modifier = Modifier.padding(start =70.dp), textDecoration = TextDecoration.Underline
                        ,fontWeight = FontWeight.Bold  )
                    Spacer(modifier = Modifier.height(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.digvijaydp),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier
                            //.background(color = Color.White)
                            // .padding(start = 10.dp)

                            .height(150.dp)
                            .width(300.dp)


                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.insta),
                            contentDescription = null,
                            //alignment = Alignment.BottomStart,
                            modifier = Modifier
                                //.background(color = Color.White)
                                .padding(start = 40.dp)

                                .clickable { handler.openUri("https://instagram.com/__shelar__") }
                                .height(60.dp)
                                .width(60.dp)


                        )
                        Image(
                            painter = painterResource(id = R.drawable.github),

                            contentDescription = null,
                            //alignment = Alignment.BottomStart,
                            modifier = Modifier
                                //.background(color = Color.White)
                                // .padding(top = 20.dp, bottom = 20.dp, start = 0.dp, end = 240.dp)

                                .clickable { handler.openUri("https://github.com/shelar1423") }
                                .height(60.dp)
                                .width(60.dp)


                        )
                        Image(
                            painter = painterResource(id = R.drawable.linkedin),
                            contentDescription = null,
                            //alignment = Alignment.BottomStart,
                            modifier = Modifier
                                //.background(color = Color.White)
                                // .padding(top = 20.dp, bottom = 20.dp, start = 0.dp, end = 240.dp)

                                .clickable { handler.openUri("https://www.linkedin.com/in/digvijay-shelar-725111234") }
                                .height(60.dp)
                                .width(60.dp)


                        )
                    }
                }

            }
            Box(modifier = Modifier
                .fillMaxWidth())
            {

                Image(
                    painter = painterResource(id = R.drawable.spear),
                    contentDescription = null,
                    //alignment = Alignment.TopCenter,
                    modifier = Modifier
                        .padding(top = 1.dp, bottom = 1.dp, start = 0.dp)

                        .background(color = Color.Transparent)
                        .fillMaxWidth(),
                    //.fillMaxHeight()
                    //.fillMaxSize(),
                    contentScale = ContentScale.FillWidth,
                )
            }
            Box(modifier = Modifier
                .fillMaxHeight(),
            ) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)) {
                    Text(text = "D Abhinav Vardhan", fontSize = 25.sp, color = Color.Black,textAlign = TextAlign.Center
                        , modifier = Modifier.padding(start = 40.dp), textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold)
                   Spacer(modifier = Modifier.height(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.abhi),
                        contentDescription = null,
                        alignment = Alignment.Center,
                        modifier = Modifier
                            //.background(color = Color.White)
                            // .padding(start = 10.dp)

                            .height(150.dp)
                            .width(300.dp)


                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.insta),
                            contentDescription = null,
                            alignment = Alignment.Center,
                            modifier = Modifier
                                //.background(color = Color.White)
                                .padding(start = 40.dp)

                                .clickable {
                                    handler.openUri("https://instagram.com/abhivardhan_pvt")
                                }
                                .height(60.dp)
                                .width(60.dp)


                        )
                        Image(
                            painter = painterResource(id = R.drawable.github),
                            contentDescription = null,
                            //alignment = Alignment.BottomStart,
                            modifier = Modifier
                                //.background(color = Color.White)
                                // .padding(top = 20.dp, bottom = 20.dp, start = 0.dp, end = 240.dp)

                                .clickable { handler.openUri("https://github.com/abhi-vardhan") }
                                .height(60.dp)
                                .width(60.dp)


                        )
                        Image(
                            painter = painterResource(id = R.drawable.linkedin),
                            contentDescription = null,
                            //alignment = Alignment.BottomStart,
                            modifier = Modifier
                                //.background(color = Color.White)
                                // .padding(top = 20.dp, bottom = 20.dp, start = 0.dp, end = 240.dp)

                                .clickable { handler.openUri("https://linkedin.com/in/d-abhinav-vardhan-b9516a226") }
                                .height(60.dp)
                                .width(60.dp)


                        )
                    }
                }

            }


        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun defpre3() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {
        devcon2()
    }

}

 */

@Composable
fun feedback(navController: NavHostController,
             welcomeViewModel: WelcomeViewModel = hiltViewModel(),
             url: String) {
    AndroidView(factory = {
        WebView(it).apply {

            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            loadUrl(url)
            settings.javaScriptEnabled = true
            settings.loadWithOverviewMode = true;
            settings.useWideViewPort = true;
            settings.builtInZoomControls = true;

        }
    }, update = {
        it.loadUrl(url)

    })
}