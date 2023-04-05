package com.example.myapplication

import java.util.*;
var da:Double=0.0
var hra:Double=0.0
var ns:Double=0.0
var pf:Double=0.0
var bs:Double=0.0
fun fn(bs:Double)
{
    da=bs*0.12
    hra=bs*0.05
    pf=bs*0.07
    ns=((bs+da+hra)-pf)

}
fun main()
{
    val obj=Scanner(System.`in`)
    var name:String
    print("Enter the Name of the Employee: ")
    name=obj.nextLine()
    print("Enter Basic salary of "+name+": ")
    bs=obj.nextDouble()
    fn(bs)
    print("The Basic Salary of " +name+" is: "+bs)
    print("\nDA is : "+da+"\nHRA is : "+hra+"\nPF is: "+pf+"\nThe Net Salary is: "+ns)

}


