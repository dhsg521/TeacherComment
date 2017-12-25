package com.teacher.test;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teacher.dao.AcademeDao;
import com.teacher.dao.CommentDao;
import com.teacher.dao.TeacherDao;
import com.teacher.entity.Academe;
import com.teacher.entity.Comments;
import com.teacher.entity.Teacher;
import com.teacher.service.AcademeService;

public class TestMybits {
	public static void main(String[] args){
		String conf="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
		CommentDao as=ac.getBean("commentDao",CommentDao.class);
		List<Comments> tc=as.findByTeacherIdOrderHot("1","0");
		for(Comments a:tc){
			System.out.println(a.getComment_id());
		}
		System.out.println(tc.get(0).getComment_id());
		}
}
