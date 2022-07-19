package com.iu.lang.string.ex1;

public class WorkerDTO {	//Data Transfer Object	계층간 데이터 교환을 하기 위해 사용하는 객체
							//getter setter만 가지는 클래스
							//VO (Value Object) dto와 유사하지만 dto는 setter를 가지고 있어 값이 변할수 있습니다. 오직 읽기만 가능

	//멤버변수의 접근지정자
	private String name;		//이름
	private String department;	//부서명
	private String job;			//직급
	private String phone;		//전화번호
	
	//생성자는 기본 생성자 필수
	
	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
