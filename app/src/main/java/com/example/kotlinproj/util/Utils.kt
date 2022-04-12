package com.example.kotlinproj.util

import android.util.TypedValue

/*public static float dp2px(float dp) {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics);
}*/
/*
* 如上面的java需要用static修饰，才能让其他类直接调用该函数，而kotlin里直接把函数写外边，其他就能调用（也叫顶层函数）
* */
fun dp2px(dp: Float): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Utils.displayMetrics)
}