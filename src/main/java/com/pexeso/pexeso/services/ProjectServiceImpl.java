package com.pexeso.pexeso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pexeso.pexeso.domain.Pexeso;
import com.pexeso.pexeso.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	private ProjectRepository projectRepository;
	
	@Autowired
	public ProjectServiceImpl(ProjectRepository theProjectRepository) {	
		projectRepository=theProjectRepository;	
	}
	
	@Override
	public List<Pexeso> findAll() {

		return projectRepository.findAll();
	}

}
