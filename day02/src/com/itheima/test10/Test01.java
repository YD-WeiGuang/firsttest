package com.itheima.test10;

/*
* ��������
* Ա����
	* Ա������,Ա��нˮ,Ա����������
* ������
	* ����Ա�����Ի�����˽���
	* ��������Ϊ��ӡ"����Ƶ�"
* ����Ա��
	* ���Ժ�Ա����������ͬ
   * ��������Ϊ��ӡ"�ϲ������"
* ��ʦ��
	* ���Ժ�Ա����������ͬ
	* ��������Ϊ��ӡ"����"
	
* ����
	* ����1������,2������Ա,1����ʦ,(�����˵�����ֵ���ⶨ��)
	* �����е�Ա������
	* ���������˵��������Ƕ���?
 */
public class Test01 {
	public static void main(String[] args) {
		// �����������
		Manager m = new Manager("�ɸ�", 18000, 20000);
		// ��������Ա����
		Waiter w1 = new Waiter("�仨",5000);
		Waiter w2 = new Waiter("�绨", 3500);
		// ��ʦ
		Cook c = new Cook("������", 10000);
		
		// ������Ա������
		m.work();
		w1.work();
		w2.work();
		c.work();
		// ���������˵��������Ƕ���?
		double sum = m.getSalary() + m.getBonus() + w1.getSalary() + w2.getSalary() + c.getSalary();
		System.out.println("��֧����" + sum);
	}
}
