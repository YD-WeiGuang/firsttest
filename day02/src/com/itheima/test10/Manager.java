package com.itheima.test10;

public class Manager extends Employee {
	// 奖金
	private int bonus;
	// 构造方法
	public Manager(int bonus) {
		this.bonus = bonus;
	}
	public Manager(String name, double salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	// 重写工作方法
	@Override
	public void work() {
		System.out.println("管理酒店");
	}
}
