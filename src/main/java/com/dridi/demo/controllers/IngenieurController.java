package com.dridi.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.ml.PostDataRequest.JsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dridi.demo.model.Ingenieur;
import com.dridi.demo.service.IngenieurService;

@RestController
public class IngenieurController {
	
	@Autowired
	IngenieurService ingenieurService;
	
	@PostMapping("/create")
	public String create(@RequestBody Ingenieur ingenieur) {
				  
		
		return ingenieurService.save(ingenieur);
		
	}
	@GetMapping("/list")
	public Iterable<Ingenieur> findAll() {
		return ingenieurService.findAll();
		
	}

}
