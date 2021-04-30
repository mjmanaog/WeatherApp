package com.mjmanaog.weatherapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.mjmanaog.weatherapp.R

val PublicSansLight = FontFamily(Font(R.font.publicsans_light))
val PublicSansRegular = FontFamily(Font(R.font.publicsans_regular))
val PublicSansBold = FontFamily(Font(R.font.publicsans_bold))

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = PublicSansBold,
        fontSize = 88.sp,
        letterSpacing = 0.5.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = PublicSansBold,
        fontSize = 16.sp,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontFamily = PublicSansLight,
        fontSize = 16.sp,
        letterSpacing = 0.sp
    ),
    body2 = TextStyle(
        fontFamily = PublicSansBold,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    caption = TextStyle(
        fontFamily = PublicSansRegular,
        fontSize = 10.sp,
    )
)
