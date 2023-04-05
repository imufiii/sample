package com.example.myapplication

import java.util.*;
fun main()
{
    val obj=Scanner(System.`in`)
    var i:Int=0
    var r:Int=0
    var p:Int=0
    var q:Int=1
    var myarray=Array<Int>(6){0}
    print("Enter 5 Element in the array: ")
    while(i<=4)
    {
        r=obj.nextInt()
        myarray.set(i,r)
        i++
    }
    for(p in myarray)
    {
        q=p

    }
}