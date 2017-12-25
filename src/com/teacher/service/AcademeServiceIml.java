package com.teacher.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.teacher.dao.AcademeDao;
import com.teacher.entity.Academe;
@Service
public class AcademeServiceIml implements AcademeService{
	@Resource
	private AcademeDao academeDao;
	
	//��ȡѧԺ����
	public List<Academe> showList() {
		List<Academe> list=academeDao.findAll();
		return list;
	}
}
