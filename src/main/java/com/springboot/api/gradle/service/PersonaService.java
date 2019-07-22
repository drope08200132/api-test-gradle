package com.springboot.api.gradle.service;

import java.util.List;

import com.springboot.api.gradle.model.Persona;

public interface PersonaService {
	
	List<Persona> getAllPersonas();
	Persona getPersona(Integer id);
	void savePersona(Persona persona);
	void deletePersona(Integer id);
	
}
