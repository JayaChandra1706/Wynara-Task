package com.demo.dao;



import com.demo.model.Student;

public interface StudentDao {
	 void addStudent(Student std);
     void updateStudent(Student std);
     Student fetchStudent(int id);
     void beginTransaction();
     void commitTransaction();
}
