package com.teacher.entity;

import java.io.Serializable;

public class User implements Serializable {
	private String user_id;
	private String oppenId;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getOppenId() {
		return oppenId;
	}
	public void setOppenId(String oppenId) {
		this.oppenId = oppenId;
	}
	
}
