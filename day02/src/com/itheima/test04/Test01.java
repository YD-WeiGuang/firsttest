package com.itheima.test04;

public class Test01 {
	public static void main(String[] args) {
		// ����ѧ������
		Student stu = new Student();
		stu.setName("rose");
		stu.setAge(18);
		stu.setScore(99);
		stu.study();
		stu.eat();
		stu.sleep();
		System.out.println(stu.getName() + "=" + stu.getAge() + "=" + stu.getScore());
		
		// ��������Գ����
		Coder c = new Coder();
		c.setName("����");
		c.setAge(50);
		c.setSalary(100);
		c.writeCode();
		c.eat();
		c.sleep();
		System.out.println(c.getName() + "=" + c.getAge() +"="+c.getSalary());
	}
}
