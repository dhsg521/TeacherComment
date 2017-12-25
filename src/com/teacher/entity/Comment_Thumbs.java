package com.teacher.entity;

import java.io.Serializable;

public class Comment_Thumbs implements Serializable{
	private String comment_thumbs_id;
	private String user_id;
	private String comment_id;
	public String getComment_thumbs_id() {
		return comment_thumbs_id;
	}
	public void setComment_thumbs_id(String comment_thumbs_id) {
		this.comment_thumbs_id = comment_thumbs_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}

}
