package com.itheima.test04;

public class Test01 {
	public static void main(String[] args) {
		// 创建学生对象
		Student stu = new Student();
		stu.setName("rose");
		stu.setAge(18);
		stu.setScore(99);
		stu.study();
		stu.eat();
		stu.sleep();
		System.out.println(stu.getName() + "=" + stu.getAge() + "=" + stu.getScore());
		
		// 创建程序猿对象
		Coder c = new Coder();
		c.setName("马云");
		c.setAge(50);
		c.setSalary(100);
		c.writeCode();
		c.eat();
		c.sleep();
		System.out.println(c.getName() + "=" + c.getAge() +"="+c.getSalary());
	}
}
