package br.com.ciss.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Calculadora")
public class CalculadoraController {
	
	@GetMapping("/Somar/{valor1}/{valor2}")
	public int Somar(@PathVariable int valor1, @PathVariable int valor2) {
		return valor1 + valor2;
	}
	
	@GetMapping("/Subtrair")
	public int Subtrair(
			@RequestParam(name = "valor1") int valor1, @RequestParam(name = "valor2") int valor2) {
		return (valor1 - valor2) * -1;
	}

}
