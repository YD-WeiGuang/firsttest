package com.itheima.test07;
/*
 this调用本来的构造方法
 * 
 */
class Chinese {
	// 姓名
	public String name;
	// 年龄
	private int age;
	public Chinese(String name, int age) {
		System.out.println("父类有参构造方法");
		this.name = name;
		this.age = age;
	}
	public Chinese() {
		System.out.println("父类无参数构造方法");
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
	// 学号
	private String no;

	public Student(String name, int age, String no) {
		super(name,age);
		System.out.println("子类有参数参数构造");
		this.no = no;
	}
	
	public Student() {
		this("张三",18,"110");
		System.out.println("子类无参数构造");
	}

	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void showInfo(){
		System.out.println(this.getName() + "的年龄是" + this.getAge() + "，学号" + this.no);
	}
}

public class Test07 {
	public static void main(String[] args) {
		// 创建学生对象
		/*Student s = new Student("jack", 23, "9527");
		s.showInfo();*/
		
		Student s = new Student();
		s.showInfo();
		
	}
}
