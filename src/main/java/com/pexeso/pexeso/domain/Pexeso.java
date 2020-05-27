package com.pexeso.pexeso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pexeso")
public class Pexeso {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="wortde")
	private String wortde;	
	
	@Column(name="wortsk")
	private String wortsk;
	
	public Pexeso() {
			
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

	public String getWortsk() {
		return wortsk;
	}

	public void setWortsk(String wortsk) {
		this.wortsk = wortsk;
	}

	@Override
	public String toString() {
		return "Pexeso [id=" + id + ", wortde=" + wortde + ", wortsk=" + wortsk + "]";
	}

	
}
