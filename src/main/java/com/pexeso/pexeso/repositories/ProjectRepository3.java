package com.pexeso.pexeso.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pexeso.pexeso.domain.Pexesosken;

@Repository
public interface ProjectRepository3 extends CrudRepository<Pexesosken,Integer> {
	
	public List<Pexesosken> findAll();

}
