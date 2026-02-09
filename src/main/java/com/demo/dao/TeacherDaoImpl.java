package com.demo.dao;

import javax.persistence.EntityManager;

import com.demo.model.Teacher;

public class TeacherDaoImpl implements TeacherDao{
private EntityManager entity;
	
	public TeacherDaoImpl() {
		entity=JPAUtil.getEntity();
	}

	@Override
	public void addTeacher(Teacher tch) {
		entity.persist(tch);
	}

	@Override
	public void updateTeacher(Teacher tch) {
		entity.merge(tch);
	}

	@Override
	public Teacher fetchTeacher(int id) {
		Teacher tch=entity.find(Teacher.class, id);
		return tch;
	}

	@Override
	public void beginTransaction() {
		entity.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
	    entity.getTransaction().commit();
	}
}
