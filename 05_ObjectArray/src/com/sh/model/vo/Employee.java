package com.sh.model.vo;

//Model : 데이터 관련 부븐을 처리하는 역할
//VO : 데이터를 담아둘 수 있는 용도의 클래스

public class Employee {
	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	

public Employee() {
	
}

public Employee(int empNo, String empName, String dept, String job, int age, 
				char gender, int salary, double bonusPoint, String phone, String address) {
	

	this.empNo = empNo;
	this.empName = empName;
	this.dept = dept;
	this.job = job;
	this.age = age;
	this.gender = gender;
	this.salary = salary;
	this.bonusPoint = bonusPoint;
	this.phone = phone;
	this.address = address;
	
}

public void setEmpNo(int empNo) {
	this.empNo = empNo;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public void setDept(String dept) {
	this.dept = dept;
}

public void setJob(String job) {
	this.job = job;
}

public void setAge(int age) {
	this.age = age;
	
}

public void setGender(char gender) {
	this.gender = gender;
	
}

public void setSalary(int salary) {
	this.salary = salary;
}

public void setBonusPoint(double bonusPoint) {
	this.bonusPoint = bonusPoint;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public void setAddress(String address) {
	this.address = address;
}

public int getEmpNo() {
	return empNo;
}

public String getEmpName() {
	return empName;
}

public int getAge() {
	return age;
}

public String getDept() {
	return dept;
}

public String getJob() {
	return job;
}

public char getGender() {
	return gender;
}

public int getSalary() {
	return salary;
}

public double getBonusPoint() {
	return bonusPoint;
}

public String getPhone() {
	return phone;
}

public String getAddress() {
	return address;
}

public String infornmation() {
	
	return "사번 : " +  empNo + ", 사원명 : " + empName + ", 소속부서 : " + dept + ", 직급 : " + job + ", 나이 : " +
			", 성별 : " + gender + ", 급여 : " + salary + ", 보너스 포인트 : " + bonusPoint + ", 전화번호 : " + phone + ", 주소 :" + address;
		

		}
}

