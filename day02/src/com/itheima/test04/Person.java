package com.itheima.test04;
// 父类用来描述某一事物的共性内容
public class Person extends Object{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 共有的方法
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void sleep(){
		System.out.println("自己睡");
	}
}
