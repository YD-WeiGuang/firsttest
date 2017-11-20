package com.itheima.test04;
// 码农 
public class Coder extends Person{
	// 工资
	private int salary;
	
	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	// 特有方法：写代码
	public void writeCode(){
		System.out.println("写一个牛逼helloworld");
	}
}
