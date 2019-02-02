package com.myspring.student.service;

import java.util.List;

import com.myspring.student.model.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	Student updateStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudent(int studID);
	
	void deleteStudent(int studID);

}
