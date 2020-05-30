package com.pexeso.pexeso.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pexeso.pexeso.domain.Pexesoen;

@Repository
public interface ProjectRepository2 extends CrudRepository<Pexesoen,Integer> {
	
	public List<Pexesoen> findAll();

}
