package com.springboot.api.gradle.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.gradle.dao.impl.ClienteDaoImpl;
import com.springboot.api.gradle.model.Cliente;
import com.springboot.api.gradle.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ClienteDaoImpl _personalDao;
	
	@Override
	public List<Cliente> getAllClientes() {
		
		return _personalDao.getAllClientes();
	}

	@Override
	public Cliente getCliente(Integer id) {
		
		return _personalDao.getCliente(id);
	}

	@Override
	public void saveCliente(Cliente cliente) {
		try {
			_personalDao.saveCliente(cliente);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}	
	}

	@Override
	public void deleteCliente(Integer id) {
		try {
			_personalDao.deleteCliente(id);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
	}

}
