package com.itheima.test01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		// Scanner:扫描
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄");
		// 接收用户输入数据
		// nextInt()结束标记：空格，回车，tab键
		// next()结束标记：空格，回车，tab键
		// 不会过滤空格，回车，tab键
		int age = sc.nextInt(); 
		System.out.println("请输入姓名：");
		sc.nextLine();
		// nextLine()结束标记：回车,会过滤掉回车符
		String name = sc.nextLine();
		System.out.println("age = " + age + ",name = " + name);
	}
}
