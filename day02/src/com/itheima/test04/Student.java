package com.itheima.test04;

public class Student extends Person{
	// �ɼ�
	private double score;
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}



	public void study(){
		System.out.println("�ú�ѧϰ,day day up");
	}
}
