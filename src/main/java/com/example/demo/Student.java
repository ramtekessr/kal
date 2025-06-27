package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	
	@Id
	@Column(name="studentid")
	private Integer studentid;
	
	@Column(name="studentname")
	private  String studentname;
	
	@Column(name="studentage")
	private Integer studentage;
	
	@Column(name="studentcity")
	private String studentcity;
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Integer getStudentage() {
		return studentage;
	}
	public void setStudentage(Integer studentage) {
		this.studentage = studentage;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
				+ ", studentcity=" + studentcity + "]";
	}
}