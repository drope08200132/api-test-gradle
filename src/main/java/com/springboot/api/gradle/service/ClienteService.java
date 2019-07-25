package com.springboot.api.gradle.service;

import java.util.List;

import com.springboot.api.gradle.model.Cliente;
//import com.springboot.api.gradle.model.Persona;

public interface ClienteService {
	
	List<Cliente> getAllClientes();
	Cliente getCliente(Integer id);
	void saveCliente(Cliente cliente);
	void deleteCliente(Integer id);
	
}
