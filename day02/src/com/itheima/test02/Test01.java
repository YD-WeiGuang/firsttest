package com.itheima.test02;

public class Test01 {
	public static void main(String[] args) {
		// �����������
		Pet pet = new Pet("����", "ʺ��ɫ");
		// �����˶���
		Person p = new Person("����", 23, pet);
		// ���÷���
		p.showInfo();
	}
}
