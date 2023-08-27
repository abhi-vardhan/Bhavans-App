package com.bhavansvivekananda.onboardingcompose.screen


import act
import com.bhavansvivekananda.onboardingcompose.ui.theme.nav
import android.annotation.SuppressLint
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.bhavansvivekananda.onboardingcompose.R  
import com.bhavansvivekananda.onboardingcompose.navigation.BottomNavGraph
import com.bhavansvivekananda.onboardingcompose.navigation.NavigationItem
import com.bhavansvivekananda.onboardingcompose.navigation.Screen
import com.bhavansvivekananda.onboardingcompose.ui.theme.bab
import com.bhavansvivekananda.onboardingcompose.ui.theme.bb
import com.bhavansvivekananda.onboardingcompose.ui.theme.c3
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import java.text.SimpleDateFormat
import java.util.*
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LibraryBooks
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.*

import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.*
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel(),name:String?

) {
    val homefont = FontFamily(
        Font(R.font.home))
    val list = listOf(
        "Don’t let what you cannot do interfere with what you can do.",
        "Make each day your masterpiece.",
        "Arise, awake, and stop not till the goal is reached",
        "Life is not a problem to be solved, but a reality to be experienced.",
        "Be a warrior not a worrier",
        "You do not find the happy life. You make it.",
        "The most wasted of days is one without laughter",
        "Happiness is not by chance, but by choice",
        "Impossible is for the unwilling",
        "Don’t let yesterday take up too much of today",
        "Nothing is impossible. The word itself says “I’m possible!"
        )
    val randomElement = list.random()
    val handler = LocalUriHandler.current



    Image(
        painter = painterResource(id = R.drawable.finalbghome), contentDescription = null,
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
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)) {
            Box(modifier = Modifier
                .width(100.dp)
                .padding(top = 20.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.logohome),
                    contentDescription = null,
                    //alignment = Alignment.BottomStart,
                    modifier = Modifier
                        //.background(color = Color.White)
                        // .padding(top = 20.dp, bottom = 20.dp, start = 0.dp, end = 240.dp)
                       // .fillMaxWidth()
                       // .height(150.dp).width(120.dp)
                        .clickable { navController.navigate(Screen.website.route) }


                )

            }

            Box(modifier = Modifier.fillMaxWidth()) {
                Column() {
Row(modifier = Modifier.fillMaxWidth()){
    Box(modifier = Modifier.weight(7f)) {


        Text(
            text = " Hello Bhavanite,",
            modifier = Modifier.padding(top = 10.dp),
            color = Color.White,
            fontSize = 25.sp,
            fontFamily = homefont
        )
    }
    Box(modifier = Modifier.weight(2f)) {
        Image(
            painter = painterResource(id = R.drawable.iicon),
            contentDescription = null,
            // alignment = Alignment.TopEnd,
            modifier = Modifier
                //.background(color = Color.White)
                .padding(top = 10.dp, end = 5.dp)
                // .fillMaxWidth()
                .height(35.dp)
                .width(60.dp)
                .clickable { navController.navigate(Screen.faq.route) }


        )
    }
    }
                        Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = randomElement,
                        modifier = Modifier.padding(start = 10.dp, top = 0.dp,end=15.dp),
                        color = Color.White,
                        fontSize = 17.sp,
                        fontFamily = homefont,

                        )


                }
            }


        }
        /*
        Box(modifier = Modifier.fillMaxWidth()) {



            Text(
                text = " Hello Bhavanite,",
                modifier = Modifier.padding(start = 160.dp, top = 29.dp),
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = homefont
            )

            Text(
                text = randomElement,
                modifier = Modifier.padding(start = 170.dp, top = 80.dp,end=15.dp),
                color = Color.White,
                fontSize = 17.sp,
                fontFamily = homefont,

                )

            Image(
                painter = painterResource(id = R.drawable.logohome),
                contentDescription = null,
                //alignment = Alignment.BottomStart,
                modifier = Modifier
                    //.background(color = Color.White)
                    .padding(top = 20.dp, bottom = 20.dp, start = 0.dp, end = 240.dp)
                    .fillMaxWidth()
                    .clickable { navController.navigate(Screen.website.route) }


            )


        }

         */
        Box(modifier = Modifier.height(0.dp)) {


        }
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier.fillMaxHeight()
        ) { Image(
            painter = painterResource(id = R.drawable.newlink1),
            contentDescription = null,
            //alignment = Alignment.BottomStart,
            modifier = Modifier
                //.background(color = Color.White)
                .padding(top = 0.dp, bottom = 0.dp, start = 0.dp)
                .fillMaxWidth()
                .clickable {
                    handler.openUri("https://linktr.ee/BhavansCollege")
                },
            contentScale =  ContentScale.FillWidth


        )
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.placement.route) },
                    text = "Placements",
                    img = painterResource(id = R.drawable.placement)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.TabLayout.route) },
                    text = "Navigation",
                    img = painterResource(id = R.drawable.navicon123)
                )


            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.payment.route) },
                    text = "FeePayment",
                    img = painterResource(id = R.drawable.feepayment)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.antirag.route) },
                    text = "Anti-Ragging",
                    img = painterResource(id = R.drawable.antiragfinal)
                )


            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {

                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.alumni.route) },
                    text = "Alumni",
                    img = painterResource(id = R.drawable.aluminifinal)
                )
                GradientB1(
                    gradient = gradient,
                    onClick = { navController.navigate(Screen.devcon2.route) },
                    text = "FeedBack",
                    img = painterResource(id = R.drawable.feedbackfinal)
                )

            }
            Box(modifier = Modifier.height(5.dp)) {

            }
        }
        Spacer(modifier = Modifier.height(60.dp))

    }



    @Composable
    fun GradientEdge(
        startColor: Color, endColor: Color,
    ) {
        Box(
            modifier = Modifier
                .width(10.dp)
                .fillMaxHeight()
                .background(
                    brush = Brush.horizontalGradient(
                        0f to startColor, 1f to endColor,
                    )
                )
        )
    }


    @ExperimentalAnimationApi
    @ExperimentalPagerApi
    @Composable
    fun GradientB1(
        gradient: Brush,
        onClick: () -> Unit,
        text: String,
        img: Painter
    ) {
        Button(

            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
            contentPadding = PaddingValues(),

            modifier = Modifier
                //.padding(150.dp)
                .padding(top = 30.dp, start = 10.dp, end = 10.dp, bottom = 30.dp)
                .height(100.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(20.dp))
                //.fillMaxSize()
                //.padding(horizontal = 1.dp, vertical = 8.dp)
                .background(gradient),


            onClick = onClick
        ) {
Column() {
    Image(
        //painterResource(id = R.drawable.exam),
        painter = img,
        contentDescription = "Cart button icon",
        alignment = Alignment.Center,
        modifier = Modifier
            .height(180.dp)
            .width(180.dp)

    )
    Text(
        text = text,
        color = Color.Blue,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = bab,
    )
}
        }
    }
}

