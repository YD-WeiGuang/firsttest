package com.itheima.test02;

/*
 * һ������A�еĳ�Ա��������������������Bʱ����ʱA��B������Ϲ�ϵ��
 */
public class Person {
	private String name;
	private int age;
	// �����Ա����
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
	 * ��ʾ������Ϣ
	 */
	public void showInfo(){
		System.out.println(this.name + "������" + this.age);
		System.out.println("�ҵĳ����������" + this.pet.getName() + "��ɫ�ǣ�" + this.pet.getColor());
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
