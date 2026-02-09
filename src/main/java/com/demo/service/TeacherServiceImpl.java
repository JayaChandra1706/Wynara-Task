package com.demo.service;

import com.demo.dao.TeacherDao;
import com.demo.dao.TeacherDaoImpl;
import com.demo.model.Teacher;

public class TeacherServiceImpl implements TeacherService{
	
	public TeacherDao dao;
	
	public TeacherServiceImpl() {
		dao=new TeacherDaoImpl();
	}

	@Override
	public void addTeacher(Teacher tch) {
	   dao.beginTransaction();
	   dao.addTeacher(tch);
	   dao.commitTransaction();
	}

	@Override
	public void updateTeacher(Teacher tch) {
		// TODO Auto-generated method stub
		  dao.beginTransaction();
		   dao.updateTeacher(tch);
		   dao.commitTransaction();
		
	}

	@Override
	public Teacher fetchTeacher(int id) {
		Teacher tch=dao.fetchTeacher(id);
		return tch;
	}
    
}
