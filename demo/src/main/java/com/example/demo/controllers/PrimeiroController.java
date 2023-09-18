package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	
	@GetMapping(path = "/ola")
	public String Ola() {
		return "hello everybadyyyy";
	}
	
//	@PostMapping(path = "/ola")
//	public String Saudacao() {
//		return "hello everybady(POST)";
//	}

}
