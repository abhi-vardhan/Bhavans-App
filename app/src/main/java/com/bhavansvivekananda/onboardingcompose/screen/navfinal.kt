package com.bhavansvivekananda.onboardingcompose.screen

import android.widget.Toast
import android.widget.Toolbar
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.bhavansvivekananda.onboardingcompose.R
import com.bhavansvivekananda.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*
import com.bhavansvivekananda.onboardingcompose.ui.theme.nav
import view360

@OptIn(ExperimentalPagerApi::class, ExperimentalAnimationApi::class)
@Composable
fun navfinal(navController: NavHostController,
             welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    Box() {


    }
    Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(2.dp)){

        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(id = R.drawable.navigationhead1), contentDescription = null,
            modifier = Modifier
                .padding(top = 0.dp)
                .fillMaxWidth()
                .height(120.dp)

        )
        DisplayJCSpinner()
    }

}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DisplayJCSpinner() {

    val parentOptions = listOf("-Select-","BioChem", "Canteen", "Commerce", "IT", "Library", "MBA",
        "Science", "Vivek Bharathi")
    var expandedState by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(parentOptions[0]) }
    var mContext = LocalContext.current

    var childOptions = remember {
        mutableStateListOf<String>("-Select-","Commerce", "Canteen", "BioChem", "IT", "Library", "MBA",
            "Science", "Vivek Bharathi")
    }

    var expandedStateChild by remember { mutableStateOf(false) }
    var selectedOptionChild by remember {
        mutableStateOf(childOptions[0])
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight().background(color = Color.Transparent)
    ) {
        Image(
            painter = painterResource(id = R.drawable.navigationkifinalimagefinal),
            contentDescription = null,
            //alignment = Alignment.TopCenter,
            modifier = Modifier
                .padding(top = 0.dp, bottom = 1.dp)

                .background(color = Color.Transparent)
                .fillMaxWidth(),
            //.fillMaxHeight()
            //.fillMaxSize(),
            contentScale = ContentScale.FillWidth,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "  Starting Point",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,


            modifier = Modifier.padding(top = 10.dp)
        )

        ExposedDropdownMenuBox(
            expanded = expandedState,
            onExpandedChange = { expandedState = !expandedState },
            modifier = Modifier.padding(top =10.dp,).clip(shape = RoundedCornerShape(10.dp))
                .background(color = nav)
        ) {
            TextField(
                value = selectedOption,
                onValueChange = {},
                readOnly = true,
                textStyle = TextStyle.Default.copy(fontSize = 18.sp),
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expandedState
                    )
                })
            ExposedDropdownMenu(
                expanded = expandedState,
                onDismissRequest = { expandedState = false })
            {
                parentOptions.forEach { eachoption ->
                    DropdownMenuItem(onClick = {
                        selectedOption = eachoption
                        expandedState = false

                        childOptions.clear()

                        if (selectedOption.equals("BioChem")) {
                            childOptions.add("-Select-")
                            childOptions.add("Canteen")
                            childOptions.add("Commerce")
                            childOptions.add("IT")
                            childOptions.add("Science")
                            childOptions.add("MBA")
                            childOptions.add("Library")
                            childOptions.add("Vivek Bharathi")
                            selectedOptionChild = childOptions[0]

                        } else if (selectedOption.equals("Canteen")) {
                            childOptions.add("-Select-")
                            childOptions.add("BioChem")
                            childOptions.add("Commerce")
                            childOptions.add("IT")
                            childOptions.add("Science")
                            childOptions.add("MBA")
                            childOptions.add("Library")
                            childOptions.add("Vivek Bharathi")
                            selectedOptionChild = childOptions[0]

                        } else if (selectedOption.equals("Commerce")) {
                            childOptions.add("-Select-")
                            childOptions.add("Canteen")
                            childOptions.add("BioChem")
                            childOptions.add("IT")
                            childOptions.add("Science")
                            childOptions.add("MBA")
                            childOptions.add("Library")
                            childOptions.add("Vivek Bharathi")
                            selectedOptionChild = childOptions[0]

                        } else if (selectedOption.equals("IT")) {
                            childOptions.add("-Select-")
                            childOptions.add("Canteen")
                            childOptions.add("Commerce")
                            childOptions.add("BioChem")
                            childOptions.add("Science")
                            childOptions.add("MBA")
                            childOptions.add("Library")
                            childOptions.add("Vivek Bharathi")
                            selectedOptionChild = childOptions[0]

                        } else if (selectedOption.equals("Library")) {
                            childOptions.add("-Select-")
                            childOptions.add("Canteen")
                            childOptions.add("Commerce")
                            childOptions.add("IT")
                            childOptions.add("Science")
                            childOptions.add("MBA")
                            childOptions.add("BioChem")
                            childOptions.add("Vivek Bharathi")
                            selectedOptionChild = childOptions[0]

                        } else if (selectedOption.equals("MBA")) {
                            childOptions.add("-Select-")
                            childOptions.add("Canteen")
                            childOptions.add("Commerce")
                            childOptions.add("IT")
                            childOptions.add("Science")
                            childOptions.add("BioChem")
                            childOptions.add("Library")
                            childOptions.add("Vivek Bharathi")
                            selectedOptionChild = childOptions[0]

                        } else if (selectedOption.equals("Science")) {
                            childOptions.add("-Select-")
                            childOptions.add("Canteen")
                            childOptions.add("Commerce")
                            childOptions.add("IT")
                            childOptions.add("BioChem")
                            childOptions.add("MBA")
                            childOptions.add("Library")
                            childOptions.add("Vivek Bharathi")
                            selectedOptionChild = childOptions[0]

                        } else if (selectedOption.equals("Vivek Bharathi")) {
                            childOptions.add("-Select-")
                            childOptions.add("Canteen")
                            childOptions.add("Commerce")
                            childOptions.add("IT")
                            childOptions.add("Science")
                            childOptions.add("MBA")
                            childOptions.add("Library")
                            childOptions.add("BioChem")
                            selectedOptionChild = childOptions[0]

                        }

                    }) {
                        Text(text = eachoption, fontSize = 18.sp)

                    }
                }

            }

        }

        //~~ Child Dropdown
        Text(
            text = "  Destination", color = Color.Black,
            fontSize = 20.sp, fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(0.dp))
        ExposedDropdownMenuBox(
            expanded = expandedStateChild,
            onExpandedChange = { expandedStateChild = !expandedStateChild },
            modifier = Modifier.padding(10.dp).clip(shape = RoundedCornerShape(10.dp))
                .background(color = nav)
        ) {
            TextField(
                value = selectedOptionChild, onValueChange = {},
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedStateChild) },
                readOnly = true,
                textStyle = TextStyle.Default.copy(fontSize = 18.sp)
            )

            ExposedDropdownMenu(expanded = expandedStateChild,
                onDismissRequest = { expandedStateChild = false }) {

                childOptions.forEach { eachoption ->
                    DropdownMenuItem(onClick = {
                        selectedOptionChild = eachoption
                        expandedStateChild = false

                    }) {
                        Text(text = eachoption, fontSize = 18.sp)

                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))

        Box(
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth()
        ) {

            if (selectedOption == "BioChem") {
                if (selectedOptionChild == "Canteen") {
                    val img = painterResource(id = R.drawable.b_can)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Commerce") {
                    val img = painterResource(id = R.drawable.b_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillBounds
                        )
                    }
                } else if (selectedOptionChild == "IT") {
                    val img = painterResource(id = R.drawable.b_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Library") {
                    val img = painterResource(id = R.drawable.l_b)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "MBA") {
                    val img = painterResource(id = R.drawable.b_mba)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Science") {
                    val img = painterResource(id = R.drawable.sc_b)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Vivek Bharathi") {
                    val img = painterResource(id = R.drawable.vb_b)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                }
            } else if (selectedOption == "Canteen") {
                if (selectedOptionChild == "BioChem") {
                    val img = painterResource(id = R.drawable.b_can)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Commerce") {
                    val img = painterResource(id = R.drawable.can_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "IT") {
                    val img = painterResource(id = R.drawable.can_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Library") {
                    val img = painterResource(id = R.drawable.can_l)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "MBA") {
                    val img = painterResource(id = R.drawable.mba_can)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Science") {
                    val img = painterResource(id = R.drawable.sc_can)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Vivek Bharathi") {
                    val img = painterResource(id = R.drawable.vb_can)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                }
            } else if (selectedOption == "Commerce") {
                if (selectedOptionChild == "Canteen") {
                    val img = painterResource(id = R.drawable.can_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "BioChem") {
                    val img = painterResource(id = R.drawable.b_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "IT") {
                    val img = painterResource(id = R.drawable.it_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Library") {
                    val img = painterResource(id = R.drawable.l_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "MBA") {
                    val img = painterResource(id = R.drawable.mba_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Science") {
                    val img = painterResource(id = R.drawable.sc_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Vivek Bharathi") {
                    val img = painterResource(id = R.drawable.com_vb)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillBounds
                        )
                    }
                }
            } else if (selectedOption == "IT") {
                if (selectedOptionChild == "Canteen") {
                    val img = painterResource(id = R.drawable.can_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Commerce") {
                    val img = painterResource(id = R.drawable.it_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "BioChem") {
                    val img = painterResource(id = R.drawable.b_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Library") {
                    val img = painterResource(id = R.drawable.l_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "MBA") {
                    val img = painterResource(id = R.drawable.mba_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Science") {
                    val img = painterResource(id = R.drawable.sc_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Vivek Bharathi") {
                    val img = painterResource(id = R.drawable.it_vb)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                }
            } else if (selectedOption == "Library") {
                if (selectedOptionChild == "Canteen") {
                    val img = painterResource(id = R.drawable.can_l)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Commerce") {
                    val img = painterResource(id = R.drawable.l_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "IT") {
                    val img = painterResource(id = R.drawable.l_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "BioChem") {
                    val img = painterResource(id = R.drawable.l_b)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "MBA") {
                    val img = painterResource(id = R.drawable.l_mba)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Science") {
                    val img = painterResource(id = R.drawable.l_sc)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Vivek Bharathi") {
                    val img = painterResource(id = R.drawable.vb_lib)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                }
            } else if (selectedOption == "MBA") {
                if (selectedOptionChild == "Canteen") {
                    val img = painterResource(id = R.drawable.mba_can)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Commerce") {
                    val img = painterResource(id = R.drawable.mba_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "IT") {
                    val img = painterResource(id = R.drawable.mba_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Library") {
                    val img = painterResource(id = R.drawable.l_mba)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "BioChem") {
                    val img = painterResource(id = R.drawable.b_mba)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Science") {
                    val img = painterResource(id = R.drawable.mba_sc)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Vivek Bharathi") {
                    val img = painterResource(id = R.drawable.vb_mba)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                }
            } else if (selectedOption == "Science") {
                if (selectedOptionChild == "Canteen") {
                    val img = painterResource(id = R.drawable.can_sc)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Commerce") {
                    val img = painterResource(id = R.drawable.sc_com)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "IT") {
                    val img = painterResource(id = R.drawable.sc_it)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Library") {
                    val img = painterResource(id = R.drawable.l_sc)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "MBA") {
                    val img = painterResource(id = R.drawable.mba_sc)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "BioChem") {
                    val img = painterResource(id = R.drawable.b_sc)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Vivek Bharathi") {
                    val img = painterResource(id = R.drawable.vb_s)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                }
            } else if (selectedOption == "Vivek Bharathi") {
                if (selectedOptionChild == "Canteen") {
                    val img = painterResource(id = R.drawable.vb_can)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Commerce") {
                    val img = painterResource(id = R.drawable.com_vb)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "IT") {
                    val img = painterResource(id = R.drawable.it_vb)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Library") {
                    val img = painterResource(id = R.drawable.vb_lib)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "MBA") {
                    val img = painterResource(id = R.drawable.vb_mba)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "Science") {
                    val img = painterResource(id = R.drawable.vb_sci)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                } else if (selectedOptionChild == "BioChem") {
                    val img = painterResource(id = R.drawable.vb_b)
                    Box() {
                        Image(
                            painter = img, contentDescription = null,
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter),

                            contentScale = ContentScale.FillHeight
                        )
                    }
                }
            }

        }
        Spacer(modifier = Modifier.height(40.dp))
    }}



@OptIn(ExperimentalPagerApi::class, ExperimentalAnimationApi::class)
@Composable
fun navfinal2() {

        Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally){


        DisplayJCSpinner()
    }

}