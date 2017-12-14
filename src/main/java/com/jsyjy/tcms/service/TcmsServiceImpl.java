package com.jsyjy.tcms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsyjy.tcms.mapper.CourseMapper;
import com.jsyjy.tcms.mapper.TeacherMapper;
import com.jsyjy.tcms.pojo.Course;
import com.jsyjy.tcms.pojo.Teacher;

/**
 * 老师课程管理系统接口实现
 * 
 * @author yuyi
 * @date 2017年12月14日
 */
@Service
public class TcmsServiceImpl implements TcmsService {

	@Autowired
	private TeacherMapper teacherMapper;

	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Teacher> getAllTeachers() {

		return this.teacherMapper.selectByExample(null);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseMapper.selectByExample(null);
	}

	@Override
	public boolean addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherMapper.insert(teacher) > 0;
	}

	@Override
	public boolean addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.insert(course) > 0;
	}

	@Override
	public boolean deleteTeacher2Id(String tno) {
		// TODO Auto-generated method stub
		return teacherMapper.deleteByPrimaryKey(tno) > 0;
	}

	@Override
	public boolean deleteCourse2Id(String cno) {
		// TODO Auto-generated method stub
		return courseMapper.deleteByPrimaryKey(cno) > 0;
	}

	@Override
	public boolean updateTeacher2Id(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherMapper.updateByPrimaryKey(teacher) > 0;
	}

	@Override
	public boolean deleteCourse(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.updateByPrimaryKey(course) > 0;
	}

	@Override
	public Teacher queryTeacher2Id(String tno) {
		// TODO Auto-generated method stub
		return teacherMapper.selectByPrimaryKey(tno);
	}

	@Override
	public Course queryCourse2Id(String cno) {
		// TODO Auto-generated method stub
		return courseMapper.selectByPrimaryKey(cno);
	}

}
