package com.itheima.test10;

public class Manager extends Employee {
	// ����
	private int bonus;
	// ���췽��
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
	
	// ��д��������
	@Override
	public void work() {
		System.out.println("����Ƶ�");
	}
}
