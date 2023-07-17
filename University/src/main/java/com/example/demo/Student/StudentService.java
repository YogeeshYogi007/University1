package com.example.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository sr;
	
	
	@Autowired
	public StudentService(StudentRepository sr) {
		this.sr = sr;
	}
	
	
	public List<Student> getAllStudent(){
		return sr.findAll();
	}
	
	public Student getStudentById(int rollNo) {
		return sr.findById(rollNo).get();
	}
	
	public Student addStudent(Student student) {
		return sr.save(student);
	}
	
	public Student updateStudent(int rollNo, Student student) {
		Student student1 = sr.findById(rollNo).get();
		student1.setRoolNo(student.getRoolNo());
		student1.setName(student.getName());
		student1.setStandart(student.getStandart());
		student1.setResult(student.getResult());
		student1.setScore(student.getScore());
		sr.save(student1);
		return student1;
	}
	
	public String deleteStudent(int rollNo) {
		Student s1= sr.findById(rollNo).get();
		sr.delete(s1);
		return "Student Deleted Successfully !!!";
	}
}
