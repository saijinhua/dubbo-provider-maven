package com.mr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.entity.Student;
import com.mr.mapper.StudentMapper;
import com.mr.service.StudentService;

@Service(value="studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public Student selectByStudentName(String name) {
		System.out.println("接口调用成功，传递的姓名为:"+name);
		Student student = studentMapper.selectByStudentName(name);
		return student;
	}

}
