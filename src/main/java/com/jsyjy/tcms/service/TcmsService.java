package com.jsyjy.tcms.service;

import java.util.List;

import com.jsyjy.tcms.pojo.Course;
import com.jsyjy.tcms.pojo.Teacher;

/**
 * 老师课程管理系统服务层接口定义
 * 
 * @author yuyi
 * @date 2017年12月14日
 */
public interface TcmsService {

	/**
	 * 返回所有的老师信息
	 * 
	 * @return List<Teacher>
	 */
	List<Teacher> getAllTeachers();

	/**
	 * 返回所有的课程信息
	 * 
	 * @return List<Course>
	 */
	List<Course> getAllCourses();

	/**
	 * 添加老师信息
	 * 
	 * @param Teacher
	 * @return boolean
	 */
	boolean addTeacher(Teacher teacher);

	/**
	 * 添加课程信息
	 * 
	 * @param Course
	 * @return boolean
	 */
	boolean addCourse(Course course);

	/**
	 * 删除老师信息,通过老师的id
	 * 
	 * @param tno
	 * @return boolean
	 */
	boolean deleteTeacher2Id(String tno);

	/**
	 * 删除课程信息,通过课程的id
	 * 
	 * @param cno
	 * @return boolean
	 */
	boolean deleteCourse2Id(String cno);

	/**
	 * 更新老师信息,通过新的老师对象
	 * 
	 * @param Teacher
	 * @return boolean
	 */
	boolean updateTeacher2Id(Teacher teacher);

	/**
	 * 更新课程信息,通过新的课程对象
	 * 
	 * @param cno
	 * @return boolean
	 */
	boolean deleteCourse(Course course);

	/**
	 * 查询老师信息,通过老师的id
	 * 
	 * @param tno
	 * @return boolean
	 */
	Teacher queryTeacher2Id(String tno);

	/**
	 * 查询课程信息,通过课程的id
	 * 
	 * @param cno
	 * @return boolean
	 */
	Course queryCourse2Id(String cno);

}
