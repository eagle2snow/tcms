package com.jsyjy.tcms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsyjy.tcms.pojo.Course;
import com.jsyjy.tcms.pojo.Teacher;
import com.jsyjy.tcms.service.TcmsServiceImpl;

/**
 * 老师课程管理系统的前端控制层
 * 
 * @author yuyi
 * @date 2017年12月14日
 */
@Controller
public class TcmsController extends BaseController {

	@Autowired(required = false)
	private TcmsServiceImpl tcmsServiceImpl;

	/**
	 * 老师课程系统信息展示列表
	 * 
	 * @param page
	 * @throws Exception
	 */
	@RequestMapping(value = "/tcms1")
	public ModelAndView list() {
		ModelAndView mv = this.getModelAndView();
		List<Teacher> teachers = this.tcmsServiceImpl.getAllTeachers();
		List<Course> courses = tcmsServiceImpl.getAllCourses();

		if (null != teachers && !"".equals(teachers)) {
			mv.setViewName("tcms2list4teacherpage");
			mv.addObject("teachers", teachers);
		}
		if (null != courses && !"".equals(courses)) {
			mv.addObject("courses", courses);
		}
		return mv;
	}

	/**
	 * 老师课程系统信息展示列表
	 * 
	 * @param page
	 * @throws Exception
	 */
	@RequestMapping(value = "/tcms")
	public ModelAndView test() {
		ModelAndView mv = this.getModelAndView();
		Teacher teacher = this.tcmsServiceImpl.queryTeacher2Id("3-105");
		if (null != teacher && !"".equals(teacher)) {
			mv.setViewName("tcms2list4teacherpage");
			mv.addObject("teachers", teacher);
		}
		return mv;
	}
}
