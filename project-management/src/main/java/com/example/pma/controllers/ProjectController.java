package com.example.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pma.dao.ProjectRepository;
import com.example.pma.entities.project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

@Autowired	
ProjectRepository ProRepo;	
	
	
@GetMapping("/new")
public String displayProjectForm(Model model) {
	project proj = new project();
	model.addAttribute("project", proj);
	return "new-project";
}

@PostMapping("/save")
public String createProject(project proj, Model model){
	//this should handle saving to the DB.
	ProRepo.save(proj);
	return "redirect:/projects/new";
}
	
}