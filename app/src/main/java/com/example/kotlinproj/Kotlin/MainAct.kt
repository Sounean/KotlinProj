package com.example.kotlinproj.Kotlin

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.kotlinproj.R
import com.example.kotlinproj.SecondAct
import com.example.kotlinproj.util.CacheUtils

/*
* 2.此时类名:后面的不是类型而是继承自什么,实现什么接口(实现接口时，和继承类不同，没有括号)
* 2.java里的空安全设计只用了注解@NonNull的方式，还得自己去添加，而且习惯不好的即使注解开始提示了，也依旧不修改，
* kotlin就强行爆红，除非业务需要，你才主动得去加?去避免，约束力更强。
* */
class MainAct : AppCompatActivity(), View.OnClickListener{
    private val usernameKey = "useranme";
    private val passwordKey = "password";

    // 不加?会爆红提示（因为kotlin有空安全设计，只能加一个?表示可能存在为空(声明该对象为可空类型)，就不暴红了。）
    // 加上lateinit表示晚一点对它进行初始化  lateinit(本身用来修饰可空类型)
    private lateinit var et_username:AppCompatEditText
    private lateinit var et_password:AppCompatEditText
    private lateinit var et_code:AppCompatEditText


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        et_username = findViewById(R.id.et_username)
        et_password = findViewById(R.id.et_password)
        et_code = findViewById(R.id.et_code)

        // 当并没获取到对象时，不能直接set直接报错，这比java仅提示约束强,加"!!"或者"?"可以。
        et_username?.setText(CacheUtils.get(usernameKey))
        et_password.setText(passwordKey)

        val btn_login= findViewById<Button>(R.id.btn_login)

        //val findViewById = getDelegate().findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v is Button){   // 表示v是否为button类型
            //val btn:Button = v as Button    // as表示强转,而在kotlin中，传参为view，但是其实会自动转成button，所以这行可以省略
            login()
        }
    }

    private fun login() {
        // 获取类和java不一样：如果是Koltin的，就类名::class，如果是java类，就类名::class.java
        // Kotlin不写new！
        val username:String = et_username.text.toString()   // 看起来是直接操作属性，其实还是调用了get函数
        val et_password:String = et_password.text.toString()
        val et_code:String = et_code.text.toString()
        startActivity(Intent(this, SecondAct::class.java))
    }

}