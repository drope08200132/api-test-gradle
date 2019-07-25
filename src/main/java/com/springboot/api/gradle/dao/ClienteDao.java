package com.springboot.api.gradle.dao;

import java.util.List;

import com.springboot.api.gradle.model.Cliente;

public interface ClienteDao {
	
	List<Cliente> getAllClientes();
	Cliente getCliente(Integer id);
	void saveCliente(Cliente cliente);
	void deleteCliente(Integer id);

}
