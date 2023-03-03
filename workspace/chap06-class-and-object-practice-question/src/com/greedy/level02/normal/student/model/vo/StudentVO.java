package com.greedy.level02.normal.student.model.vo;

public class StudentVO {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	public StudentVO() {}
	
	public StudentVO(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void  setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGendet(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom; 
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	
	public String printInformation() {
		return  this.grade +" "
				+ this.classroom +" "
				+this.name +" "
				+ this.height + " "
				+ this.gender ;
	}
}
