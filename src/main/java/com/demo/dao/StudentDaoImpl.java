package com.demo.dao;


import javax.persistence.EntityManager;


import com.demo.model.Student;



public class StudentDaoImpl implements StudentDao{
private EntityManager entity;
	
	public StudentDaoImpl() {
		entity=JPAUtil.getEntity();
	}

	@Override
	public void addStudent(Student std) {
		entity.persist(std);
	}

	@Override
	public void updateStudent(Student std) {
		entity.merge(std);
	}

	@Override
	public Student fetchStudent(int id) {
		Student std=entity.find(Student.class, id);
		return std;
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