/*@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun NavigationController(navController: NavHostController,startDestination: String) {
    NavHost(navController = navController, startDestination = startDestination) {

        composable(NavigationItem.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(NavigationItem.Notifications.route) {
            actscreen(navController = navController)
        }

        composable(NavigationItem.Settings.route) {
            exam(navController = navController)
        }



    }


}*/


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun Navigation(    navController: NavHostController,) {

    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

    val interactionSource = remember {
        MutableInteractionSource()
    }

    Box(
        modifier=Modifier.fillMaxSize(),
        contentAlignment= BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            HorizontalPager(
                count = tabRowItems.size,
                state = pagerState,
            ) { count ->
                when (count) {
                    0 -> HomeScreen(navController = navController, name = toString())
                    1 -> act(navController = navController)
                    2 -> exam(navController = navController)
                }
            }
        }
        //We first add TabRow which will be the container for Tab.
        //
        //selectedTabIndex, the index of the currently selected tab.
        //
        //indicator, that represents which tab is currently selected. but we don't need it so we made it Transparent
        TabRow(
            backgroundColor = c3,
            modifier = Modifier
                .fillMaxWidth().padding(10.dp)
                .clip(CircleShape),
            selectedTabIndex = pagerState.currentPage,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                    color = Color.Transparent
                )
            }
        ) {

            //Inside of the TabRow we will create Tab. Since we’ve already created tabs list, we’ll simply call tabRowItems.forEachIndex and set Tabs.
            //
            //selected, whether this tab is selected or not.
            //
            //In onClick method, we launch the coroutineScope and call animateScrollToPage function. It simply animates to the given page to the middle of the viewport.
            tabRowItems.forEachIndexed { index, item ->

                Tab(
                    modifier = Modifier
                        .clickable(
                            indication = null,
                            interactionSource = interactionSource,
                            onClick = {
                                coroutineScope.launch { pagerState.animateScrollToPage(index) }
                            }
                        )
                    ,
                    selected = pagerState.currentPage == index,
                    onClick = {
                        // we have already added the clickable in the Modifier
                    },
                    text = {
                        BottomNavItem(
                            item.title,
                            icon = item.icon,
                            selected = pagerState.currentPage == index,
                            interactionSource = interactionSource,
                            onCLick = {
                                coroutineScope.launch { pagerState.animateScrollToPage(index) }
                            }
                        )
                    }
                )
            }
        }

    }

        //HorizontalPager A horizontally scrolling layout that allows users to flip between items to the left and right.
        //
        //Finally, we’ll add HorizontalPager. count is the number of pages and state is the object to be used to control or observe the pager’s state which we’ve already created above.
        //
        //Inside of the HorizontalPager, we’ll get current page and call screens.

    }




data class TabRowItem(
    val title: String,
    val icon: ImageVector,
)

val tabRowItems = listOf(
    TabRowItem(
        title = "Home",
        icon = Icons.Rounded.Home,


    ),
    TabRowItem(
        title = "Exam",
        icon = Icons.Rounded.Book,
    ),
    TabRowItem(
        title = "Paper",
        icon = Icons.Default.LibraryBooks,

    )
)

@Composable
fun BottomNavItem(
    title: String,
    icon: ImageVector,
    selected: Boolean,
    interactionSource: MutableInteractionSource,
    onCLick: () -> Unit
) {

    val background =
        if (selected) nav.copy(alpha = 0.6f) else Color.Transparent

    val contentColor =
        if (selected) Color.White else bb

    Box(
        modifier = Modifier
            .height(40.dp)
            .clip(CircleShape)
            .background(background)
            .clickable(
                indication = null,
                interactionSource = interactionSource,
                onClick = { onCLick() }
            )
    ) {
        Row(
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "icon",
                tint = contentColor
            )
            AnimatedVisibility(visible = selected) {
                Text(
                    text = title,
                    color = contentColor,
                    fontSize = 10.sp
                )
            }
        }
    }
}


// our screens
// home screen

