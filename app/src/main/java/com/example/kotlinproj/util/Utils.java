package com.example.kotlinproj.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;


/*
* kotlin里没有static关键字
* */
public class Utils {

    private static final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();

   /* public static float dp2px(float dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics);
    }*/




}
