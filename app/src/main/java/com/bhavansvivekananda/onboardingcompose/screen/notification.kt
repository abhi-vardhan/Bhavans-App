package com.bhavansvivekananda.onboardingcompose.screen


import androidx.compose.runtime.Composable
import android.app.ActionBar
import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.webkit.WebView
import android.webkit.WebViewClient


import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun notification(navController: NavHostController,
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
            this.setDownloadListener { url, userAgent,
                                       contentDisposition, mimetype,
                                       contentLength ->

                val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                val request = DownloadManager.Request(Uri.parse(url.toString()+""))
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                val reference = downloadManager.enqueue(request)
                val filename = url.split("/").toTypedArray().last().split(".").first()
                request.setMimeType("application/pdf")
                request.allowScanningByMediaScanner()
                request.setAllowedOverMetered(true)
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                request.setDestinationInExternalPublicDir(
                    Environment.DIRECTORY_DOWNLOADS,
                    "MyFiles/$filename"
                )
                downloadManager.enqueue(request)
            }

        }
    }, update = {
        it.loadUrl(url)

    })
}
