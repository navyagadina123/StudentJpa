package com.cg.spa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stu_tbl")
public class Student {
	@Id
	Integer studentId;
	@Column(name="snmae",length=20)
	String studentName;
	@Column(name="saddrs",length=20)
	String studentaddress;
	
	public Student() {
		super();
	}

	public Student(Integer studentId, String studentName, String studentaddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentaddress = studentaddress;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentaddress() {
		return studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentaddress=" + studentaddress
				+ "]";
	}
	

}
