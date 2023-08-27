package com.bhavansvivekananda.onboardingcompose.screen.homescreen


import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun alumni(navController: NavHostController,
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
