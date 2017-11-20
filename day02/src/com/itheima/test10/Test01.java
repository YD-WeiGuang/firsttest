package com.itheima.test10;

/*
* 需求描述
* 员工类
	* 员工姓名,员工薪水,员工工作方法
* 经理类
	* 除了员工属性还多加了奖金
	* 工作方法为打印"管理酒店"
* 服务员类
	* 属性和员工的属性相同
   * 工作方法为打印"上菜与结账"
* 厨师类
	* 属性和员工的属性相同
	* 工作方法为打印"做饭"
	
* 测试
	* 共有1个经理,2个服务员,1个厨师,(所有人的属性值任意定义)
	* 让所有的员工工作
	* 并求所有人的总收入是多少?
 */
public class Test01 {
	public static void main(String[] args) {
		// 创建经理对象
		Manager m = new Manager("飞哥", 18000, 20000);
		// 创建服务员对象
		Waiter w1 = new Waiter("翠花",5000);
		Waiter w2 = new Waiter("如花", 3500);
		// 厨师
		Cook c = new Cook("风清扬", 10000);
		
		// 让所有员工工作
		m.work();
		w1.work();
		w2.work();
		c.work();
		// 并求所有人的总收入是多少?
		double sum = m.getSalary() + m.getBonus() + w1.getSalary() + w2.getSalary() + c.getSalary();
		System.out.println("总支出：" + sum);
	}
}
