package com.teacher.entity;

import java.io.Serializable;

public class Comments implements Serializable{
	private String comment_id;
	private String grade;
	private String teacher_id;
	private String user_id;
	private String comment_time;
	private String comment_desc;
	private int comment_Thumbs_Size;
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getComment_time() {
		return comment_time;
	}
	public void setComment_time(String comment_time) {
		this.comment_time = comment_time;
	}
	public String getComment_desc() {
		return comment_desc;
	}
	public void setComment_desc(String comment_desc) {
		this.comment_desc = comment_desc;
	}
	public int getComment_Thumbs_Size() {
		return comment_Thumbs_Size;
	}
	public void setComment_Thumbs_Size(int comment_Thumbs_Size) {
		this.comment_Thumbs_Size = comment_Thumbs_Size;
	}
}
