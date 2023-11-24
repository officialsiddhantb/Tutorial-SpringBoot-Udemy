package com.example.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.pma.dao.ProjectRepository;
import com.example.pma.entities.project;

@Controller
public class HomeController {

@Autowired
ProjectRepository proRepo;	
	
	
@GetMapping("/")
public String displayHome(Model model) {
	List<project> projects = proRepo.findAll();
	model.addAttribute("aProject", projects);
	return "home";
}
}