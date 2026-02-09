package com.demo.service;



import com.demo.model.Student;

public interface StudentService {
	void addStudent(Student std);
	void updateStudent(Student std);
	Student fetchStudent(int id);
}
