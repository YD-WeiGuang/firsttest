package com.itheima.test08;


/*
   this�ؼ��ֵ�����
  	* ���ֳ�Ա�����;ֲ�����ͬ�����
  	* ����ǰ���������
  	* ���ñ�����������췽��
  	* ���ʱ����������Ա(��Ա�����ͳ�Ա����)
  		* this.��Ա����; ���ڱ����в��ң������Ҳ�����ȥ�����ң��������Ҳû���򱨴�
  		* this.��Ա����(); �ȵ��ñ����ģ������Ҳ���������ø���ģ��������û���򱨴�
 
    this���ñ������췽����ע������
  		* �������ڹ��췽���е�һ����Ч���
 		* �����ڷǹ��췽����ͨ��this���ñ��๹�췽����

	��������������ͬ���ĳ�Ա����ʱ�����Ҫ���ʸ���ĳ�Ա������Ҫͨ��
		* super.��Ա������; ֱ��ȥ�����в���ָ���ĳ�Ա���������������û�У��򱨴�
		* super.��Ա����(); ֱ��ȥ�����в���ָ���ĳ�Ա���������û���ҵ����򱨴�
 */
class Person {
	// ����
	public String name;
	
	public Person(String name){
		this.name = name;
	}
	public Person(){}
	
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Student extends Person{
	// ѧ��
	private String no;
	// ����
	private int age;
	// ����
	public String name;
	
	
	public Student(String name, int age, String no) {
		this(name,age);
		System.out.println("��������");
		this.no = no;
	}
	public Student(String name, int age) {
		super("jack");
		System.out.println("��������");
		this.name = name;
		this.age = age;
	}
	
	public Student(String name) {
		System.out.println("1������");
		this.name = name;
	}
	
	public Student() {
		System.out.println("�޲���");
	}
	
	
	// setter & getter
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	
	
	// ��ʾ��Ϣ����
	public void showInfo(){
		// String name  = "jack";
		// name ���ڷ����ڲ������Ƿ���name���������û���ҵ�������ĳ�Աλ��ȥ����name��Ա������
		// this.name ֱ��ȥ����ĳ�Աλ�ò��ҳ�Ա����name
		// ֱ��дname  ����ԭ�򣺾ͽ�ԭ�� (������ > �����Ա���� > �����Աλ��)
		System.out.println(name); 
		System.out.println(this.name);
		System.out.println(super.name); 
		
		System.out.println("---------------");
		System.out.println(this.getName()); // rose
		// System.out.println(super.getName()); // jack
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Student stu = new Student("rose",20,"10086");
		stu.showInfo();
	}
}
