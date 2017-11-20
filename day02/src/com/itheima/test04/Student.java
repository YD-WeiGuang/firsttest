package com.itheima.test04;

public class Student extends Person{
	// 成绩
	private double score;
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}



	public void study(){
		System.out.println("好好学习,day day up");
	}
}
