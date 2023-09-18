package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/calculadora")
public class DesafioCalculadoraController {
	
	@GetMapping(path = "/soma/{n1}/{n2}")
	public int soma(@PathVariable int n1,@PathVariable int n2) {
		return n1 + n2;
	}
	
	@GetMapping("/sub")
	public int sub(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b) {
		return a - b;
	}

}
