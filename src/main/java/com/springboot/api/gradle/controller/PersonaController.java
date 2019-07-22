package com.springboot.api.gradle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.gradle.model.Persona;
import com.springboot.api.gradle.service.impl.PersonaServiceImpl;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaServiceImpl _personaService;
	
	@GetMapping(value = "/all", produces = "application/json")	
	public List<Persona> getAllPersonas(){
		return _personaService.getAllPersonas();
	}
	
	@GetMapping(value = "/get/{id}", produces = "application/json")	
	public Persona getPersona(@PathVariable ("id") Integer id){
		return _personaService.getPersona(id);
	}
	
	@PostMapping(value = "/save", produces = "application/json")	
	public List<Persona> savePersona(@RequestBody Persona persona){
		
		_personaService.savePersona(persona);
		
		return _personaService.getAllPersonas();
	}	
	
	@DeleteMapping(value = "/delete/{id}", produces = "application/json")	
	public List<Persona> deletePersona(@PathVariable ("id") Integer id){
		
		_personaService.deletePersona(id);
		
		return _personaService.getAllPersonas();
	}	

}
