package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Student")
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@GetMapping(value="/get/{id}")
	public Student view(@PathVariable int roolNo) {
		Student s1=ss.getStudentById(roolNo);
		return s1;
	}
}
