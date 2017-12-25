package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Teacher;

public interface TeacherDao {
	public List<Teacher> findByAcademeId(String academe_id);
	public Teacher findByTeacherId(String teacher_id);
}
