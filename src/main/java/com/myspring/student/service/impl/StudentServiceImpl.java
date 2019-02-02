package com.myspring.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.student.model.Student;
import com.myspring.student.repository.StudentRepository;
import com.myspring.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> allStudents = new ArrayList<>();
		studentRepository.findAll().forEach(allStudents::add);
		return allStudents;
	}

	@Override
	public Student getStudent(int studID) {
		return studentRepository.findOne(studID);
	}

	@Override
	public void deleteStudent(int studID) {
		 studentRepository.delete(studID);
	}

}
