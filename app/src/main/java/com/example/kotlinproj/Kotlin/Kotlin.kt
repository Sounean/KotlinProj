package com.example.kotlinproj

/*
* 0.与java不同，可以不需要类，直接写函数;
* Kotlin里函数有fun关键字
* */
// 和java的void一样,Unit可以省略
fun main():Unit{    //fun为函数关键字，java里仅类有，函数没有专门的关键字
    println("Heelo World!")
    var age:Int = 18    //1.基本类型
    val name: String = "Kotlin"  // 1.类似于java的final,只能赋值一次值
    // 肯定就报错了name="Android"
    var age2 = 19   //1.基本类型:可以不标注类型，让编译器去推断(第一次的时候就确认下来，后面不改了)

    var java:Java = Java()  // 1.创建一个对象(不需要new关键字，直接用构造器就行)

}

fun doubleNumber(x: Int): Int{
    return x*2
}