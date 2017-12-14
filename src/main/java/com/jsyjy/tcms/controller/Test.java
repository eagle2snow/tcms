package com.jsyjy.tcms.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Test {

	/**
	 * 老师课程系统信息展示列表
	 * 
	 * @return 信息展示页面
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getAllTcmsInfo() {

		return "";
	}

	/**
	 * 老师课程系统信息展示列表
	 * 
	 * @return 信息展示页面 tcms2list.jsp
	 */
	@RequestMapping(value = "tcms2list4teacher", method = RequestMethod.GET)
	public String getAllTeachers(Model model) {

		//model.addAttribute("teachers", this.tcmsServiceImpl.getAllTeachers());

		return "tcms2list4teacher";
	}
}
