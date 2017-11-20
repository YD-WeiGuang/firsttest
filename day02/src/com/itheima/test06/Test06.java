package com.itheima.test06;

/*
* 什么是方法重载
	* 方法名相同，参数列表不同，与返回值无关。
	
* 什么是方法重写
	* 方法名相同，参数列表相同(类型和顺序要一直) 返回值类型相同

* 方法重写格式
	* 跟父类的方法声明完成一样，只是方法体不一样。

* 方法重写须知
	* 方法重写后，通过子类对象调用方法时，调用的是子类重写后的方法。
 */
public class Test06 {
	public static void main(String[] args) {
		// 创建程序猿对象
		Coder c = new Coder();
		c.work();
		
		// 创建厨师对象
		Cook c1 = new Cook();
		c1.work();
	}
}
