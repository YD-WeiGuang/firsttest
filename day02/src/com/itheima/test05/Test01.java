package com.itheima.test05;

/*
 *  * Javaֻ���ǵ��̳У����ܶ�̳�
	* Java֧�ֶ��̳�
 */
public class Test01 {
	public static void main(String[] args) {
		// ����son����
		Son s = new Son();
		s.name = "����";
		s.age = 30;
		s.work();
		s.eat();
	}
}


class Fu1 {
	public String name;
	public void eat(){
		System.out.println("Fu1��eat����");
	}
}

class Fu2 extends Fu1 {
	public int age;
	public void work(){
		System.out.println("Fu2�Ĺ�������");
	}
}

class Son extends Fu2{
	
}
