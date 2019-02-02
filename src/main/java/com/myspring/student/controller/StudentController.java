package com.myspring.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.student.model.Student;
import com.myspring.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/addStudent")
	public Student addStudentDetails(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PutMapping("/updateStudent")
	public Student updateStudentDetails(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@GetMapping("/getStudent/{studentId}")
	public Student getStudentDetails(@PathVariable("studentId") int studentId) {
		return studentService.getStudent(studentId);
	}

	@GetMapping("/getAllStudents")
	public List<Student> getAllStudentDetails() {
		return studentService.getAllStudents();
	}

	@DeleteMapping("/deleteStudent/{studentId}")
	public void deleteStudentDetail(@PathVariable("studentId") int studentId) {
		studentService.deleteStudent(studentId);
	}

}
