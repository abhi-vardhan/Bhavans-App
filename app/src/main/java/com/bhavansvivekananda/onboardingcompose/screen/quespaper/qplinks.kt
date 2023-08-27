package com.bhavansvivekananda.onboardingcompose.screen.quespaper

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel

//ug

@Composable
fun bcomg(navController: NavHostController,
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

@Composable
fun bcomh(navController: NavHostController,
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

@Composable
fun bcomc(navController: NavHostController,
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

@Composable
fun bba(navController: NavHostController,
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

@Composable
fun bca(navController: NavHostController,
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

@Composable
fun bscl(navController: NavHostController,
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

@Composable
fun ba(navController: NavHostController,
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

@Composable
fun bscp(navController: NavHostController,
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


//pg
@Composable
fun mscc(navController: NavHostController,
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


@Composable
fun mba1(navController: NavHostController,
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


@Composable
fun mscm(navController: NavHostController,
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


@Composable
fun mcom(navController: NavHostController,
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


@Composable
fun mscb(navController: NavHostController,
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

//phd

@Composable
fun phdp(navController: NavHostController,
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

@Composable
fun phdm(navController: NavHostController,
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

@Composable
fun phdb(navController: NavHostController,
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

@Composable
fun phdma(navController: NavHostController,
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
