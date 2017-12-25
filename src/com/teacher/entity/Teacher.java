package com.teacher.entity;

import java.io.Serializable;

public class Teacher implements Serializable{
	private String teacher_id;
	private String teacher_name;
	private String teacher_img;
	private String teacher_introduce;
	private String phone_number;
	private String teacher_mail;
	private String academe_id;
	private String academic_title;
	private String research_area;
	private Academe academe;
	public String getTeacher_mail() {
		return teacher_mail;
	}
	public void setTeacher_mail(String teacher_mail) {
		this.teacher_mail = teacher_mail;
	}
	public Academe getAcademe() {
		return academe;
	}
	public void setAcademe(Academe academe) {
		this.academe = academe;
	}
	public String getAcademic_title() {
		return academic_title;
	}
	public void setAcademic_title(String academic_title) {
		this.academic_title = academic_title;
	}
	public String getResearch_area() {
		return research_area;
	}
	public void setResearch_area(String research_area) {
		this.research_area = research_area;
	}
	public String getTeacher_introduce() {
		return teacher_introduce;
	}
	public void setTeacher_introduce(String teacher_introduce) {
		this.teacher_introduce = teacher_introduce;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_img() {
		return teacher_img;
	}
	public void setTeacher_img(String teacher_img) {
		this.teacher_img = teacher_img;
	}

	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAcademe_id() {
		return academe_id;
	}
	public void setAcademe_id(String academe_id) {
		this.academe_id = academe_id;
	}
}
