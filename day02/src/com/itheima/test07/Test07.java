package com.itheima.test07;
/*
 this���ñ����Ĺ��췽��
 * 
 */
class Chinese {
	// ����
	public String name;
	// ����
	private int age;
	public Chinese(String name, int age) {
		System.out.println("�����вι��췽��");
		this.name = name;
		this.age = age;
	}
	public Chinese() {
		System.out.println("�����޲������췽��");
	}
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
}

class Student extends Chinese{
	// ѧ��
	private String no;

	public Student(String name, int age, String no) {
		super(name,age);
		System.out.println("�����в�����������");
		this.no = no;
	}
	
	public Student() {
		this("����",18,"110");
		System.out.println("�����޲�������");
	}

	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void showInfo(){
		System.out.println(this.getName() + "��������" + this.getAge() + "��ѧ��" + this.no);
	}
}

public class Test07 {
	public static void main(String[] args) {
		// ����ѧ������
		/*Student s = new Student("jack", 23, "9527");
		s.showInfo();*/
		
		Student s = new Student();
		s.showInfo();
		
	}
}
