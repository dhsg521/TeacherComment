package com.teacher.entity;

import java.io.Serializable;

public class Academe implements Serializable{
	private String academe_id;
	private String academe_name;
	public String getAcademe_id() {
		return academe_id;
	}
	public void setAcademe_id(String academe_id) {
		this.academe_id = academe_id;
	}
	public String getAcademe_name() {
		return academe_name;
	}
	public void setAcademe_name(String academe_name) {
		this.academe_name = academe_name;
	}
}
