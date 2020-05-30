package com.pexeso.pexeso.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pexeso.pexeso.domain.Pexesosk;

@Repository
public interface ProjectRepository extends CrudRepository<Pexesosk,Integer> {
	
	public List<Pexesosk> findAll();

}
