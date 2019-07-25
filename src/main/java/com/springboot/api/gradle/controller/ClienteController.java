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

import com.springboot.api.gradle.model.Cliente;
import com.springboot.api.gradle.service.impl.ClienteServiceImpl;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteServiceImpl _clienteService;
	
	@GetMapping(value = "/all", produces = "application/json")	
	public List<Cliente> getAllClientes(){
		return _clienteService.getAllClientes();
	}
	
	@GetMapping(value = "/get/{id}", produces = "application/json")	
	public Cliente getPersona(@PathVariable ("id") Integer id){
		return _clienteService.getCliente(id);
	}
	
	@PostMapping(value = "/save", produces = "application/json")	
	public List<Cliente> saveCliente(@RequestBody Cliente cliente){
		
		_clienteService.saveCliente(cliente);
		
		return _clienteService.getAllClientes();
	}	
	
	@DeleteMapping(value = "/delete/{id}", produces = "application/json")	
	public List<Cliente> deleteCliente(@PathVariable ("id") Integer id){
		
		_clienteService.deleteCliente(id);
		
		return _clienteService.getAllClientes();
	}	

}
