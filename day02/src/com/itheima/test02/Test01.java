package com.itheima.test02;

public class Test01 {
	public static void main(String[] args) {
		// 创建宠物对象
		Pet pet = new Pet("旺财", "屎黄色");
		// 创建人对象
		Person p = new Person("华安", 23, pet);
		// 调用方法
		p.showInfo();
	}
}
