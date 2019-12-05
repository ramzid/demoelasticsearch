package com.dridi.demo.service;

import com.dridi.demo.model.Ingenieur;

public interface IngenieurService {
	public String save(Ingenieur ing);
	
	public Iterable<Ingenieur> findAll();
	
	public Iterable<Ingenieur> findByNom(String nom);


}
