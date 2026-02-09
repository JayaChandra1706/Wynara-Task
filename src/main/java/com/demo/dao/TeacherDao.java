package com.demo.dao;

import com.demo.model.Teacher;
public interface TeacherDao {
	void addTeacher( Teacher tch);
    void updateTeacher(Teacher tch);
    Teacher fetchTeacher(int id);
    void beginTransaction();
    void commitTransaction();
}
