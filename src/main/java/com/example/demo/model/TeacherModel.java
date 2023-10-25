package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Teacher")
public class TeacherModel {
	@Id
	private int TeachID;
	@Column(name="Teacher name")
	private String Tname;
	@Column(name="Teacher Surname")
	private String TSurname;
	private int age;
	
	public TeacherModel(int teachID, String tname, String tSurname, int age) {
		super();
		TeachID = teachID;
		Tname = tname;
		TSurname = tSurname;
		this.age = age;
	}
	public int getTeachID() {
		return TeachID;
	}
	public void setTeachID(int teachID) {
		TeachID = teachID;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTSurname() {
		return TSurname;
	}
	public void setTSurname(String tSurname) {
		TSurname = tSurname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
