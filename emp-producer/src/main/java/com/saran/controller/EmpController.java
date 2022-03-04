package com.saran.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saran.model.Employee;

@RestController
public class EmpController {
	
	@GetMapping("/")
	public Employee displayAllEmps() {
		Employee e1=new Employee();
		e1.setEmpId(1);e1.setEmpName("Saran");e1.setEmpAddress("Pittsburgh");
		return e1;
	}

}
