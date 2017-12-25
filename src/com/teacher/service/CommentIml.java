package com.teacher.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.teacher.dao.CommentDao;
import com.teacher.entity.Comments;
import com.teacher.entity.NoteResult;

@Service
public class CommentIml implements CommentService{

	@Resource
	private CommentDao commentDao;
	@Override
	public NoteResult findAll(String teacherId,String page) {
		int pages=Integer.parseInt(page);
		pages=(pages-1)*10;
		System.out.println(pages);
		page=String.valueOf(pages);
		List<Comments>  list=commentDao.findByTeacherIdOrderTime(teacherId,page);
		NoteResult result=new NoteResult();
		result.setStatus(0);
		result.setData(list);
		return result;
	}

}
