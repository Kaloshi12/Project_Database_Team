package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class StudentModel {
	@Id()
	private int Student_id;
	@Column(name="Student_name")
	private String name;
	@Column(name="Studen_name")
	private String lastname;
	public StudentModel(int id, String name, String lastname) {
		super();
		this.Student_id = id;
		this.name = name;
		this.lastname = lastname;
	}
	public int getId() {
		return Student_id;
	}
	public void setId(int id) {
		this.Student_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
