package com.example.kotlinproj.entity

/*
* java里的object相当于kotlin的any
* */
class User {
    @JvmField   //该注释的效果是使之产生一个公开的成员变量,而不产生getset方法.
    var username:String?=null

    var password:String?=null

    var code:String?=null   // 1.kotlin的getset方法下方是code的get,set方法
        set(value){
            field = value
        }
        get() {
            return field
        }

    constructor(){  // 2.kotlin的构造器

    }

    constructor(username:String?,password:String?,code:String?){
        this.username = username
        this.password = password
        this.code = code
    }
}