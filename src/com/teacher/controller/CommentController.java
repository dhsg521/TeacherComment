package com.teacher.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teacher.entity.NoteResult;
import com.teacher.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
	@Resource
	private CommentService commentService;
	@RequestMapping("/more.do")
	@ResponseBody
	public NoteResult excute(String teacherId,String page){
		NoteResult result=commentService.findAll(teacherId, page);
		return result;
	}
}
