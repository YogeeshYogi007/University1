package com.example.demo.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	private final AdminRepository ar;
	
	@Autowired
	public AdminService(AdminRepository ar) {
		this.ar = ar;
	}
	
	
	public List<Admin> getAllAdmins(){
		return ar.findAll();
	}
	
	public Admin getAdminById(int id) {
		return ar.findById(id).get();
	}
	
	public Admin updateAdmin(int id,Admin admin) {
		Admin a1 = ar.findById(id).get();
		a1.setId(admin.getId());
		a1.setName(admin.getName());
		a1.setPassword(admin.getPassword());
		ar.save(a1);
		return a1;
	}
	
	public Admin addAdmin(Admin admin) {
		ar.save(admin);
		return admin;
	}
	
	public String deleteAdmin(int id) {
		Admin a3 = ar.findById(id).get();
		ar.delete(a3);
		return "Admin Deleted Successfully !!";
	}
}
