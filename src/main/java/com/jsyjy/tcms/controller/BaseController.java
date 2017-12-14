package com.jsyjy.tcms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * 基础的前端控制层常用对象
 * 
 * @author yuyi
 * @date 2017年12月14日
 */
@Controller
public class BaseController {

	/**
	 * 得到ModelAndView
	 * 
	 * @return
	 */
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}
}
