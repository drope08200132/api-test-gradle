package com.springboot.api.gradle.dao;

import java.util.List;

import com.springboot.api.gradle.model.Persona;

public interface PersonaDao {
	
	List<Persona> getAllPersonas();
	Persona getPersona(Integer id);
	void savePersona(Persona persona);
	void deletePersona(Integer id);

}
