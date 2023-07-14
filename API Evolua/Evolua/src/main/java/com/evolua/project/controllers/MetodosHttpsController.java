package com.evolua.project.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/metodosManipulacao")
public class MetodosHttpsController {
	
	//adicionar anotação relacionada
	@GetMapping
	public String get() {
		return "Requisição GET - Evolua Sumare";
	}
	
	
	//adicionar anotação relacionada
	@PostMapping
	public String post() {
		return "Requisição POST - Evolua Sumare";
	}
	
	
	
	//adicionar anotação relacionada
	@PutMapping
	public String put() {
		return "Requisição PUT - Evolua Sumare";
	}
	
	
	
	//adicionar anotação relacionada
	@PatchMapping
	public String patch() {
		return "Requisição PATCH - Evolua Sumare";
	}
	
	
	
	//adicionar anotação relacionada
	@DeleteMapping
	public String delete() {
		return "Requisição DELETE - FAruk";
	}
	
	
	// nesse ponto, se cria um formulario para manipular caso nao tenha o Postman ou Insonmia
	//http://localhost:8080/formulario.html

}
