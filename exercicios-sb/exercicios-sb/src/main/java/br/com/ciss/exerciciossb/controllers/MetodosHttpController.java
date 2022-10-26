package br.com.ciss.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class MetodosHttpController {

	@GetMapping
	public String get() {
		return "Requisição GET";
	}
	
	@PostMapping
	public String post() {
		return "Requisião POST";
	}
	
	@PutMapping
	public String  put() {
		return "Requisição PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "Requisião PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";
	}
	

}
