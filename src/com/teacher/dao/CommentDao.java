package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Comments;

public interface CommentDao {
	public List<Comments> findByTeacherIdOrderHot(String teacher_id,String page);
	public List<Comments> findByTeacherIdOrderTime(String teacher_id,String page);
	public int findThumbsByCommentId(String comment_id);
}
