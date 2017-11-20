package com.itheima.test10;

public class Waiter extends Employee {
	
	public Waiter() {
	}

	public Waiter(String name, double salary) {
		super(name, salary);
	}

	// 重写work方法
	@Override
	public void work() {
		System.out.println("上菜与结账");
	}
}
