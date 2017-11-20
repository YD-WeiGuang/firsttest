package com.itheima.test03;
// 父类用来描述某一事物的共性内容
public class Person extends Object{
	public String name;
	public int age;
	
	// 共有的方法
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void sleep(){
		System.out.println("自己睡");
	}
}
