package com.itheima.test10;

public class Waiter extends Employee {
	
	public Waiter() {
	}

	public Waiter(String name, double salary) {
		super(name, salary);
	}

	// ��дwork����
	@Override
	public void work() {
		System.out.println("�ϲ������");
	}
}
