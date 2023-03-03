package com.greedy.section03.filterstream.dto;

public class MemberDTO  implements java.io.Serializable{

	private String id;
	private String pwd;
	private String name;
	private String eamil;
	private int age;
	private char gender;
	/* 직렬화에서 제외하고 싶은 필드에 transient 키워드를 사용한다. */
	private transient double point;
	
	public MemberDTO() {}

	public MemberDTO(String id, String pwd, String name, String eamil, int age, char gender, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.eamil = eamil;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", eamil=" + eamil + ", age=" + age
				+ ", gender=" + gender + ", point=" + point + "]";
	}
	
	
	
	
}
