package com.pexeso.pexeso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pexesoen")
public class Pexesoen {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="wortde")
	private String wortde;	
	
	@Column(name="wort")
	private String wort;
	
	public Pexesoen() {
			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWortde() {
		return wortde;
	}

	public void setWortde(String wortde) {
		this.wortde = wortde;
	}

	public String getWort() {
		return wort;
	}

	public void setWort(String wort) {
		this.wort = wort;
	}

	@Override
	public String toString() {
		return "Pexeso [id=" + id + ", wortde=" + wortde + ", wort=" + wort + "]";
	}

	
}
