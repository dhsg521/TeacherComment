package com.teacher.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.teacher.dao.TeacherDao;
import com.teacher.entity.Teacher;

@Service
public class TeacherServiceIml implements TeacherService{
	@Resource
	private TeacherDao teacherDao;
	public List<Teacher> showList(String academeId) {
		List<Teacher> list=teacherDao.findByAcademeId(academeId);
		return list;
	}
	
	public Teacher showTeacher(String teacherId) {
		Teacher teacher=teacherDao.findByTeacherId(teacherId);
		return teacher;
	}
}
