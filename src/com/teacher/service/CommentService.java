package com.teacher.service;

import java.util.List;


import com.teacher.entity.NoteResult;

public interface CommentService {
	public NoteResult findAll(String teacherId,String page);
}
