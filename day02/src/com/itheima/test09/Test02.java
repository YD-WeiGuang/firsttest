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
		System.out.println("功能");
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
		System.out.println("子类重写方法");
	}
}

/*
 	toString方法的调用时机
 		* 直接调用：手动通过对象调用
 		* 间接调用：当打印输出该对象时系统自动调用
	父类Object的toString方法默认返回值是
		* 包名.类名@对象在内存中的地址。
 */
public class Test02 {
	public static void main(String[] args) {
		Student s  = new Student("小潘",20,100);
		s.work();
		
		System.out.println(s);
		//System.out.println(s.toString());
		// com.itheima.test09.Student@677327b6
	}
}
