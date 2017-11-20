package com.itheima.test06;

public class Coder extends Employee {

	// 跟父类的方法声明完全一样，只是方法体不一样。
	// 注解，用来修饰方法声明的，表示该方法是重写父类的方法。
	@Override 
	public void work(){
		System.out.println("写代码");
	}
}
