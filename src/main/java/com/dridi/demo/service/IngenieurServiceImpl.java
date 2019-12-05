package com.dridi.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dridi.demo.model.Ingenieur;
import com.dridi.demo.repository.IngenieurRepository;
@Service
public class IngenieurServiceImpl implements IngenieurService {
   
	@Autowired
	IngenieurRepository ingenieurRepsitory;
	
	@Override
	public String save(Ingenieur ing) {
		// TODO Auto-generated method stub
		 ingenieurRepsitory.save(ing);
		 
		 return ing.toString();
	}

	@Override
	public Iterable<Ingenieur> findAll() {
		// TODO Auto-generated method stub
		return ingenieurRepsitory.findAll();
	}

	@Override
	public Iterable<Ingenieur> findByNom(String nom) {
		// TODO Auto-generated method stub
		return ingenieurRepsitory.findByNom(nom);
	}

}
