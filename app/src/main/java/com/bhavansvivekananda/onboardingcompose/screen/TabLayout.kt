package com.bhavansvivekananda.onboardingcompose.screen


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch
import view360



// on below line we are creating a
// composable function for our tab layout
@OptIn(ExperimentalUnitApi::class)
@ExperimentalPagerApi
@Composable
fun TabLayout(navController: NavHostController,
              welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    val pageCount = 2

    // on below line we are creating variable for pager state.
    val pagerState = rememberPagerState(pageCount)

    // on below line we are creating a column for our widgets.
    Column(
        // for column we are specifying modifier on below line.
        modifier = Modifier.background(Color.White)
    ) {
        // on the below line we are specifying the top app bar
        // and specifying background color for it.
        // on below line we are calling tabs
        Tabs(pagerState = pagerState)
        // on below line we are calling tabs content
        // for displaying our page for each tab layout
        TabsContent(pagerState = pagerState, navController = navController)
    }
}

// on below line we are
// creating a function for tabs
@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState) {
    // in this function we are creating a list
    // in this list we are specifying data as
    // name of the tab and the icon for it.
    val list = listOf(
        "Navigation",
        "360 View"
    )
    // on below line we are creating
    // a variable for the scope.
    val scope = rememberCoroutineScope()
    // on below line we are creating a
    // individual row for our tab layout.
    TabRow(
        // on below line we are specifying
        // the selected index.
        selectedTabIndex = pagerState.currentPage,

        // on below line we are
        // specifying background color.
        backgroundColor = Color(0xFF3348B8),

        // on below line we are specifying content color.
        contentColor = Color.White,

        // on below line we are specifying
        // the indicator for the tab
        indicator = { tabPositions ->
            // on below line we are specifying the styling
            // for tab indicator by specifying height
            // and color for the tab indicator.
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 1.dp,
                color = Color.White
            )
        }
    ) {
        // on below line we are specifying icon
        // and text for the individual tab item
        list.forEachIndexed { index, _ ->
            // on below line we are creating a tab.
            Tab(
                // on below line we are specifying icon
                // for each tab item and we are calling
                // image from the list which we have created.
                // on below line we are specifying the text for
                // the each tab item and we are calling data
                // from the list which we have created.
                text = {
                    Text(
                        list[index],
                        // on below line we are specifying the text color
                        // for the text in that tab
                        color = if (pagerState.currentPage == index) Color.White else Color.LightGray
                    )
                },
                // on below line we are specifying
                // the tab which is selected.
                selected = pagerState.currentPage == index,
                // on below line we are specifying the
                // on click for the tab which is selected.
                onClick = {
                    // on below line we are specifying the scope.
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
    }
}

// on below line we are creating a tab content method
// in which we will be displaying the individual page of our tab .
@OptIn(ExperimentalAnimationApi::class)
@ExperimentalPagerApi
@Composable
fun TabsContent(pagerState: PagerState, navController: NavHostController) {
    // on below line we are creating
    // horizontal pager for our tab layout.
    HorizontalPager(state = pagerState, count = 2) {
        // on below line we are specifying
        // the different pages.
            page ->
        when (page) {
            // on below line we are calling tab content screen
            // and specifying data as Home Screen.
            0 -> navfinal2()
            // on below line we are calling tab content screen
            // and specifying data as Shopping Screen.
            1 -> view360(navController = navController)
        }
    }
}

// on below line we are creating a Tab Content
// Screen for displaying a simple text message.
@Composable
fun TabContentScreen(data: String) {
    // on below line we are creating a column
    Column(
        // in this column we are specifying modifier
        // and aligning it center of the screen on below lines.
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // in this column we are specifying the text
        Text(
            // on below line we are specifying the text message
            text = data,

            // on below line we are specifying the text style.
            style = MaterialTheme.typography.h5,

            // on below line we are specifying the text color
            color = Color(0xFF0F9D58),

            // on below line we are specifying the font weight
            fontWeight = FontWeight.Bold,

            //on below line we are specifying the text alignment.
            textAlign = TextAlign.Center
        )
    }
}