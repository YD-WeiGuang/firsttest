package com.itheima.test09;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(){} 
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
	
	public void work(){
		System.out.println("����");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

class Student extends Person{
	private int score;
	
	public Student(){
	}
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public void work(){
		super.work();
		System.out.println("������д����");
	}
}

/*
 	toString�����ĵ���ʱ��
 		* ֱ�ӵ��ã��ֶ�ͨ���������
 		* ��ӵ��ã�����ӡ����ö���ʱϵͳ�Զ�����
	����Object��toString����Ĭ�Ϸ���ֵ��
		* ����.����@�������ڴ��еĵ�ַ��
 */
public class Test02 {
	public static void main(String[] args) {
		Student s  = new Student("С��",20,100);
		s.work();
		
		System.out.println(s);
		//System.out.println(s.toString());
		// com.itheima.test09.Student@677327b6
	}
}
