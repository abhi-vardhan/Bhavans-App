package com.bhavansvivekananda.onboardingcompose.navigation


//import androidx.compose.material.icons.filled.Book

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LibraryBooks
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Screen(val route: String,) {

    object SplashScreen : Screen(route = "splash_screen")
    //object Home : Screen(route = "home_screen")
    object Papers :Screen(route = "papers")
    object Question1 : Screen(route = "Question1")

    object hm2 : Screen(route = "ph1")
    //object Navscreen :Screen(route = "nav1")
    object commerce:Screen(route = "comblock")
    object it:Screen(route = "it")
    object mba:Screen(route = "mba")
    object lib:Screen(route = "lib")
    object bio:Screen(route = "bio")
    object science:Screen(route = "science")
    object result:Screen(route = "result")
    object notification:Screen(route = "notification")
    object antirag:Screen(route = "antirag")
    object ragpdf:Screen(route = "ragpdf")


    object placement:Screen(route = "placement")
    object payment:Screen(route = "payment")
    object alumni:Screen(route = "alumni")
    object feedback:Screen(route = "feedback")
    object feedbackmain:Screen(route = "feedbackmain")
    object devcon2:Screen(route = "devcon")
object faq:Screen(route = "faq")
    object HomeScreen:Screen(route = "Home_screen/{name}")
 object  syllabi:Screen(route = "syllabi")
    object  almanac:Screen(route = "almanac")
    object  website:Screen(route = "website")
    object  marquee:Screen(route = "marquee")
    object  linktree:Screen(route = "linktree")
    object  fourthscreen:Screen(route = "fourth")

    object Welcome : Screen(route = "welcome_screen")
    object name:Screen(route = "name")
    object academicsScreen:Screen(route = "acadscreen")
    object downloads:Screen(route = "downloads")
    object three60:Screen(route = "three60")
    object itcom:Screen(route = "b2")
    object biosci:Screen(route = "b3")
    object vbmba:Screen(route = "b4")
    object libblock:Screen(route = "b5")
    object parking:Screen(route = "b6")

    object canteen:Screen(route = "b12")
    object b13:Screen(route = "b13")

    object navfinal:Screen(route = "navfinal")
    object navmid:Screen(route = "navmid")
    object TabLayout:Screen(route = "TabLayout")





    //question papers
    object bcomg:Screen(route = "bcomg")
    object bcomh:Screen(route = "bcomh")
    object bcomc:Screen(route = "bcomc")
    object bca:Screen(route = "bca")
    object bba:Screen(route = "bba")
    object ba:Screen(route = "ba")
    object bscl:Screen(route = "bscl")
    object bscp:Screen(route = "bscp")
    object mscc :Screen(route = "mscc")
    object mba1 :Screen(route = "mba")
    object mscm :Screen(route = "mscm")
    object mcom :Screen(route = "mcom")
    object mscb :Screen(route = "mscb")
    object phdp :Screen(route = "phdp")
    object phdm :Screen(route = "phdm")
    object phdb :Screen(route = "phdb")
    object phdma :Screen(route = "phdma")
    object Navscreen :Screen(route = "nav1")


}
sealed class NavigationItem(val route: String, val label: String,val Icon: ImageVector) {

    object Home : NavigationItem("Home/{name}", "Home", Icons.Default.Home)
    object academics :
        NavigationItem("academics", "Academics", Icons.Default.Book)

    object Activities : NavigationItem("Activities","Papers",Icons.Default.LibraryBooks)
    companion object Navigation1




}

