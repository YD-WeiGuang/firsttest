package com.itheima.test01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// ��������¼�����
		// Scanner:ɨ��
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		// �����û���������
		// nextInt()������ǣ��ո񣬻س���tab��
		// next()������ǣ��ո񣬻س���tab��
		// ������˿ո񣬻س���tab��
		int age = sc.nextInt(); 
		System.out.println("������������");
		sc.nextLine();
		// nextLine()������ǣ��س�,����˵��س���
		String name = sc.nextLine();
		System.out.println("age = " + age + ",name = " + name);
	}
}
