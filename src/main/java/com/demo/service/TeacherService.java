package com.demo.service;

import com.demo.model.Teacher;

public interface TeacherService {
	void addTeacher(Teacher tch);
	void updateTeacher(Teacher tch);
	Teacher fetchTeacher(int id);
}
