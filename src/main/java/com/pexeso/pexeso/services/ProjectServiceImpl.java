package com.pexeso.pexeso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pexeso.pexeso.domain.Pexesoen;
import com.pexeso.pexeso.domain.Pexesosk;
import com.pexeso.pexeso.domain.Pexesosken;
import com.pexeso.pexeso.repositories.ProjectRepository;
import com.pexeso.pexeso.repositories.ProjectRepository2;
import com.pexeso.pexeso.repositories.ProjectRepository3;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	private ProjectRepository projectRepository;
	private ProjectRepository2 projectRepository2;
	private ProjectRepository3 projectRepository3;
	
	@Autowired
	public ProjectServiceImpl(ProjectRepository theProjectRepository,ProjectRepository2 theProjectRepository2,ProjectRepository3 theProjectRepository3 ) {	
		projectRepository=theProjectRepository;	
		projectRepository2=theProjectRepository2;
		projectRepository3=theProjectRepository3;	
	}
	
	@Override
	public List<Pexesosk> findAllSk() {

		return projectRepository.findAll();
	}
	
	@Override
	public List<Pexesoen> findAllEn() {

		return projectRepository2.findAll();
	}
	
	@Override
	public List<Pexesosken> findAllSkorEn() {

		return projectRepository3.findAll();
	}

}
