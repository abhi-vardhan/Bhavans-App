package com.bhavansvivekananda.onboardingcompose.screen


import android.content.Intent
import android.net.Uri
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhavansvivekananda.onboardingcompose.R  
import com.bhavansvivekananda.onboardingcompose.navigation.NavigationItem
import com.bhavansvivekananda.onboardingcompose.ui.theme.bab
import com.bhavansvivekananda.onboardingcompose.ui.theme.c1
import com.bhavansvivekananda.onboardingcompose.ui.theme.c2
import com.google.accompanist.pager.ExperimentalPagerApi


@Composable
fun GradientButton(
    text :String,
    textColor : Color,
    gradient : Brush,
    onClick: () -> Unit,
) {

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  Color.Transparent
        ),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(20.dp),
        onClick = onClick) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 30.dp, bottom = 30.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = textColor,
                fontSize = 25.sp, textAlign = TextAlign.Center
            )
        }
    }

}

@Composable
fun GradientButton2(
    text :String,
    textColor : Color,
    gradient : Brush,
    onClick: () -> Unit,
) {

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  Color.Transparent
        ),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(20.dp),
        onClick = onClick) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 20.dp, bottom = 20.dp, start = 10.dp, end = 10.dp)
                .height(60.dp)
                .width(150.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = textColor,
                fontSize = 30.sp,  textAlign = TextAlign.Center
            )
        }
    }

}
//commit try
@Preview
@Composable
fun GradientPreview() {
    GradientButton(
        text = "Button",
        textColor = Color.Black,
        gradient = Brush.horizontalGradient(
            colors = listOf(
               c1, c2
            )
        )
    ) {

    }
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
    val homefont = FontFamily(
        Font(R.font.home))
    Button(

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),

        contentPadding = PaddingValues(),

        modifier = Modifier
            .shadow(shape = RoundedCornerShape(20.dp),
                elevation = 2.dp)
            //.padding(150.dp)
            .padding(top = 5.dp, start = 1.dp, end = 1.dp, bottom = 5.dp)
            .height(130.dp)
            .width(160.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            //.fillMaxSize()
            //.padding(horizontal = 1.dp, vertical = 8.dp)
            .background(gradient),


        onClick = onClick
    ) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                //painterResource(id = R.drawable.exam),
                painter = img,
                contentDescription = "Cart button icon",
                alignment = Alignment.Center,
                modifier = Modifier.height(80.dp).width(80.dp)

            )
            Text(
                text = text,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = homefont,
                fontSize = 15.sp
            )
        }


    }
}


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientB2(
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
            .padding(top = 5.dp, start = 1.dp, end = 1.dp, bottom = 5.dp)
            .height(100.dp)
            .width(170.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            //.fillMaxSize()
            //.padding(horizontal = 1.dp, vertical = 8.dp)
            .background(gradient),
        //commentline


        onClick = onClick
    ) {

        Image(
            //painterResource(id = R.drawable.exam),
            painter = img,
            contentDescription = "Cart button icon",
           alignment = Alignment.Center,
            modifier = Modifier
                .height(60.dp)
                .padding(start = 1.dp)

        )
        Text(
            text = text,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = bab,
        )
    }
}

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientB3(
    gradient: Brush,
    onClick: () -> Unit,
    text: String,
    img: Painter




) {val avtar = FontFamily(Font(R.font.ok))
    val homefont = FontFamily(
        Font(R.font.home))

    val uriHandler = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/")) }
    Button(

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),

        contentPadding = PaddingValues(),

        modifier = Modifier
            //.padding(150.dp)
            .padding(top = 5.dp, start = 1.dp, end = 1.dp, bottom = 5.dp)
            .height(130.dp)
            .width(170.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            //.fillMaxSize()
            //.padding(horizontal = 1.dp, vertical = 8.dp)
            .background(gradient),
        //commentline


        onClick = onClick
    ) {


        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                //painterResource(id = R.drawable.exam),
                painter = img,
                contentDescription = "Cart button icon",
                alignment = Alignment.Center,
                modifier = Modifier.height(80.dp).width(80.dp)

            )
            Text(
                text = text,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = homefont,
                fontSize = 15.sp
            )
        }
    }
}
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun Gradienthallticket(
    gradient: Brush,
    onClick: () -> Unit,
    text: String,
    img: Painter




) {val avtar = FontFamily(Font(R.font.ok))
    val homefont = FontFamily(
        Font(R.font.home))

    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bvcexams.com/Examination%20Downloads.html")) }
    Button(

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),

        contentPadding = PaddingValues(),

        modifier = Modifier
            //.padding(150.dp)
            .padding(top = 5.dp, start = 1.dp, end = 1.dp, bottom = 5.dp)
            .height(130.dp)
            .width(170.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            //.fillMaxSize()
            //.padding(horizontal = 1.dp, vertical = 8.dp)
            .background(gradient),
        //commentline


        onClick = { context.startActivity(intent)}
    ) {


        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                //painterResource(id = R.drawable.exam),
                painter = img,
                contentDescription = "Cart button icon",
                alignment = Alignment.Center,
                modifier = Modifier.height(80.dp).width(80.dp)

            )
            Text(
                text = text,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = homefont,
                fontSize = 15.sp
            )
        }
    }
}


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientB4(
    gradient: Brush,
    onClick: () -> Unit,
    text: String,
    img: Painter


    ) {
    val avtar = FontFamily(Font(R.font.ok))
    Button(

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),

        contentPadding = PaddingValues(),

        modifier = Modifier
            //.padding(150.dp)
            .padding(top = 300.dp, start = 1.dp, end = 1.dp, bottom = 5.dp)
            .height(50.dp)
            .width(700.dp)
            .clip(shape = RoundedCornerShape(40.dp))
            //.fillMaxSize()
            //.padding(horizontal = 1.dp, vertical = 8.dp)
            .background(gradient),
        //commentline


        onClick = onClick
    ) {
        Column() {


            Image(
                //painterResource(id = R.drawable.exam),
                painter = img,
                contentDescription = "Cart button icon",
                alignment = Alignment.Center,
                modifier = Modifier
                    .height(60.dp)
                    .padding(start = 10.dp))

            Text(

                text = text,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
             //   modifier = Modifier.padding(start = 0.dp)
            )

        }
    }

}