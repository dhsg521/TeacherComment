package com.teacher.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teacher.entity.Comments;
import com.teacher.entity.NoteResult;
import com.teacher.entity.Teacher;
import com.teacher.service.CommentService;
import com.teacher.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	@Resource
	private TeacherService teacherService;
	@Resource
	private CommentService commentService;
	
	@RequestMapping("/showList.do")
	public ModelAndView showList(String academeId,String teacherId){
		ModelAndView mav = new ModelAndView();
		List<Teacher> teacherList=teacherService.showList(academeId);
		if (teacherList != null){
			mav.addObject("teacherList", teacherList);
			mav.setViewName("showTeacherList");
		}
		else{
			mav.setViewName("false");
		}
		return mav;
	}
	
	@RequestMapping("/showTeacher.do")
	public ModelAndView showTeacher(String teacherId){
		ModelAndView mav=new ModelAndView();
		Teacher teacher=teacherService.showTeacher(teacherId);
		NoteResult result=commentService.findAll(teacherId,"1");
		if(teacher!=null){
			mav.addObject("teacher",teacher);
			mav.addObject("commentList",result.getData());
			mav.setViewName("showTeacher");
		}else{
			mav.setViewName("erro");
		}
		return mav;
	}
}
