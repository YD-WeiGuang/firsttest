package com.itheima.test03;

public class Test01 {
	public static void main(String[] args) {
		// ����ѧ������
		Student stu = new Student();
		stu.name = "jack";
		stu.age = 20;
		stu.score = 99;
		stu.study();
		stu.eat();
		stu.sleep();
		System.out.println(stu.name + "=" + stu.age + "=" + stu.score);
		
		// ��������Գ����
		Coder c = new Coder();
		c.name = "����";
		c.age = 50;
		c.salary = 100;
		c.writeCode();
		c.eat();
		c.sleep();
		System.out.println(c.name + "=" + c.age +"="+c.salary);
	}
}
