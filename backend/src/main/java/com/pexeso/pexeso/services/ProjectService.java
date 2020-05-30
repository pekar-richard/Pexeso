package com.pexeso.pexeso.services;

import java.util.List;

import com.pexeso.pexeso.domain.Pexesoen;
import com.pexeso.pexeso.domain.Pexesosk;
import com.pexeso.pexeso.domain.Pexesosken;


public interface ProjectService {

	public List<Pexesosk> findAllSk();
	public List<Pexesoen> findAllEn();
	public List<Pexesosken> findAllSkorEn();
}
