package com.pexeso.pexeso.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pexeso.pexeso.domain.Pexesoen;
import com.pexeso.pexeso.domain.Pexesosk;
import com.pexeso.pexeso.domain.Pexesosken;
import com.pexeso.pexeso.services.ProjectService;

@RestController
@RequestMapping("/api/pexeso")
@CrossOrigin //Important to get acces from react app to server
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	public ProjectController(ProjectService TheprojectService) {
		
	this.projectService = TheprojectService;
	}
	
	@GetMapping("/all/sk")
	public List<Pexesosk> getAllWortsSk(){
	return projectService.findAllSk();
		}
	
	@GetMapping("/all/en")
	public List<Pexesoen> getAllWortsEn(){
	return projectService.findAllEn();
		}
	
	@GetMapping("/all/sken")
	public List<Pexesosken> findAllSkorEn(){
	return projectService.findAllSkorEn();
		}


}
