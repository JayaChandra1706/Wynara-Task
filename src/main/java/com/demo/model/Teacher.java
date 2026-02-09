package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int teacher_id;
     private String name;
     private String username;
     private String password;
     
     public Teacher() {
		// TODO Auto-generated constructor stub
	}

	 public Teacher(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	 }

	 public int getTeacher_id() {
		 return teacher_id;
	 }

	 public void setTeacher_id(int teacher_id) {
		 this.teacher_id = teacher_id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getUsername() {
		 return username;
	 }

	 public void setUsername(String username) {
		 this.username = username;
	 }

	 public String getPassword() {
		 return password;
	 }

	 public void setPassword(String password) {
		 this.password = password;
	 }

	 @Override
	 public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", name=" + name + ", username=" + username + ", password="
				+ password + "]";
	 }
     
     
}
