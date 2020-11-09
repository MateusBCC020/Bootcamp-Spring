package org.vestibulandosdacidadania.Learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vestibulandosdacidadania.Learn.repository.AulaRepository;

import org.vestibulandosdacidadania.Learn.model.Aula;

@RestController
@RequestMapping("/aula")
@CrossOrigin("*")
public class AulaController {
	
	@Autowired
	private AulaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Aula>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
}
