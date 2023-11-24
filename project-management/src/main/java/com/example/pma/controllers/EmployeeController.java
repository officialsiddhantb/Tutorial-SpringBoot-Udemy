package com.example.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pma.dao.EmployeeRepository;
import com.example.pma.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
@Autowired
EmployeeRepository empRepo;


@GetMapping("/new")
public String displayEmployeeForm(Model model) {
	Employee emp = new Employee();
	model.addAttribute("employee", emp);
	return "new-employee";
	
}

@PostMapping("/save")
public String createEmployee(Employee emp, Model model) {
	empRepo.save(emp);
	return "redirect:/employees/new";
	
}

}