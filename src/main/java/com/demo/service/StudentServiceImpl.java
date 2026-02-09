package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;

public class StudentServiceImpl implements StudentService{

	public StudentDao dao;
	
	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}
	@Override
	public void addStudent(Student std) {
		dao.beginTransaction();
		dao.addStudent(std);
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(Student std) {
		dao.beginTransaction();
		dao.updateStudent(std);
		dao.commitTransaction();
	}


	@Override
	public Student fetchStudent(int id) {
		Student std=dao.fetchStudent(id);
		return std;
	}

}
