package com.example.demo.Student;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {
	
	@Id
	private int roolNo;
	private String name;
	private int standart;
	private double score;
	private String result;
	public int getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandart() {
		return standart;
	}
	public void setStandart(int standart) {
		this.standart = standart;
	}

	
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student(int roolNo, String name, int standart,String result,double score) {
		this.roolNo = roolNo;
		this.name = name;
		this.standart = standart;
		this.result = result;
		this.score = score;
	}
	public Student() {
	}
	
	
	
	
	

}
