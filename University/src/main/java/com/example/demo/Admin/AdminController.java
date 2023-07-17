package com.example.demo.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.Student;
import com.example.demo.Student.StudentService;

@RestController
@RequestMapping(value="/Admin")
public class AdminController {
	
	@Autowired
	private AdminService as;
	
	@Autowired
	private StudentService ss;
	
	
	@GetMapping(value="/getAdmin")
	public List<Admin> getAllAdmin(){
		return as.getAllAdmins();
	}
	
	@GetMapping(value="/getAdmin/{id}")
	public Admin getAdminById(@PathVariable int id) {
		return as.getAdminById(id);
	}
	
	@PostMapping(value="/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return as.addAdmin(admin);
	}
	
	@PutMapping(value="/updateAdmin/{id}")
	public Admin updateAdmin(@PathVariable int id,@RequestBody Admin admin) {
		return as.updateAdmin(id, admin);
	}
	
	
	@DeleteMapping(value="/deleteAdmin/{id}")
	public String deleteAdmin(@PathVariable int id) {
		return as.deleteAdmin(id);
	}
	
	@GetMapping(value="/getStudent")
	public List<Student> getAllStudents(){
		return ss.getAllStudent();
	}
	
	@GetMapping(value="/getStudent/{id}")
	public Student getaStudent(@PathVariable int rollNo) {
		return ss.getStudentById(rollNo);
	}
	
	@PostMapping(value="/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return ss.addStudent(student);
	}
	
	@PutMapping(value="/updateStudent/{id}")
	public Student updateStudent(@PathVariable int rollNo, @RequestBody Student student) {
		return ss.updateStudent(rollNo, student);
	}
	
	@DeleteMapping(value="/deleteStudent/{}id")
	public String deleteStudent(@PathVariable int rollNo) {
		return ss.deleteStudent(rollNo);
	}
	
	

}
