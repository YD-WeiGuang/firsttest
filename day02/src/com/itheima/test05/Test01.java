package com.itheima.test05;

/*
 *  * Java只能是单继承，不能多继承
	* Java支持多层继承
 */
public class Test01 {
	public static void main(String[] args) {
		// 创建son对象
		Son s = new Son();
		s.name = "老王";
		s.age = 30;
		s.work();
		s.eat();
	}
}


class Fu1 {
	public String name;
	public void eat(){
		System.out.println("Fu1的eat方法");
	}
}

class Fu2 extends Fu1 {
	public int age;
	public void work(){
		System.out.println("Fu2的工作方法");
	}
}

class Son extends Fu2{
	
}
