package com.itheima.test04;
// ������������ĳһ����Ĺ�������
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

	// ���еķ���
	public void eat(){
		System.out.println("�Է�");
	}
	
	public void sleep(){
		System.out.println("�Լ�˯");
	}
}
