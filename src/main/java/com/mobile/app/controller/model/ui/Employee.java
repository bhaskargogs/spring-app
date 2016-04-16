package com.mobile.app.controller.model.ui;

public class Employee {
	private String eid;
	private String name;
	private String email;
	private String designation;
	private int age;
	private String photo;

	public Employee() {

	}

	public Employee(String eid, String name, String email, String designation, int age, String photo) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.age = age;
		this.photo = photo;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", designation=" + designation
				+ ", age=" + age + ", photo=" + photo + "]";
	}

}
