package com.example.kotlinproj.widget

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.TypedValue
import android.view.Gravity
import androidx.appcompat.widget.AppCompatTextView
import com.example.kotlinproj.R
import com.example.kotlinproj.util.Utils

/*
* kotlin方式的自定义控件
* */
class CodeView : AppCompatTextView{

    //java版本：public BottomTest(@NonNull Context context)
    //    {
    //        this(context, null);
    //    }
    constructor(context:Context) : this(context,null) {

    }

    // 还是可以观察到除了this，super部分，其他都和java一样的
    @SuppressLint("NewApi")
    constructor(context: Context, attr: AttributeSet?):super(context,attr){
        setTextSize(TypedValue.COMPLEX_UNIT_SP , 18f)
        gravity = Gravity.CENTER
        setBackgroundColor(getContext().getColor(com.google.android.material.R.color.design_dark_default_color_primary))
        setTextColor(Color.WHITE);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(getContext().getColor(R.color.black));
        paint.setStrokeWidth(Utils.dp2px(6f));

        updateCode();
    }

    private val paint=Paint()
    private val codeList = arrayOf( //kotlin方式的数组声明
        "kotlin",
        "android",
        "java",
        "http",
        "https",
        "okhttp",
        "retrofit",
        "tcp/ip"
    )

    fun updateCode(){
        val arrOf= arrayOf(1,2,3,4,5)   //这些类型，kotlin会自动装箱成对应的
        val intArrayOf = intArrayOf(1,2,3,4,67765)
        /*
        * 基本数据类型：
        *   java：int long
        *
        *   kotlin：Int Float Double //这里为对象了(非java概念中的Int，Float)
        * */

    }
}