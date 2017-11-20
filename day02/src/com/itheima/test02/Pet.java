package com.itheima.test02;

public class Pet {
	// 宠物姓名
	private String name;
	// 宠物颜色
	private String color;
	public Pet(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Pet() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
