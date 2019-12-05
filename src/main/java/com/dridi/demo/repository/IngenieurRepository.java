package com.dridi.demo.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

import com.dridi.demo.model.Ingenieur;

@Repository
public interface IngenieurRepository extends ElasticsearchCrudRepository<Ingenieur, Integer>{
List<Ingenieur> findByNom(String nom);
}
