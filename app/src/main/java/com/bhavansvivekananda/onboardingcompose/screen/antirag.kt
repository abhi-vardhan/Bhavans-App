package com.bhavansvivekananda.onboardingcompose.screen

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel

@Composable
fun antirag(navController: NavHostController,
            welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    val img = painterResource(id = R.drawable.bgnewhome)
    Box() {
        Image(painter = img, contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .align(Alignment.BottomCenter),

            contentScale = ContentScale.FillHeight
        )

    }


    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight()
            .padding(10.dp),

    ) {
        val im1 = painterResource(id = R.drawable.raghead2)
        Image(painter = im1,
            contentDescription = null,
            modifier = Modifier
                .padding(top = 0.dp, bottom = 1.dp)
                .background(color = Color.Transparent)
                .fillMaxWidth(), contentScale = ContentScale.FillWidth

        )

        Text(text = "   Anti - Ragging", color = Color.Red,
            fontSize = 30.sp, textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(0.dp))

        Text(text = "   Ragging is not a means of familiarization orintroduction with freshers.It is a form of sadistic/psychopathic behaviour. Itis a violation of human rights.\n" +
                "\n" +
                "           All measures for prevention of ragging are being taken on the Bhavan’s College campus as per the Anti RaggingSuprem Court verdict 2007.",
            fontSize = 20.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "    Actions to be taken by the college against those who are found involved in Ragging\n" +

                    "   => Immediate suspension from the college\n" +
                    "   => The incident will be reported to the police station for further procedure",
            color = Color.Black, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(20.dp))
/*
        Text(text = "   Contact Us",
            fontSize = 30.sp,
            color = Color.Red,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold)
        Text(text = "   College Nos: 040-27111611 & 27115878", color = Color.Black, fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Box(modifier = Modifier.width(100.dp).fillMaxHeight()) {


            }
            Text(text = "   Ext: 220 : Principal\n" +
                    "   225 : Head, Department of      Physics & Electronics\n" +
                    "   223 : Faculty in-charge for Commerce\n" +
                    "   255 : Faculty in-charge for B.Sc(Life Science)",
                color = Color.Black,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Box(modifier = Modifier.width(100.dp).fillMaxHeight()) {
                Text(text = "   Principal : ", color = Color.Black, fontSize = 20.sp
                )

            }
            Text(text = "   040-27111611 & 27115878",
                color = Color.Black,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Box(modifier = Modifier.width(200.dp).fillMaxHeight()) {
                Text(text = "   Mrs. B Niraimathi :\n "+
                        "   Head Dept. of\n" +
                        "   Physics and Electronics"
                    , color = Color.Black, fontSize = 20.sp
                )

            }
            Text(text = "   9989741098",
                color = Color.Black,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Box(modifier = Modifier.width(200.dp).fillMaxHeight()) {
                Text(text = "   Dr.C Kameshwari :\n "+
                        "   Head Dept. of\n" +
                        "   Languages"
                    , color = Color.Black, fontSize = 20.sp
                )

            }
            Text(text = "   9391136608",
                color = Color.Black,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Box(modifier = Modifier.width(200.dp).fillMaxHeight()) {
                Text(text = "   Dr. G Kondal Reddy :\n "+
                        "   Physical Director"
                    , color = Color.Black, fontSize = 20.sp
                )

            }
            Text(text = "   9399924880",
                color = Color.Black,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "   Email : bvcantiragging@gmail.com",
            color = Color.Black,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(20.dp))






        val gradient =
            Brush.horizontalGradient(
                listOf(
                    Color(0xFF0627DF),
                    Color(0xFF0627DF)
                )
            )

        ragbun(text = "Contact US",
            gradient = gradient,
        onClick ={ navController.navigate(Screen.ragpdf .route) })

 */
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "If any problem please report it to our anti - ragging committee or any other faculty without any hesitation. Immediate action will be taken"
                    ,
            color = Color.Red, fontSize = 25.sp, fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(20.dp))
        Spacer(modifier = Modifier.height(30.dp))

    }
}


@Composable
fun ragbun(
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
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.padding(start = 5.dp,end = 5.dp),
        onClick = onClick
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth()
                .height(60.dp)
                .width(800.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = Color.White,
                fontSize = 24.sp, textAlign = TextAlign.Center, fontFamily = homefont,
                fontWeight = FontWeight.Bold

            )
        }
    }

}


@Composable
fun ragpdf(navController: NavHostController,
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
