package com.teacher.service;

import java.util.List;

import com.teacher.entity.Teacher;

public interface TeacherService {
	public List<Teacher> showList(String academeId);
	public Teacher showTeacher(String teacherId);
}
