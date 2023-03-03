package com.greedy.level03.hard.emp.run;

import java.util.Scanner;

import com.greedy.level02.normal.student.model.vo.StudentVO;
import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("부서 : ");
		String dept = sc.next();
		System.out.print("직업 :");
		String job = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("임금 : ");
		int salary = sc.nextInt();
		System.out.print("보너스 : ");
		double bonusPoint = sc.nextFloat();
		System.out.print("전화번호 : ");
		String phone = sc.next();
		String phone2 = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		

		EmployeeDTO employee = new EmployeeDTO();
	
		employee.setNumber(number);
		employee.setName(name);
		employee.setDept(dept);
		employee.setJob(job);
		employee.setAge(age);
		employee.setGender(gender);
		employee.setSalary(salary);
		employee.setBonusPoint(bonusPoint);
		employee.setPhone(phone);
		employee.setAddress(address);
		
		System.out.println(employee.getNumber());
		System.out.println(employee.getName());
		System.out.println(employee.getDept());
		System.out.println(employee.getJob());
		System.out.println(employee.getAge());
		System.out.println(employee.getGender());
		System.out.println(employee.getSalary());
		System.out.println(employee.getBonusPoint());
		System.out.println(employee.getPhone());
		System.out.println(employee.getAddress());
		
	}

}
