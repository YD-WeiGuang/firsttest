package com.itheima.test02;

/*
 * 一个类型A中的成员变量的数据类型是类型B时，此时A和B就是组合关系。
 */
public class Person {
	private String name;
	private int age;
	// 宠物成员变量
	private Pet pet;
	
	public Person(String name, int age, Pet pet) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
	}

	public Person() {
		super();
	}
	
	/*
	 * 显示个人信息
	 */
	public void showInfo(){
		System.out.println(this.name + "的年龄" + this.age);
		System.out.println("我的宠物的名字是" + this.pet.getName() + "颜色是：" + this.pet.getColor());
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

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
}
