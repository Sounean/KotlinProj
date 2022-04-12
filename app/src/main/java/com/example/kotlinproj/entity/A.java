package com.example.kotlinproj.entity;

/*
* java怎么调用kotlin的实体类
* */
public class A {
    public static void main(String[] args) {
        User user = new User();
        /*String username = user.getUsername();
        user.setUsername("aaa");    //没被@JvmField 注释的都无法通过属性获取，只能getset方式获取*/

    }
}
