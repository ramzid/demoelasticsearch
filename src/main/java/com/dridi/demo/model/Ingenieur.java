package com.dridi.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.stereotype.Component;

@Component

@Document(indexName = "ingenieur",type = "employee")
public class Ingenieur {
	@Id
	private int code;
	@Field
	private String nom;
	@Override
	public String toString() {
		return "Ingenieur [code=" + code + ", nom=" + nom + ", salaire=" + salaire + "]";
	}
	private String salaire;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSalaire() {
		return salaire;
	}
	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

}
