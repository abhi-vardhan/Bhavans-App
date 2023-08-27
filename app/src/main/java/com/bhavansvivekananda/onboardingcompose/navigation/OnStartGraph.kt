package com.bhavansvivekananda.onboardingcompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.bhavansvivekananda.onboardingcompose.screen.Navigation
import com.bhavansvivekananda.onboardingcompose.screen.SplashScreen
import com.bhavansvivekananda.onboardingcompose.screen.WelcomeScreen
import com.bhavansvivekananda.onboardingcompose.viewmodel.SplashViewModel
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
fun NavGraphBuilder.onStartGraph(
    navController: NavHostController,
    splashViewModel: SplashViewModel
) {

    navigation(
        route = Graph.ON_START_GRAPH,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            Navigation(navController = navController)
        }
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController, splashViewModel = splashViewModel)
        }
    }

}