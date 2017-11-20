package com.itheima.test08;


/*
   this关键字的作用
  	* 区分成员变量和局部变量同名情况
  	* 代表当前对象的引用
  	* 调用本类的其他构造方法
  	* 访问本类的其他成员(成员变量和成员方法)
  		* this.成员变量; 先在本来中查找，本类找不到，去父类找，父类如果也没有则报错
  		* this.成员方法(); 先调用本来的，本类找不到，则调用父类的，父类如果没有则报错。
 
    this调用本来构造方法的注意事项
  		* 必须是在构造方法中第一行有效语句
 		* 不能在非构造方法中通过this调用本类构造方法。

	当父类和子类出现同名的成员变量时，如果要访问父类的成员变量需要通过
		* super.成员变量名; 直接去父类中查找指定的成员变量，如果父类中没有，则报错。
		* super.成员方法(); 直接去父类中查找指定的成员方法，如果没有找到，则报错。
 */
class Person {
	// 姓名
	public String name;
	
	public Person(String name){
		this.name = name;
	}
	public Person(){}
	
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Student extends Person{
	// 学号
	private String no;
	// 年龄
	private int age;
	// 姓名
	public String name;
	
	
	public Student(String name, int age, String no) {
		this(name,age);
		System.out.println("三个参数");
		this.no = no;
	}
	public Student(String name, int age) {
		super("jack");
		System.out.println("两个参数");
		this.name = name;
		this.age = age;
	}
	
	public Student(String name) {
		System.out.println("1个参数");
		this.name = name;
	}
	
	public Student() {
		System.out.println("无参数");
	}
	
	
	// setter & getter
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	
	
	// 显示信息方法
	public void showInfo(){
		// String name  = "jack";
		// name 先在方法内部查找是否有name变量，如果没有找到，则本类的成员位置去查找name成员变量。
		// this.name 直接去本类的成员位置查找成员变量name
		// 直接写name  查找原则：就近原则 (方法内 > 本类成员变量 > 父类成员位置)
		System.out.println(name); 
		System.out.println(this.name);
		System.out.println(super.name); 
		
		System.out.println("---------------");
		System.out.println(this.getName()); // rose
		// System.out.println(super.getName()); // jack
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Student stu = new Student("rose",20,"10086");
		stu.showInfo();
	}
}
