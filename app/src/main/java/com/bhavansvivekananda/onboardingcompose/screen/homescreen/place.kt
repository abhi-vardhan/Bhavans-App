package com.bhavansvivekananda.onboardingcompose.screen.homescreen


import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun placement(navController: NavHostController,
                 welcomeViewModel: WelcomeViewModel = hiltViewModel(),
                 url: String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                webViewClient = CustomWebViewClient()
            }
        },
        update = { webView ->
            webView.loadUrl(url)
        }
    )
}
class CustomWebViewClient : WebViewClient() {
    override fun shouldOverrideUrlLoading(
        view: WebView,
        request: WebResourceRequest
    ): Boolean {
        val url = request.url.toString()
        if (url.startsWith("http") || url.startsWith("https")) {
            view.loadUrl(url)
            return false
        }
        return true
    }
}
