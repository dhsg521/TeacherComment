package com.teacher.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teacher.entity.Academe;
import com.teacher.service.AcademeService;

@Controller
@RequestMapping("/academe")
public class AcademeController {
	@Resource
	private AcademeService academeService;
	@RequestMapping("/showList.do")
	public ModelAndView showList(){
		ModelAndView mav=new ModelAndView();
		List<Academe> academeList=academeService.showList();
		if (academeList != null){
			mav.addObject("academeList", academeList);
			mav.setViewName("showAcademeList");
		}
		else{
			mav.setViewName("false");
		}
		return mav;
	}
}
