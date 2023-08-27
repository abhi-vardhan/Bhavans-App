package com.bhavansvivekananda.onboardingcompose.screen

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.R  
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun downloads(navController: NavHostController,
            welcomeViewModel: WelcomeViewModel = hiltViewModel(),
    context: Context
) {

    val package_name = "com.android.chrome"
    val URL = "http://www.bvcexams.com/Examination%20Downloads.html"
    val activity = (context as? Activity)
    val builder = CustomTabsIntent.Builder()
    builder.setShowTitle(true)
    builder.setInstantAppsEnabled(true)
    builder.setToolbarColor(ContextCompat.getColor(context, R.color.ButtonBlue))
    val customBuilder = builder.build()
    if (package_name != null) {
        customBuilder.intent.setPackage(package_name)
        customBuilder.launchUrl(context, Uri.parse(URL))
    } else {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse(URL))
        activity?.startActivity(i)
    }

}